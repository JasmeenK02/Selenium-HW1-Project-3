package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

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

public class LoginWithMultiBrowser {
        static String browser = "Edge";
        static String baseUrl = "http://the-internet.herokuapp.com/login";
        static WebDriver driver;

        public static void main(String[] args) {
            if(browser.equalsIgnoreCase("Chrome")){
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")){
                driver = new FirefoxDriver();
            } else if(browser.equalsIgnoreCase("Edge")){
                driver = new EdgeDriver();
            } else {
                System.out.println("Wrong Browser name");
            }

            //Open URL
            driver.get(baseUrl);
            // we give implicit time to Driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            // Print the title of the page
            String title = driver.getTitle();
            System.out.println("Page title : " + title);

            //Print the current url
            System.out.println("Current URl : " + driver.getCurrentUrl());

            //Print the page source
            System.out.println("Page source : " + driver.getPageSource());

            //Find the username field element
            WebElement usernamefield = driver.findElement(By.name("username"));
            //Enter username to username field element
            usernamefield.sendKeys("jasmeen144@gmail.com");

            //Enter the password to password field
            driver.findElement(By.name("password")).sendKeys("Prime");

            //Close the Browser
            driver.close();
    }
}
