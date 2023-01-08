package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkTest {
    public static void main(String[] args) throws InterruptedException {
        // amazon anasayfasına gidin
        // Gift Cards linkini tıklayın
        // Gift Cards sayfasına gittiğini test edin.

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nur\\Documents\\selenyum dependencies\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        // WebElement giftCardLinki= driver.findElement(By.linkText("Gift Cards"));

        WebElement giftCardLinki = driver.findElement(By.partialLinkText("gift"));
        giftCardLinki.click();
        /// istenen sayfaya gittigini test etmek icin
        // title'in Gift Card icerdigini test edebiliriz

        String expectedKelime="gift cards";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedKelime)){
            System.out.println("Gift Cards testi PASSED");
        }else {
            System.out.println("Gift Card testi FAILED");
        }

        driver.close();
    }
}
