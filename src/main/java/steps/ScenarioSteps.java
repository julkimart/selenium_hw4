package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    InsuranceSteps insuranceSteps = new InsuranceSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();
    SendApp2Steps sendApp2Steps = new SendApp2Steps();


   /* @When("^выбран пункт меню \"(.+)\"$")
    public void stepSelectMainMenu(String menuItem) {
       mainSteps.stepSelectMainMenu(menuItem);
    }

    @When("^выбран вид страхования - \"(.+)\"$")
    public void stepSelectSubMenu(String menuItem){
        mainSteps.stepSelectSubMenu(menuItem);
    }

    @Then("^заголовок страницы - \"(.+)\"$")
    public void stepTitle(String title){
        insuranceSteps.stepTitle(title);
    }
*/



    @When("^выполнено нажатие на кнопку - оформить онлайн")
    public void stepSendAppBtn(){
        insuranceSteps.stepSendAppBtn();
    }

    @When("^переход на другое окно")
    public void stepSwitchWindow(){
        insuranceSteps.stepSwitchWindow();
    }

    @Then("^заголовок страницы2 - \"(.+)\"$")
    public void stepTitle2(String title2){
        sendAppSteps.stepTitle2(title2);
    }

    @When("^выполнен выбор минимальной суммы")
    public void stepMinSumma(){
        sendAppSteps.stepMinSumma();
    }
    @When("^выполнено нажатие на кнопку - Оформить")
    public void stepOformitButton(){
        sendAppSteps.stepOformitButton();
    }

    @Then("^заголовок страницы3 - \"(.+)\"$")
        public void stepTitle3(String title3){
            sendApp2Steps.stepTitle3(title3);
    }


    @When("^заполняются поля:$")
    public void stepFillFields(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((key, value) -> sendApp2Steps.stepFillField(key, value));
    }
    @Then("^значения полей равны:$")
    public void stepCheckFillFields(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((key, value) -> sendApp2Steps.stepCheckFillField(key, value));
    }

    @When("^выполнено нажатие на кнопку - Продолжить")
    public void stepProdolzhitButton(){
        sendApp2Steps.stepProdolzhitButton();
    }
    @Then("^текст ошибка о пустых контактных данных - \"(.+)\"$")
    public void stepPhone(String expectedPhone){
        sendApp2Steps.stepPhone(expectedPhone);
    }
}
