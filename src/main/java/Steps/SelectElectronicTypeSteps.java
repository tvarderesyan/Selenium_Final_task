package Steps;


import pages.SelectElectronicType;
import ru.yandex.qatools.allure.annotations.Step;


/**
 * Created Varderesyan Tsolak MY on 26.01.2018.
 */
public class SelectElectronicTypeSteps extends BaseSteps {

    @Step("выбрано тип элуктроники Телевизор")
    public void chooseTypeTV() {

        new SelectElectronicType(driver).ElectronictypeTV.click();
    }

    @Step("выбрано тип элуктроники Наушники")
    public void chooseTypeHeadphones() {

        new SelectElectronicType(driver).ElectronictypeHeadphones.click();
    }
}