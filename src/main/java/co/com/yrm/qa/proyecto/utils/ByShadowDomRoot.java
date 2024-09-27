package co.com.yrm.qa.proyecto.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;
import java.util.ArrayList;
import java.util.List;

public class ByShadowDomRoot extends By {
    private final By initialHost;
    private final String[] cssSelectors;

    // Constructor para aceptar XPath en el primer elemento y CSS para los demás
    private ByShadowDomRoot(By initialHost, String... cssSelectors) {
        this.initialHost = initialHost; // XPath para el primer elemento
        this.cssSelectors = cssSelectors; // CSS selectors para los inner shadow hosts
    }

    // Método estático para crear la instancia con XPath en el shadow host
    public static ByShadowDomRoot onBy(By hostXPath, String... cssSelectors) {
        return new ByShadowDomRoot(hostXPath, cssSelectors);
    }

    @Override
    public WebElement findElement(SearchContext context) {
        WebElement initialElement = context.findElement(this.initialHost); // Usando XPath para el shadow host
        SearchContext shadowRoot = initialElement.getShadowRoot();

        if (shadowRoot == null) {
            throw new NoSuchElementException("No element found matching ShadowDom selector: " + this.cssSelectors[0]);
        }

        WebElement finalElement = locateNestedElement(shadowRoot, 0);
        return finalElement;
    }

    @Override
    public List<WebElement> findElements(SearchContext context) {
        WebElement initialElement = context.findElement(this.initialHost);
        SearchContext shadowRoot = initialElement.getShadowRoot();

        if (shadowRoot == null) {
            throw new NoSuchElementException("No element found matching ShadowDom selector: " + this.cssSelectors[0]);
        }

        List<WebElement> finalElements = locateNestedElements(shadowRoot, 0);
        return finalElements;
    }

    // Método auxiliar para encontrar el elemento final anidado
    private WebElement locateNestedElement(SearchContext context, int index) {
        WebElement newParent = context.findElement(By.cssSelector(this.cssSelectors[index]));

        if (index + 1 < this.cssSelectors.length) {
            SearchContext shadowRoot = newParent.getShadowRoot();
            if (shadowRoot == null) {
                throw new NoSuchElementException("No shadow root found for selector: " + this.cssSelectors[index]);
            }
            return locateNestedElement(shadowRoot, index + 1);
        } else {
            return newParent;
        }
    }

    // Método auxiliar para encontrar todos los elementos anidados
    private List<WebElement> locateNestedElements(SearchContext context, int index) {
        List<WebElement> newParents = context.findElements(By.cssSelector(this.cssSelectors[index]));

        if (index + 1 < this.cssSelectors.length) {
            List<WebElement> finalElements = new ArrayList<>();
            for (WebElement parent : newParents) {
                SearchContext shadowRoot = parent.getShadowRoot();
                if (shadowRoot != null) {
                    finalElements.addAll(locateNestedElements(shadowRoot, index + 1));
                }
            }
            return finalElements;

        }else{
            return newParents;
        }
    }
}