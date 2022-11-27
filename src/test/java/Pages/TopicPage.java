package Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TopicPage {
    public TopicPage checkChoosingOfTopic(String topic) {
        $(".tm-section-name h1").shouldHave(text(topic));
        return this;
    }

}
