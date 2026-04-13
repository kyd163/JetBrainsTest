package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class AcpPage {
    private final Logger LOG = LoggerFactory.getLogger(AcpPage.class);
    WebDriver driver;

    @FindBy(xpath = "(//span[normalize-space()='Read docs'])[1]")
    public WebElement readButton;

    @FindBy(xpath = "(//span[text()='Read docs'])[1]")
    private WebElement acceptButton;
//    String acpUrl = "https://agentclientprotocol.com/get-started/introduction";


    public AcpPage(WebDriver driver) {
        LOG.info("Инициализация драйвера");
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean readButtonCheckEnabled() {
        LOG.info("Кнопка активна");
        return readButton.isEnabled();
    }

    public void readButtonClick() {
        LOG.info("Клик по кнопке Read docs");
        acceptButton.click();
        waitDownloadPage();
        readButton.click();
    }

//    public void checkUrl() {
//        String url = driver.getCurrentUrl();
//        assertEquals(acpUrl, url, "Открылась неверная вкладка");
//    }

    public void waitDownloadPage() {
        LOG.info("Ожидание элемента на странице");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(readButton));
    }
}
