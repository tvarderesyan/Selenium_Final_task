package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

/**
 * Created by MY on 03.02.2018.
 */
public class MyScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    FilterSteps filterSteps = new FilterSteps();
    FindSteps findSteps = new FindSteps();
    SelectElectronicTypeSteps selectElectronicTypeSteps = new SelectElectronicTypeSteps();

    @Когда("^выбран пункт меню \"(.*)\"$")
    public void stepSelectMainMenu(String menuItem) {

        mainSteps.selectMainMenu(menuItem);
    }

    @И("^выбран вид товара = \"(.*)\"$")
    public void stepSelectSubMenu(String menuItem) {

        mainSteps.selectSubMenu(menuItem);
    }

    @Когда("^выбран тип элуктроники Телевизор")
    public void stepChooseTypeTV(){
        selectElectronicTypeSteps.chooseTypeTV();
    }

    @Когда("^выбран тип элуктроники Наушники")
    public void stepChooseTypeHeadphones(){
        selectElectronicTypeSteps.chooseTypeHeadphones();
    }

    @Тогда("^Сумма от заполняется значением: $")
    public void stepFillFields(DataTable fields) {
        fields.asMap(String.class, String.class).forEach(
                (k, v) -> filterSteps.stepFillSum(k, v));
    }

    @И("^Выбираем произвадитель телевизора")
        public void stepSetProducerTV(){
        filterSteps.setProducerTV();
    }

    @И("^Выбираем произвадитель наушников")
    public void stepSetProducerEarphone(){
        filterSteps.setProducerEarphone();
    }

    @И("^Выполнено нажатие на кнопку Применить")
    public void stepSetExecuteButton(){
        filterSteps.stepExecuteButton();
    }

    @Тогда("^Выполнена проверка количество элементов на странице")
    public void setStepElementsCount(){
        findSteps.stepElementsCount();
    }

    @И("^вводим название первого товара в поле поиска$")
    public void setSearchByFirstElement(){
        findSteps.searchByFirstElement();
    }
    @И("^нажимаем кнопку Найти для поиска$")
    public void setStepSearchBustton() {
        findSteps.stepSearchBustton();
    }

    @Тогда("^в результатах поиска сравниваем названия товаров$")
    public void SetstepChekFindedElement(){

        findSteps.stepChekFindedElement();
    }

}
