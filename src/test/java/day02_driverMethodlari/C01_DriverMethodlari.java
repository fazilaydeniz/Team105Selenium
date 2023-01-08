package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        // Bir browserları oluşturduğumuz driver sayesinde otomate edebiliyoruz.
        // Bunun için her testin başında mutlaka driver objesi oluşturacağız.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\nur\\Documents\\selenyum dependencies\\Drivers\\Chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        // Açılan sayfanın başlığının amazon içerdiğini test edin.

        String expectedKelime="amazon";
        String actualResult= driver.getTitle();

        if (actualResult.contains(expectedKelime)){

            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title amazon içermiyor. test FAILED");
            System.out.println(driver.getTitle());
        }

        String expectedUrl= "https://www.amazon.com/"; // Bu satırda sondaki slaş fazlalık ondan doğru cevap gelmiyor.
         String actualUrl= driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("URL testi PASSED");
        }else{
            System.out.println("url istediğiniz değerde değil");
        }

        //gittiğimiz sayfanın URL'inin https://www.amazon.com/ olduğunu test edin

        Thread.sleep(5000);
        driver.close();
    }
}
