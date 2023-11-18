package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.ConfigReader;
import config.WebDriverConfig;
import config.WebDriverProvider;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.BasketPage;
import pages.CatalogPage;
import pages.MainPage;
import pages.components.AttachmentFile;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    private static final WebDriverConfig config = ConfigReader.Instance.read();

    MainPage mainPage = new MainPage();
    CatalogPage catalogPage = new CatalogPage();
    BasketPage basketPage = new BasketPage();


    @BeforeAll
    public static void beforeAll() {
        WebDriverProvider webDriverProvider = new WebDriverProvider(config);
        webDriverProvider.webDriverConfig();
        open("https://www.wildberries.ru/");
        Configuration.browserSize = "1920x1080";

}

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addArtefactsToReport() {
        AttachmentFile.screenshot("Screenshot");
        AttachmentFile.pageSource();
        AttachmentFile.consoleLogs();
        AttachmentFile.video();
    }
}
