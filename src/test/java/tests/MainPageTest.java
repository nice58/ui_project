package tests;

import data.CurrencyName;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static io.qameta.allure.Allure.step;

public class MainPageTest extends TestBase {

    @DisplayName("Проверка открытия главной страницы")
    @Test
    @Tag("Smoke")
    void checkCorrectPageTest() {
        step("Проверить заголовок на странице", () -> {
            mainPage.checkTitle("Продавайте на Wildberries");
        });
    }

    @DisplayName("Проверка открытия чата поддержки")
    @Test
    @Tag("Smoke")
    void checkSupportWindowTest() {
        step("Открыть чат поддержки", () -> {
            mainPage.openSupportChat();
        });

        step("Проверить заголовок в окне чата", () -> {
            mainPage.checkSupportChat("Поддержка Wildberries");

        });
    }

    @DisplayName("Выбор валюты")
    @ParameterizedTest
    @Tag("Smoke")
    @EnumSource(CurrencyName.class)
    void choiceCurrencyTest(CurrencyName currencyName) {

        step("Открыть окно выбора валюты", () -> {
            mainPage.openCurrencyWindow();
        });
        step("Выбрать валюту", () -> {
            mainPage.changeCurrency(currencyName.getCurrency());
        });

        step("Проверить выбранную валюту", () ->
               mainPage.checkCurrency(currencyName.toString()));
    }

    @DisplayName("Проверка наличия QR-кода на главной странице")
    @Test
    @Tag("Smoke")
    void checkQrTest() {
        step("Прокрутить главную страницу вниз до конца", () -> {
            mainPage.scrollDownPage();
        });

        step("Проверить наличие QR-кода", () -> {
            mainPage.checkQr();
        });
    }
}


