package pages;


import Steps.BaseSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Varderesyan Tsolak on 21.01.2018.
 */
public class FindPage extends BaseSteps {

    @FindBy(xpath = "//DIV[contains(@class,'n-snippet-card2__title')][1]")
    public WebElement firsElement;

    @FindBy(xpath = "//INPUT[contains(@id,'header-search')]")
    public WebElement search;

    @FindBy(xpath = "(//BUTTON[@role='button'])[1]")
    public WebElement findClick;

    @FindBy(xpath = "//DIV[contains(@class,'n-snippet-card2__title')][1]")
    public WebElement findedElement;


    protected void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public FindPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
}
