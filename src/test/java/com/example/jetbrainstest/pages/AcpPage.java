package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.example.jetbrainstest.MyWait.myWait;

public class AcpPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(AcpPage.class));
    WebDriver driver;
    String acpUrl = "https://www.jetbrains.com/acp/";

    @FindBy(xpath = "(//span[text()='Read docs'])[1]")
    public WebElement readFirstButton;

    @FindBy(xpath = "(//*[@id=\"ch2-dialog\"]//button[1]")
    private WebElement acceptButtonCookie;

    @FindBy (xpath = "(//span[text()='Read docs'])[2]")
    private WebElement readTwoButton;

    @FindBy (xpath = "//h4[text()='Junie by JetBrains']")
    private WebElement junieButton;

    @FindBy(xpath = "(//a[text()='Explore the full list'])[1]")
    private WebElement fullListFirstButton;

    @FindBy(xpath = "(//a[text()='Explore the full list'])[1]")
    private WebElement fullListTwoButton;

    @FindBy(xpath = "//h3[contains(text(),'ACP + Deep Agents')]")
    private WebElement usingAcpButton;

    @FindBy(xpath = "[class=\"btn\"]")
    private WebElement exploreButton;

    @FindBy(xpath = "//h3[contains(text(),'Cursor Joined the ACP Registry')]")
    private WebElement cursorJoinedButton;

    @FindBy(xpath = "//h3[contains(text(),'Koog x ACP')]")
    private WebElement koogButton;

    @FindBy(xpath = "//button[@data-test='next-button']")
    private WebElement nextButton;

    @FindBy(xpath = "//button[@aria-label='Play video']")
    private WebElement playButton;

    @FindBy (xpath = "//span[text()='United States']")
    private WebElement unitedStatesButton;

    @FindBy (xpath = "//svg[@data-test='down-icon']")
    private WebElement dropDown;

    @FindBy (xpath = "//span[text()='Australia']")
    private WebElement elementOfDropDown;

    @FindBy (css = "button.footer-choose-button")
    private WebElement chooseButton;

    @FindBy (xpath = "//span[text()='Australia']")
    private WebElement australiaButton;



    public AcpPage(WebDriver driver) {
        LOG.info("Инициализация драйвера");
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean readFirstButtonCheckEnabled() {
        LOG.infoWithScreenshot("Первая кнопка ReadDocs активна");
        return readFirstButton.isEnabled();
    }

    public void readFirstButtonClick() {
        LOG.infoWithScreenshot("Нажатие на первую кнопку ReadDocs");
//        acceptButtonCookie.click();
        myWait(10).visible(readFirstButton);
        readFirstButton.click();
    }

    public void checkUrl(){
        LOG.infoWithScreenshot("Проверка url страницы");
         String url = driver.getCurrentUrl();
         assertEquals(acpUrl, url, "Открылась неверная вкладка");
    }

    public boolean readTwoButtonCheckEnabled() {
        LOG.infoWithScreenshot("Вторая кнопка ReadDocs активна");
        return readTwoButton.isEnabled();
    }

    public void  readTwoButtonClick() {
        LOG.infoWithScreenshot("Нажатие на вторую кнопку ReadDocs");
//        acceptButtonCookie.click();
        myWait(10).visible(readTwoButton);
        readTwoButton.click();
    }

    public boolean junieButtonCheck(){
        LOG.infoWithScreenshot("Кнопка Junie by JetBrains активна");
        return junieButton.isEnabled();
    }

    public void junieButtonClick(){
        LOG.infoWithScreenshot("Нажатие на кнопку Junie by JetBrains");
        junieButton.click();
    }

    public boolean fullListFirstButtonCheck(){
        LOG.infoWithScreenshot("Первая кнопка Explore the full list активна");
        return fullListFirstButton.isEnabled();
    }

    public void fullListFirstButtonClick(){
        LOG.infoWithScreenshot("Нажатие на первую кнопку Explore the full list");
        fullListFirstButton.click();
    }

    public boolean fullListTwoButtonCheck(){
        LOG.infoWithScreenshot("Первая кнопка Explore the full list активна");
        return fullListTwoButton.isEnabled();
    }

    public void fullListTwoButtonClick(){
        LOG.infoWithScreenshot("Нажатие на вторую кнопку Explore the full list");
        fullListTwoButton.click();
    }

    public boolean usingAcpBlog(){
        LOG.infoWithScreenshot("Открытие блога UsingAcp и проверка видимости кнопки");
        usingAcpButton.click();
        acceptButtonCookie.click();
        myWait(10).visible(exploreButton);
        return exploreButton.isEnabled();
    }

    public void exploreButtonClick(){
        LOG.infoWithScreenshot("Нажатие на кнопку ExploreMore");
        exploreButton.click();
    }

    public boolean cursorJoinedBlog (){
        LOG.infoWithScreenshot("Открытие блога CursorJoined и проверка видимости кнопки");
        cursorJoinedButton.click();
        acceptButtonCookie.click();
        myWait(10).visible(exploreButton);
        return exploreButton.isDisplayed();
    }

    public boolean koogBlog(){
        LOG.infoWithScreenshot("Открытие блога Koog и проверка видимости кнопки");
        koogButton.click();
        acceptButtonCookie.click();
        myWait(10).visible(exploreButton);
        return exploreButton.isEnabled();
    }

    public boolean buttonNext(){
        LOG.infoWithScreenshot("Проверка видимости стрелки и нажатие");
        nextButton.click();
        return nextButton.isEnabled();
    }

    public boolean playVideo(){
        LOG.infoWithScreenshot("Запуск видео");
        playButton.click();
        return playButton.isEnabled();
    }

    public boolean countryButton(){
        LOG.infoWithScreenshot("Иконка Country поменяла своё значение");
        unitedStatesButton.click();
        dropDown.click();
        elementOfDropDown.click();
        chooseButton.click();
        return australiaButton.isEnabled();
    }
}

