package UsingSelenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPageZapGuruTest extends AbstractClass {

    @Test
    @DisplayName("1.Кликабельность 'Локации' на главной странице ZapGuru.ru")
    void get_AvailableClickToLocationButton() {
        driver.get("https://zapguru.ru/");
        MainPageZapGuru mainPageZapGuru = new MainPageZapGuru(driver);
        mainPageZapGuru.click_Location();
        WebElement searchElement = driver.findElement(By.xpath("//div[@class='dialog']/h1"));
        Assertions.assertEquals("Страница, которую вы ищете, не существует.", searchElement.getText());
    }

    @Test
    @DisplayName("2.Переход на страницу 'О компании' при клике на меню Клиентам и выборе первой вкладки в DropDown меню")
    void get_AvailableMenuWhenPressButtonToClients() {
        driver.get("https://zapguru.ru/");
        MainPageZapGuru mainPageZapGuru = new MainPageZapGuru(driver);
        mainPageZapGuru.getDropdownToClients().click();
        WebElement aboutCompany = driver.findElement(By
                .xpath("//div[@class='b-tpc-cols']//*[contains(text(),'О компании')]"));
        aboutCompany.click();
        WebElement maintitle = driver.findElement(By.xpath("//h1[@class='main-title']"));
        Assertions.assertEquals("ZapGuru.ru - онлайн маркет для автомобилей.", maintitle.getText());
    }

}
