package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverSettings {

   public static WebDriver driver;

   public static void setup(String website) {
      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
      options.addArguments("disable-infobars");
      driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get(website);
   }
}
