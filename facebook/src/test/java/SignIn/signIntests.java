package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class signIntests {
    // import the selenium webDriver
    private static WebDriver driver;

    // import chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\23490\\Desktop\\facebook\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Input project URL = facebook URL

        driver.get("https://www.facebook.com/");
        // Global Waiting period
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Maximize the window

        driver.manage().window().maximize();
        // Get page title
        System.out.println(driver.getTitle());
        // locate username field
        driver.findElement(By.id("email")).sendKeys("coolwas2000@yahoo.com");
        // locate the password field
        driver.findElement(By.id("pass")).sendKeys("kufort2220");
        // click on the log in button
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
            Thread.sleep (10000);



        driver.quit ();

    }
        // initiate the test run command
        public static void main(String args[]) throws InterruptedException {
        signIntests test = new signIntests ();
        test.setUp();
    }

}













