package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Varderesyan Tsolak on 24.01.2018.
 */
public class SelectElectronicType {

    @FindBy(xpath = "//A[@class='link catalog-menu__list-item metrika i-bem metrika_js_inited'][text()='Телевизоры']")
    public WebElement ElectronictypeTV;

    @FindBy(xpath = "(//A[@class='link catalog-menu__list-item metrika i-bem metrika_js_inited'][text()='Наушники и Bluetooth-гарнитуры'][text()='Наушники и Bluetooth-гарнитуры'])[2]")
    public WebElement ElectronictypeHeadphones;


    public SelectElectronicType(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

}
