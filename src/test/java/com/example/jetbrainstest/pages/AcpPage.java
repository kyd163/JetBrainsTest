package com.example.jetbrainstest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcpPage {
    WebDriver driver;
    @FindBy(xpath = "(//span[normalize-space()='Read docs'])[1]")
    public WebElement readButton;
    @FindBy(xpath = "//*[@id=\"ch2-dialog\"]/div[3]/button[1]")
            private WebElement acceptButton;
    String acpUrl = "https://agentclientprotocol.com/get-started/introduction";


    public AcpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean readButtonCheckEnabled() {
        return readButton.isEnabled();
    }

    public void readButtonClick() {
        acceptButton.click();
        waitDownloadPage();
        readButton.click();
    }

//    public void checkUrl() {
//        String url = driver.getCurrentUrl();
//        assertEquals(acpUrl, url, "Открылась неверная вкладка");
//    }

    public void waitDownloadPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(readButton));
    }
}
