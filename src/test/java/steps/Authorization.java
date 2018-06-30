package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utils.DriverSettings;

public class Authorization {

    LoginPage loginPage = new LoginPage();
    DriverSettings driverSettings = new DriverSettings();

    @Given("^Я нахожусь на \"([^\"]*)\"$")
    public void я_нахожусь_на(String website){
        driverSettings.setup(website);
    }

    @Given("^Я должен увидеть окно логина в почту$")
    public void я_должен_увидеть_окно_логина_в_почту() {
        loginPage.MailAuthWindow();
    }

    @When("^Я заполняю данные для входа$")
    public void я_заполняю_данные_для_входа() {
        loginPage.loginAs();
    }

    @Then("^Я вижу сообщение \"([^\"]*)\"$")
    public void я_вижу_сообщение(String message) {
        loginPage.ErrorMessage(message);
    }
}
