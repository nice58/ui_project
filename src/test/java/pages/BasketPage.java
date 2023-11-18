package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    SelenideElement quantity = $(".navbar-pc__notify"),
    productBasket = $(".basket-section__basket-list.basket-list"),
    deleteButton = $(".btn__del"),
    emptyBasket = $(".basket-page__basket-empty");

    public BasketPage checkBasketQuantity(String value) {
        quantity.shouldHave(text(value));

        return this;
    }

    public BasketPage deleteProduct() {
        productBasket.hover();
        deleteButton.click();

        return this;
    }

    public BasketPage checkEmptyBasket(String value) {
        emptyBasket.shouldHave(text(value));

        return this;
    }
}
