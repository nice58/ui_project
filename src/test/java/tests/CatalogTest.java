package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.Variables;

import static io.qameta.allure.Allure.step;

public class CatalogTest extends TestBase {

    @DisplayName("Поиск товаров через строку поиска главной страницы")
    @Test
    @Tag("Smoke")
    void searchProductTest() {
        Variables variables = new Variables();

        step("Ввести тип товара в строку поиска", () -> {
            mainPage.openPage();
            mainPage.activeSearchInput();
            mainPage.choiceProduct(variables.productItem);

        });

        step("Проверить загрузку товаров", () -> {
            catalogPage.waitResults();
        });
    }
}
