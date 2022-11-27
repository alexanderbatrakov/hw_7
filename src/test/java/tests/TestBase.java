package tests;

import Pages.MainPage;
import Pages.TopicPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    MainPage mainPage = new MainPage();
    TopicPage topicPage = new TopicPage();
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
}