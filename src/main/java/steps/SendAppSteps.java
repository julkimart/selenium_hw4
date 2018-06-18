package steps;

import pages.InsurancePage;
import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class SendAppSteps{

    @Step("заголовок страницы - {0}")
    public void stepTitle2(String expectedTitle){
        String actualTitle = new SendAppPage().title2.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("выполнен выбор минимальной суммы")
    public void stepMinSumma(){
        new SendAppPage().minSumma.click();
    }

    @Step("выполнено нажатие на кнопку - Оформить")
    public void stepOformitButton(){
        new SendAppPage().oformitButton.click();
    }


}
