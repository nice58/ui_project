package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class MainPage {
    SelenideElement header = $(".header__top"),
            supportChat = $(".smm-fixed__toggle[aria-label='Онлайн чат']"),
            supportChatHeader = $(".chat__text"),
            searchInput = $("#searchInput"),
            currency = $(".simple-menu__currency"),
            pageBody =  $("body.ru"),
            qr = $(".footer-apps__img"),
            closeChat = $(".chat__btn-close");



    ElementsCollection
            currencyName = $$(".radio-with-text__name");



    public MainPage openPage() {
        open("/");

        return this;
    }

    public MainPage checkTitle(String value) {
        header.shouldHave(text(value));

        return this;
    }

    public MainPage openSupportChat() {
        supportChat.click();

        return this;
    }

    public MainPage checkSupportChat(String value) {
        supportChatHeader.shouldHave(text(value));

        return this;
    }

    public MainPage closeSupportChat() {
        closeChat.click();

        return this;
    }

    public MainPage activeSearchInput() {
        searchInput.click();

        return this;
    }

    public MainPage choiceProduct(String value) {
        searchInput.setValue(value).pressEnter();


        return this;
    }

    public MainPage openCurrencyWindow() {
        currency.hover();

        return this;
    }

    public MainPage changeCurrency(String value) {
        currencyName.findBy(text(value)).click();

        return this;
    }

    public void checkCurrency(String value) {
        currency.shouldHave(text(value));

    }

    public MainPage scrollDownPage() {
        pageBody.sendKeys(Keys.CONTROL, Keys.END);

        return this;
    }

    public void checkQr() {
        qr.shouldBe(Condition.visible);

    }
}
