package selenium.ProjectAsos.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OlaplexPage {
    private WebDriver driver;
    @FindBy(id= "chrome-search")
    WebElement search;
    @FindBy(css= "button[type='submit']")
    WebElement submit;
    @FindBy(className= "title_pbGFT")
    WebElement ProductType;
    @FindBy(id = "plp_web_sort_price_low_to_high")
    WebElement LowToHigh;
    @FindBy (className = "container_p0yFn")
    WebElement Favourite;
    public OlaplexPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void searchAdidas (String searchToType) {
        search.click();
        search.clear();
        search.sendKeys(searchToType);
        submit.click();
    }
    public void clickOnMenuBtn() throws InterruptedException {
        ProductType.click();
        LowToHigh.click();
    }
    public void Favourite() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Favourite));
        Favourite.click();
    }
}

