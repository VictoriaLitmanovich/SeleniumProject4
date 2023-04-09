package selenium.ProjectAsos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdidasPage {
    private WebDriver driver;
    @FindBy(className = "price_CMH3V")
    WebElement price;
    @FindBy(className = "productDescription_sryaw")
    WebElement product;

    public AdidasPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getPrice() {
        String prodPrice = price.getText();
        System.out.println("The price of the item is " + prodPrice);
    }

    public void getPrices() {
        List<WebElement> prices = driver.findElements(By.className("price_CMH3V"));
        for (WebElement prodPriceFromElem : prices) {
            String textPrice = prodPriceFromElem.getText();

            int index = textPrice.indexOf(".");
            String priceNumber = textPrice.substring(1, index);
            int priceAsInt = Integer.parseInt(priceNumber);
            System.out.println("The price of item is " + priceAsInt);
        }
    }

    public void getProduct() {
        String prodName = product.getText();
        System.out.println("The name of item is " + prodName);
    }
}
