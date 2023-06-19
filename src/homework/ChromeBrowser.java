package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //1. Setup chrome browser
        WebDriver driver =new ChromeDriver();

        //2. Open URL
        driver.get(baseUrl);
        //Maximise Screen
        driver.manage().window().maximize();
        //Imlicit Wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //3. Print the title of the page
        driver.getTitle();
        System.out.println("Title of this page  :"+driver.getTitle());
        //4. Print the current url
        driver.getCurrentUrl();
        System.out.println("Current URL name  :"+driver.getCurrentUrl());
        //5. Print the page source
        driver.getPageSource();
        System.out.println("Page sources  :"+driver.getPageSource());
        //6. Enter the email to email field
        WebElement emailField =driver.findElement(By.name("Email"));
        emailField.sendKeys("nj123@gmail.com");

        //7. Enter the password to password field
        WebElement passwordField =driver.findElement(By.id("Password"));
        passwordField.sendKeys("nj123");
        //Hold screen
        Thread.sleep(2000);

        //8. Close the browse
        driver.close();
    }
}
