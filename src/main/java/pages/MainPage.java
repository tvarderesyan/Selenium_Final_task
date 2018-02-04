package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Varderesyan Tsolak on 21.01.2018.
 */
public class MainPage {

    @FindBy(xpath = "//div[contains(@class,'home-tabs')]")
    WebElement market;


    @FindBy(xpath = "//div[contains(@class,'topmenu i-bem topmenu_js_inited')]")
    WebElement electronics;

    public MainPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }


    public void selectmainMenu(String menuItem){
        market.findElement(By.xpath(".//a[contains(text(),'"+menuItem+"')]")).click();
    }

    public void selectsubMenu(String menuItem){
        electronics.findElement(By.xpath(".//a[contains(text(),'"+menuItem+"')]")).click();
    }

}