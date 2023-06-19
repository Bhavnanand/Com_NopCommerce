package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static  String browser = "Chrome";
    static String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        //1.Setup multibrowser
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")){
            driver=new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else System.out.println("Enter valid Browser name");

            //2. Open URL
            driver.get("https://demo.nopcommerce.com/login?returnUrl=%2");
        //3. Print the title of the page
        System.out.println("Title of the page  :"+driver.getTitle());

        //4. Print the current url
        driver.getCurrentUrl();
        System.out.println("Name of current URL"+ driver.getCurrentUrl());
       //5. Print the page source
        driver.getPageSource();

        //6. Enter the email to email field
        driver.findElement(By.name("Email"));
        WebElement emailField =  driver.findElement(By.name("Email"));
        emailField.sendKeys("nj123@gmail.com");

        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("nj123");

        Thread.sleep(2000);
       // 8. Close the browser
        driver.close();

    }
}
