import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageObject {
    private WebDriver driver;
    @BeforeClass
    public static void setupWebdriverChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
    }

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

public void openGoogleTranslator() {
open("https://www.google.com/");
 $("[type=text").setValue("калькулятор").sendKeys(Keys.ENTER);
        }

    }

