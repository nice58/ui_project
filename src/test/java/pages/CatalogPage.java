package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class CatalogPage {
    SelenideElement results = $(".searching-results__count"),
    productCard = $(".product-card");


    public CatalogPage waitResults() {
        results.shouldBe(Condition.visible, Duration.ofSeconds(5));

        return this;
    }

    public CatalogPage addToBasket() {
        productCard.hover();
        String toBasket = "В корзину";
        $(byLinkText(toBasket)).click();

        return this;
    }

    public CatalogPage moveToBasket() {
        String inBasket = "В корзине";
        $(byLinkText(inBasket)).click();

        return this;
    }
}
