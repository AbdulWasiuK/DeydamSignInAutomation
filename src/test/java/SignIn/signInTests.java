package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class signInTests {
    // import the selenium webDriver
    private static WebDriver driver;

    // import chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\23490\\Desktop\\Deydam\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Maximize the window

        driver.manage().window().maximize();
        // Get page title
        System.out.println(driver.getTitle());
        // locate username field
        driver.findElement(By.id("username")).sendKeys("masterT");
        // locate the password field
        driver.findElement(By.id("password")).sendKeys("admintop34");
        // click on the log in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        Thread.sleep (10000);



        driver.quit ();

    }
    // initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        signInTests test = new signInTests ();
        test.setUp();
    }

}


