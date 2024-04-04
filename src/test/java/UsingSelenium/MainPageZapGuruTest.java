package UsingSelenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPageZapGuruTest extends AbstractClass {

    @Test
    @DisplayName("1. Кликабельность 'Локации' на главной странице ZapGuru.ru")
    void get_AvailableClickToLocationButton()  {
        driver.get("https://zapguru.ru/");
        MainPageZapGuru mainPageZapGuru = new MainPageZapGuru(driver);
        mainPageZapGuru.click_Location();
        WebElement searchElement = driver.findElement(By.xpath("//div[@class='dialog']/h1"));
        Assertions.assertEquals("Страница, которую вы ищете, не существует.",searchElement.getText());
    }
}
