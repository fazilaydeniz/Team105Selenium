package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nur\\Documents\\selenyum dependencies\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        // get ile aynı işlevi yapar.

        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);

        //yeniden amazona dönelim

        driver.navigate().back();

        Thread.sleep(3000);

        // tekrar wiseqartera gitmek istersek
        driver.navigate().forward();




        Thread.sleep(3000);
        driver.quit();


    }
}
