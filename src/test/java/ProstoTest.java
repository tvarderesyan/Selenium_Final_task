//import Steps.*;
//import org.junit.Test;
//import ru.yandex.qatools.allure.annotations.Title;

//import java.util.HashMap;

/**
 * Created by MY on 31.01.2018.
 */
/**public class ProstoTest extends BaseSteps {
    @Title("Тест")
    @Test
    public void MyTest() {

        MainSteps mainSteps = new MainSteps();
        FilterSteps filterSteps = new FilterSteps();
        FindSteps findSteps = new FindSteps();
        SelectElectronicTypeSteps selectElectronicTypeSteps = new SelectElectronicTypeSteps();

        HashMap<String, String> testData = new HashMap<>();
        testData.put("Сумма", "2000");


        mainSteps.selectMainMenu("Маркет");
        mainSteps.selectSubMenu("Электроника");
        selectElectronicTypeSteps.chooseTypeTV();


        filterSteps.setSum(testData);
        filterSteps.setProducerTV();
        filterSteps.stepExecuteButton();
        findSteps.stepElementsCount();
        findSteps.searchByFirstElement();

        // findSteps.searchStep();
        // findSteps.fillField(fields);
        //   findSteps.setFindClick();
        //  findSteps.checkName();
    }

}*/
