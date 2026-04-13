package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.AcpPage;
import io.qameta.allure.Step;
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
    public void readButtonCheck() {
        AcpPage.waitDownloadPage();
        assertTrue(AcpPage.readButtonCheckEnabled(), "Кнопка Read docs отсутствует");
    }

    @Test
    public void readButtonClickTest() {
        AcpPage.readButtonClick();
        AcpPage.waitDownloadPage();

    }
}
