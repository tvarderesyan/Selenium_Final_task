package Steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Varderesyan Tsolak on 22.01.2018.
 */
public class MainSteps extends BaseSteps {

    @Step("выбран пункт меню {0}")
    public void selectMainMenu(String menuItem){

        new MainPage(driver).selectmainMenu(menuItem);
    }

    @Step("выбран вид товара {0}")
    public void selectSubMenu(String menuItem){

        new MainPage(driver).selectsubMenu(menuItem);
    }

}
