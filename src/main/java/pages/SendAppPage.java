package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class SendAppPage {

    //название заголовка
    @FindBy(xpath = "(//H2[@class='l-header-title ng-binding'][text()='Страхование путешественников'][text()='Страхование путешественников'])[1]")
    public WebElement title2;

    @FindBy(xpath = "//DIV[@ng-click='setProdProg(prodProg)']")
    public WebElement minSumma;

    @FindBy(xpath = "//SPAN[@ng-click='save()'][text()='Оформить']")
    public WebElement oformitButton;

    public SendAppPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(),5, 1000);
        wait.until(ExpectedConditions.visibilityOf(minSumma));
        wait.until(ExpectedConditions.visibilityOf(oformitButton));
    }


}
