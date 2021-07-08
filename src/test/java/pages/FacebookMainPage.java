package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookMainPage {
    public FacebookMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//div[contains(text(),'incorrect')]" )
    WebElement contextText;
    @FindBy(xpath = "//input[@name='email']")
    WebElement username;
    @FindBy(xpath = "//input[@name='pass']")
    WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    WebElement click;
    public void method(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.click.click();
    }
    public  String shouldGiveAsWrong(){
        return contextText.getText();
    }
}
// WebElement expectedElement = driver.findElement(By.xpath(""));