package Pages;

import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public MainPage chooseTopic(String topic) {
        $$(".tm-main-menu__section a").find(text(topic)).click();

        return this;
    }
}
