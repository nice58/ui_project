package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.Variables;

import static io.qameta.allure.Allure.step;

public class BasketTest extends TestBase {
    @DisplayName("Добавление товара в корзину")
    @Test
    @Tag("Smoke")
    void addProductTest() {
        Variables variables = new Variables();

        step("Найти товар", () -> {
            mainPage.openPage();
            mainPage.activeSearchInput();
            mainPage.choiceProduct(variables.productItem);

        });

        step("Добавить товар в корзину", () -> {
            catalogPage.addToBasket();

        });

        step("Перейти в корзину", () -> {
            catalogPage.moveToBasket();

        });

        step("Проверить количество товара в корзине", () -> {
            basketPage.checkBasketQuantity("1");

        });

    }

    @DisplayName("Удаление товара из корзины")
    @Test
    @Tag("Smoke")
    void deleteProductTest() {
        Variables variables = new Variables();

        step("Добавить товар в корзину", () -> {
            mainPage.openPage();
            mainPage.activeSearchInput();
            mainPage.choiceProduct(variables.productItem);
            catalogPage.addToBasket();

        });

        step("Перейти в корзину", () -> {
            catalogPage.moveToBasket();

        });

        step("Удалить товар из корзины", () -> {
            basketPage.deleteProduct();

        });

        step("Проверить, что корзина пуста", () -> {
            basketPage.checkEmptyBasket("В корзине пока пусто");

        });
    }
}
