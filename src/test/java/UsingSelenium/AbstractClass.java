package UsingSelenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class AbstractClass {
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeAll
    static void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        // chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}