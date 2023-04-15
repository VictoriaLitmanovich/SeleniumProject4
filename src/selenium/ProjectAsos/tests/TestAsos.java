package selenium.ProjectAsos.tests;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.ProjectAsos.pages.AdidasPage;
import selenium.ProjectAsos.pages.OlaplexPage;

public class TestAsos {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.asos.com/search/?q=olaplex");
        OlaplexPage olaplex = new OlaplexPage(driver);
        AdidasPage adidas = new AdidasPage(driver);

        olaplex.clickOnMenuBtn();
        olaplex.Favourite();
        olaplex.searchAdidas("Adidas Gazelle Bold");
        adidas.getPrice();
        adidas.getProduct();
        adidas.getPrices();

        base.seleniumClose(driver);
    }
}
