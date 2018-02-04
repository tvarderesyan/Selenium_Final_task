package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Varderesyan Tsolak on 21.01.2018.
 */
public class FilterPage {

    @FindBy(name = "glf-pricefrom-var")
    public WebElement sum;

    @FindBy(xpath = "//LABEL[@class='checkbox__label'][text()='Samsung']")
    public WebElement sumsung;

    @FindBy(xpath = "//LABEL[@class='checkbox__label'][text()='LG']")
    public WebElement lg;

    @FindBy(xpath = "//LABEL[@class='checkbox__label'][text()='Beats']")
    public WebElement beats;

    @FindBy(xpath = "//BUTTON[contains(@class,'button_action_n-filter-apply')]")
    public WebElement executeButton;


    public void sumForFind(String fieldName, String value) {
        switch (fieldName) {

            case "Сумма":
                sumForFind(sum, value);
                break;

            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

    protected void sumForFind(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public FilterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}