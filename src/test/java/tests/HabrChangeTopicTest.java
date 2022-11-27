package tests;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;

public class HabrChangeTopicTest extends TestBase {

    @BeforeEach
    void openMainPage() {
        open("https://habr.com");
    }

    @ValueSource(strings = {
            "Разработка",
            "Администрирование",
            "Дизайн",
            "Менеджмент",
            "Маркетинг",
            "Научпоп"})
    @ParameterizedTest(name = "Проверка перехода на тему {0} сайта habr.ru")
    @Tag("BLOCKER")//указываем критичность
    void topicChooseTest(String topic) {
        mainPage.chooseTopic(topic);
        topicPage.checkChoosingOfTopic(topic);
    }

    @Disabled //дизейблим тест
    @CsvFileSource(resources = "topic.csv")
    @ParameterizedTest(name = "Проверка перехода на тему {0} сайта habr.ru")
    @Tag("BLOCKER")//указываем критичность
    void topicChooseTest2(String topic) {
        mainPage.chooseTopic(topic);
        topicPage.checkChoosingOfTopic(topic);
    }

    static Stream<Arguments> topicChooseTest3() {
        return Stream.of(
                Arguments.of("Разработка"),
                Arguments.of("Администрирование"),
                Arguments.of("Дизайн"),
                Arguments.of("Менеджмент"),
                Arguments.of("Маркетинг"),
                Arguments.of("Научпоп")
        );
    }

    @MethodSource
    @ParameterizedTest(name = "Проверка перехода на тему {0} сайта habr.ru")
    @Tag("BLOCKER")//указываем критичность
    void topicChooseTest3(String topic) {
        mainPage.chooseTopic(topic);
        topicPage.checkChoosingOfTopic(topic);


    }
}
