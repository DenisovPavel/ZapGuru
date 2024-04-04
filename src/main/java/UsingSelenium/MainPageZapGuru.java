package UsingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageZapGuru {

    public MainPageZapGuru(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    /**
     * @params locationButton обозначение локации
     */
    @FindBy(css = "div.b-region-col")
    private WebElement locationButton;

    /**
     * @params dropdownToClients выпадающий список Клиентам
     */

    @FindBy(css = "li.dropdown")
    private WebElement dropdownToClients;      //!!!

    /**
     * @params buttonContacts кнопка Контакты
     */

    @FindBy(xpath = "//*[@href='/contacts']")   //!!!
    private WebElement buttonContacts;

    /**
     * @params vinQueries кнопка Vin Запрос
     */

    @FindBy(css = "//*[contains(text(),'Vin запрос')]")
    private WebElement vinQueries;

    /**
     * @params buttonLogin кнопка Вход
     */

    @FindBy(css = "//*[@href='/login']")
    private WebElement buttonLogin;

    /**
     * @params buttonRegistration кнопка Регистрация
     */

    @FindBy(css = "//*[@href='/customers/new']")
    private WebElement buttonRegistration;         //!!!


    /**
     * @params buttonBasket Кнопка 'Корзина'
     */

    @FindBy(css = "a.b-basket-link")
    private WebElement buttonBasket;


    /**
     * @params buttonCatalogToggler каталог товаров
     */

    @FindBy(css = "//*[@class='b-catalog-toggler']")
    private WebElement buttonCatalogToggler;

    /**
     * @params inputSearch Поле Поиск
     */

    @FindBy(css = "//*[@class='b-input-search']")
    private WebElement inputSearch;

    /**
     * @params buttonFindInInputSearch Кнопка 'Найти' в поле поиск
     */

    @FindBy(css = "//button[@class='b-btn-send']")
    private WebElement buttonFindInInputSearch;

    /**
     * @params buttonReviews посмотреть все отзывы
     */

    @FindBy(css = "//*[@class='b-show-all-reviews']")
    private WebElement buttonReviews;

    /**
     * @params fieldNameInFooter  поле 'Имя' в футере
     */

    @FindBy(css = "//input[@name='review[name]']")
    private WebElement fieldNameInFooter;


    /**
     * @params fieldCityInFooter поле 'Город' в футере
     */

    @FindBy(css = "//input[@name='review[city]']")
    private WebElement fieldCityInFooter;


    /**
     * @params fieldTextArea поле 'Сообщение' в футере
     */

    @FindBy(css = "//textarea[@name='review[body]']")
    private WebElement fieldTextArea;


    /**
     * @params buttonVKInFooter Кнопка ВК в футере
     */

    @FindBy(css = "")
    private WebElement buttonVKInFooter;

    /**
     * @params buttonTelegramInFooter Кнопка Телега в футере
     */

    @FindBy(css = "")
    private WebElement buttonTelegramInFooter;

    /**
     * @params buttonViberInFooter Кнопка Вайбер в футере
     */

    @FindBy(css = "")
    private WebElement buttonViberInFooter;

    /**
     * @params buttonWhatsUpInFooter  Кнопка Вацап в футере
     */

    @FindBy(xpath = "//img[@data-src='/images/whatsapp.svg']")
    private WebElement buttonWhatsUpInFooter;                          // !!!!

    /**
     * @params buttonCallBackRequest Кнопка Заказать звонок
     */

    @FindBy(xpath = "//*[@data-toggle='modal']")
    private WebElement buttonCallBackRequest;

    public WebElement getLocationButton() {
        return locationButton;
    }

    public WebElement getDropdownToClients() {
        return dropdownToClients;
    }

    public WebElement getButtonContacts() {
        return buttonContacts;
    }

    public WebElement getVinQueries() {
        return vinQueries;
    }

    public WebElement getButtonLogin() {
        return buttonLogin;
    }

    public WebElement getButtonRegistration() {
        return buttonRegistration;
    }

    public WebElement getButtonBasket() {
        return buttonBasket;
    }

    public WebElement getButtonCatalogToggler() {
        return buttonCatalogToggler;
    }

    public WebElement getInputSearch() {
        return inputSearch;
    }

    public WebElement getButtonFindInInputSearch() {
        return buttonFindInInputSearch;
    }

    public WebElement getButtonReviews() {
        return buttonReviews;
    }

    public WebElement getFieldNameInFooter() {
        return fieldNameInFooter;
    }

    public WebElement getFieldCityInFooter() {
        return fieldCityInFooter;
    }

    public WebElement getFieldTextArea() {
        return fieldTextArea;
    }

    public WebElement getButtonVKInFooter() {
        return buttonVKInFooter;
    }

    public WebElement getButtonTelegramInFooter() {
        return buttonTelegramInFooter;
    }

    public WebElement getButtonViberInFooter() {
        return buttonViberInFooter;
    }

    public WebElement getButtonWhatsUpInFooter() {
        return buttonWhatsUpInFooter;
    }

    public WebElement getButtonCallBackRequest() {
        return buttonCallBackRequest;
    }
     public void click_Location(){
        locationButton.click();
     }
}
