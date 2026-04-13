package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class AcpPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(AcpPage.class));
    WebDriver driver;

    @FindBy(xpath = "(//span[normalize-space()='Read docs'])[1]")
    public WebElement readButton;

    @FindBy(xpath = "(//span[text()='Read docs'])[1]")
    private WebElement acceptButton;

    public AcpPage(WebDriver driver) {
        LOG.info("Инициализация драйвера");
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean readButtonCheckEnabled() {
        LOG.infoWithScreenshot("Кнопка активна");
        return readButton.isEnabled();
    }

    public void readButtonClick() {
        LOG.infoWithScreenshot("Клик по кнопке Read docs");
        acceptButton.click();
        waitDownloadPage();
        readButton.click();
    }

    public void waitDownloadPage() {
        LOG.infoWithScreenshot("Ожидание элемента на странице");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(readButton));
    }
}
