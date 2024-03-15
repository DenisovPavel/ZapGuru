package UsingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageZapGuru {
    WebDriver driver = new ChromeDriver();

    public MainPageZapGuru() {
        PageFactory.initElements(driver, this);
    }


    /**
     * @params  locationButton обозначение локации
     */
    @FindBy(css = "div.b-region-col")
    private WebElement locationButton;

    @FindBy(css = "")
    private WebElement dropdownToClients; // выпадающий список Клиентам

    @FindBy(css = "")
    private WebElement buttonContacts; // кнопка Контакты

    @FindBy(css = "")
    private WebElement vinQueries;  // кнопка Vin Запрос

    @FindBy(css = "")
    private WebElement buttonLogin;  // кнопка Вход

    @FindBy(css = "")
    private WebElement buttonRegistration;  // кнопка Регистрация

    @FindBy(css = "")
    private WebElement buttonCatalogToggler; // каталог товаров

    @FindBy(css = "")
    private WebElement inputSearch; // Поле Поиск

    @FindBy(css = "")
    private WebElement buttonFindInInputSearch; // Кнопка найти в поле поиск

    @FindBy(css = "")
    private WebElement buttonToClientsInFooter; // кнопка клиента в футере

    @FindBy(css = "")
    private WebElement buttonContactsInFooter;// Кнопка Контакты в футере

    @FindBy(css = "")
    private WebElement buttonVKInFooter; // Кнопка ВК в футере

    @FindBy(css = "")
    private WebElement buttonTelegramInFooter; // Кнопка Телега в футере

    @FindBy(css = "")
    private WebElement buttonViberInFooter; // Кнопка Вайбер в футере

    @FindBy(css = "")
    private WebElement buttonWhatsUpInFooter; // Кнопка Вацап в футере

    @FindBy(css = "")
    private WebElement buttonCallBackRequest; // Кнопка Заказать звонок
}
