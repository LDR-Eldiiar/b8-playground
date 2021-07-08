package tests;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pages.FacebookMainPage;


public class loginTest{
    WebDriver driver;
    FacebookMainPage facebookMainPage;

    @Test
    public  void  testLogin (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        facebookMainPage = new FacebookMainPage(driver);
        facebookMainPage.method("Eldiiar","Mamhrovv");
        String actual = facebookMainPage.shouldGiveAsWrong();
        String expected = "The password you’ve entered is incorrect. Forgot Password?";
        Assert.assertEquals(actual, expected);
   }
   @Test
    public void test3 (){

   }
}
