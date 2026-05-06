package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.AcpPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(AcpPageExtension.class)
public class AcpPageTest extends BaseTest {
    private AcpPage acpPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/acp/");
        acpPage = new AcpPage(getDriver());
    }

    @Test
    @DisplayName("Проверка адреса страницы")
    public void checkAcpUrl() {
        acpPage.checkUrl();
    }

    @Test
    @DisplayName("Проверка наличия первой кнопки ReadDocs")
    public void readButtonCheck() {
        acpPage.readFirstButtonCheckEnabled();
        assertTrue(acpPage.readFirstButtonCheckEnabled(), "Первая кнопка ReadВocs отсутствует");
    }

    @Test
    @DisplayName("Нажатие на первую кнопку ReadDocs")
    public void readButtonClickTest() {
        acpPage.readFirstButtonClick();
    }

    @Test
    @DisplayName("Проверка наличия второй кнопки ReadDocs")
    public void readTwoButtonCheck() {
        acpPage.readTwoButtonCheckEnabled();
        assertTrue(acpPage.readTwoButtonCheckEnabled(), "Вторая кнопка ReadDocs отсутствует");
    }

    @Test
    @DisplayName("Нажатие на вторую кнопку ReadDocs")
    public void readTwoButtonClickTest() {
        acpPage.readTwoButtonClick();
    }

    @Test
    @DisplayName("Проверка наличие кнопки Junie by JetBrains")
    public void junieButtonCheckTest() {
        acpPage.junieButtonCheck();
    }

    @Test
    @DisplayName("Нажатие на кнопку Junie by JetBrains")
    public void junieButtonClickTest() {
        acpPage.junieButtonClick();
    }

    @Test
    @DisplayName("Проверка наличия первой кнопки Explore the full list")
    public void fullListFirstButtonCheckTest() {
        acpPage.fullListFirstButtonCheck();
    }

    @Test
    @DisplayName("Нажатие на первую кнопку Explore the full list")
    public void fullListFirstButtonClickTest() {
        acpPage.fullListFirstButtonClick();
    }

    @Test
    @DisplayName("Проверка наличия второй кнопки Explore the full list")
    public void fullListTwoButtonCheckTest() {
        acpPage.fullListTwoButtonCheck();
    }

    @Test
    @DisplayName("Нажатие на вторую кнопку Explore the full list")
    public void fullListTwoButtonClickTest() {
        acpPage.fullListTwoButtonClick();
    }

    @Test
    @DisplayName("Открытие блога UsingAcp и проверка видимости кнопки")
    public void usingAppBlogTest() {
        acpPage.usingAcpBlog();
    }

    @Test
    @DisplayName("Нажатие на кнопку ExploreMore")
    public void exploreButtonClickTest() {
        acpPage.exploreButtonClick();
    }

    @Test
    @DisplayName("Открытие блога CursorJoined и проверка видимости кнопки")
    public void cursorJoinedBlogTest() {
        acpPage.cursorJoinedBlog();
    }

    @Test
    @DisplayName("Открытие блога Koog и проверка видимости кнопки")
    public void koogBlogTest() {
        acpPage.koogBlog();
    }

    @Test
    @DisplayName("Иконка стрелочки")
    public void nextButtonTest() {
        acpPage.buttonNext();
    }

    @Test
    @DisplayName("Запуск видео")
    public void playVideoTest() {
        acpPage.playVideo();
    }

    @Test
    @DisplayName("Изменение названия кнопки Country, после смены страны")
    public void countryButtonTest() {
        acpPage.countryButton();
    }
}

