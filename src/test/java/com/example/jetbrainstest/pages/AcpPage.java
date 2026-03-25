package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcpPage {
    WebDriver driver;
    @FindBy(xpath = "//span/text()[.= \"Read docs\"]")
    private WebElement readButton;
    String acpUrl = "https://agentclientprotocol.com/get-started/introduction";

    public AcpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean readButtonCheckEnabled() {
        return readButton.isEnabled();
    }

    public void readButtonClick() {
        readButton.click();
    }

    public void checkUrl() {
        String url = driver.getCurrentUrl();
        assertEquals(acpUrl, url, "Открылась неверная вкладка");
    }
}
