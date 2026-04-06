package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.AcpPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AcpPageTest extends BaseTest {
    private AcpPage AcpPage;


    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/acp/");
        AcpPage = new AcpPage(getDriver());
    }

    @Test
    @DisplayName("Проверка наличия кнопки Read docs")
    public void readButtonCheck() {
        AcpPage.waitDownloadPage();
        assertTrue(AcpPage.readButtonCheckEnabled(), "Кнопка Read docs отсутствует");
    }

    @Test
    @DisplayName("Нажатие на кнопку Read docs")
    public void readButtonClickTest() {
        AcpPage.readButtonClick();
        AcpPage.waitDownloadPage();
//        AcpPage.checkUrl();
    }
}
