package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nur\\Documents\\selenyum dependencies\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //sayfayı tam ekran yapalım
        driver.manage().window().maximize();
        ;
        System.out.println("maximize window boyutları :" + driver.manage().window().getSize());

        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("fullscreen window boyutları :" + driver.manage().window().getSize());
        System.out.println("fullscreen window konumu:" + driver.manage().window().getPosition());

        // Brpwserı istediğimiz boyutlara getirelim.

        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(300,300));


        Thread.sleep(3000);
        driver.close();
        {
        }
    }
}
