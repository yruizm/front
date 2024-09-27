package co.com.yrm.qa.proyecto.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;

public class ShadowRootWithSelector extends PageObject {

    public WebElement findElemt(String shadowSelector, String elemetInShadowSelector) {
        final WebElement shadowHost = getDriver().findElement(By.cssSelector(shadowSelector));
        final SearchContext shadowRoot = shadowHost.getShadowRoot();
        return shadowRoot.findElement(By.cssSelector(elemetInShadowSelector));
    }

    public void type(String shadowSelector,String elemetInShadowSelector,String StrType) {
        findElemt(shadowSelector, elemetInShadowSelector).sendKeys(StrType);
    }

    public void click(String shadowSelector,String elemetInShadowSelector) {
        findElemt(shadowSelector, elemetInShadowSelector).click();
    }




}
