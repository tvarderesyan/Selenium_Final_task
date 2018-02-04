package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;
import java.util.List;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


/**
 * Created by Varderesyan Tsolak on 22.01.2018.
 */
public class FindSteps extends BaseSteps {

    private String firstElementText;

    @Step("Проверка количество элементов на странице")
    public void stepElementsCount() {
        List<WebElement> elementList = driver.findElements(By.xpath(".//div[contains(@class,'n-snippet-card2__title')]"));
        assertThat(12, equalTo(elementList.size()));
    }

    @Step("Поиск по первому элементу")
    public void searchByFirstElement() {
        WebElement firstElement = driver.findElement(By.xpath("//DIV[contains(@class,'n-snippet-card2__title')][1]"));
        firstElementText = firstElement.getText();
        driver.findElement(By.cssSelector("input#header-search")).sendKeys(firstElementText);

    }

    @Step("Поиск по названию первого элемента")
    public void stepSearchBustton() {

        driver.findElement(By.xpath("(//BUTTON[@role='button'])[1]")).click();
    }

    @Step("Сравнивание названия товаров")
    public void stepChekFindedElement() {

        WebElement findedElement = (driver.findElement(By.xpath("//h1[contains(@class,'title title_size_28 title_bold_yes')]")));
        String findedElementText = findedElement.getText();
        //assertThat(firstElementText, equalTo(findedElementText));

       assertTrue(String.format("Название выбранного товара [%s]. Название найденного товара - [%s]",
          firstElementText, findedElementText), firstElementText.contains(findedElementText));
    }
}
