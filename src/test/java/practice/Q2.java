package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    public static void main(String[] args) {
        // ...Exercise2...
        //1 - Driver olusturalim
        //2 - Java class'imiza chromedriver.exe'yi tanitalim
        //3 - Driver'in tum ekrani kaplamasini saglayalim
        //4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        //söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //5 - "https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
        //6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String titleOtto = driver.getTitle();
        String urlOtto   = driver.getCurrentUrl();

        //7 - Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim
        String expectedKelime = "OTTO";
       if (titleOtto.contains(expectedKelime)) {
            System.out.println("OTTO title testi: Test PASSED");
        } else {
            System.out.println("OTTO title testi: Test FAILED");
        }
        if (urlOtto.contains(expectedKelime)) {
            System.out.println("OTTO url testi: Test PASSED");
        } else {
            System.out.println("OTTO url testi: Test FAILED");
        }

        //8 - Ardindan "https://wisequarter.com/" adresine gidelim
        driver.navigate().to("https://wisequarter.com/");
        //9 - Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini
        //    kontrol edelim
           String titleQuarter= driver.getTitle();
           String urlQuarter= driver.getCurrentUrl();
           String expectedMetin="Quarter";
          if (titleQuarter.contains(expectedMetin)) {
               System.out.println("Quarter title testi Test PASSED");
           }else{
               System.out.println("Quarter title testi Test FAILED");
           }
        if (urlQuarter.contains(expectedMetin)) {
            System.out.println("Quarter url testi Test PASSED");
        }else{
            System.out.println("Quarter url testi Test FAILED");
        }
        //10- Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        //11- Sayfayi yenileyelim
        driver.navigate().refresh();
        //12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();
        //13- En son adim olarak butun sayfalarimizi kapatmis olalim

        driver.quit();
     }
}


