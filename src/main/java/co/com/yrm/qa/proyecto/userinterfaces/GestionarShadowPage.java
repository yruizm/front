package co.com.yrm.qa.proyecto.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GestionarShadowPage extends PageObject {


    private WebElement getShadowRootElement(String shadowHostSelector) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        WebElement shadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(shadowHostSelector)));
        System.out.println("Shadow Host: " + shadowHost);
        if (shadowHost == null) {
            throw new NoSuchElementException("No se encontró el elemento con el selector: " + shadowHostSelector);
        }
        //Usar JavaScript para obtener el shadowRoot
        WebElement shadowRoot = (WebElement) ((JavascriptExecutor) getDriver()).executeScript("return arguments[0].shadowRoot", shadowHost);

        System.out.println("Shadow Root: " + shadowRoot);
        return shadowRoot;
    }


    public WebElement getInputField(String shadowSelector,String elemetInShadowSelector) {
        WebElement shadowRoot = getShadowRootElement(shadowSelector);
        return shadowRoot.findElement(By.cssSelector(elemetInShadowSelector));
    }

    public void enterKeyValue(String shadowSelector,String elemetInShadowSelector,String username) {
        WebElement inputElement = getInputField(shadowSelector,elemetInShadowSelector);
        inputElement.sendKeys(username);
    }

    public static final Target TXT_USUARIO = Target.the("Pais Residencia")
            .located(By.id("username-input"));

    public static final Target TXT_CLAVE = Target.the("Pais Residencia")
            .located(By.id("password-input"));

    public static final Target BTN_INGRESAR = Target.the("Pais Residencia")
            .located(By.id("login-submit"));

//gestionarShadowPage.enterKeyValue("input-atom#username","#username-input","admin@siigoautomationqa.com");
    public WebElement fileMenu(String shadowSelector,String elemetInShadowSelector) {
        final WebElement shadowHost = getDriver().findElement(By.cssSelector(shadowSelector));
        final SearchContext shadowRoot = shadowHost.getShadowRoot();
        return shadowRoot.findElement(By.cssSelector(elemetInShadowSelector));
    }

    public void ShadowIterator() {


    }



    public SearchContext expandRootElement(final WebElement element) {
        return (SearchContext) ((JavascriptExecutor) getDriver()).executeScript("return arguments[0].shadowRoot", element);
    }

    public void typeM(String shadowSelector,String elemetInShadowSelector,String StrType) {
        fileMenu(shadowSelector, elemetInShadowSelector).sendKeys(StrType);
    }

    public void click(String shadowSelector,String elemetInShadowSelector) {
        fileMenu(shadowSelector, elemetInShadowSelector).click();
    }



}
