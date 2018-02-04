package Steps;

import pages.FilterPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;


/**
 * Created by Varderesyan Tsolak on 22.01.2018.
 */
public class FilterSteps extends BaseSteps {

    @Step("Сумма от заполняется значением {0}")
    public void stepFillSum(String field, String value) {
        new FilterPage(driver).sumForFind(field, value);
    }

    @Step("Сумма от для поиска - {0}")
    public void setSum(HashMap<String, String> fields) {
        fields.forEach(this::stepFillSum);
    }

    @Step("Выбрано произвадитель телевизора")
    public void setProducerTV() {
        new FilterPage(driver).sumsung.click();
        new FilterPage(driver).lg.click();
    }

    @Step("Выбрано произвадитель наушников")
    public void setProducerEarphone(){
        new FilterPage(driver).beats.click();
    }

    @Step("Выполнено нажатие на кнопку Применить")
    public void stepExecuteButton() {
               new FilterPage(driver).executeButton.click();

    }

}
