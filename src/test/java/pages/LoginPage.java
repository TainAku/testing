package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverSettings;

public class LoginPage extends DriverSettings {

    private final String AUTH_WINDOW_CSS = "#auth > div.mailbox__head > a:nth-child(1)";
    private final String LOGIN_FIELD_ID = "mailbox:login";
    private final String PASSWORD_FIELD_ID = "mailbox:password";
    private final String LOGIN_BUTTON_ID = "mailbox:submit";
    private final String ERROR_MESSAGE_ID = "mailbox:error";

    public void loginAs() {
        WebElement loginField = driver.findElement(By.id(LOGIN_FIELD_ID));
        loginField.sendKeys("Всем Приветики :)");
        WebElement passwordField = driver.findElement(By.id(PASSWORD_FIELD_ID));
        passwordField.sendKeys("testpassword");
        driver.findElement(By.id(LOGIN_BUTTON_ID)).click();
    }

    public void MailAuthWindow() {
        WebElement element=driver.findElement(By.cssSelector(AUTH_WINDOW_CSS));
        String text = element.getText();
        System.out.println("Пользователь видит окно: " + text);
    }

    public void ErrorMessage(String message) {
        WebElement element = driver.findElement(By.id(ERROR_MESSAGE_ID));
        element.getText().equals(message);
    }
}
