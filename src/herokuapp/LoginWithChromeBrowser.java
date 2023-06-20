package herokuapp;
/**
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginWithChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Launching the Chrome browser
        WebDriver driver = new ChromeDriver();
        // Open the URL
        driver.get(baseUrl);
        // we give implicit time to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title :" + title);

        //Print the current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the username field element
        WebElement usernamefield = driver.findElement(By.name("username"));
        //Enter the username to username field
        usernamefield.sendKeys("jasmeen144@gmail.com");

        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("Prime");

        //Browser close
        driver.close();



    }


}
