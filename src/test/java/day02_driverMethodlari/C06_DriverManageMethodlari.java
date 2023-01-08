package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\nur\\Documents\\selenyum dependencies\\Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // implicitlyWait gittiğimiz sayfa açılıncaya veya aradığımız webelement bulununcaya kadar driver'ın
        // bekleyebieceği max süreyi belirler.
        //YUKARIDAKİ DÖRTLÜ HER TEST METHODUMUZUN BAŞINA YAZILACAK.

    }
}
