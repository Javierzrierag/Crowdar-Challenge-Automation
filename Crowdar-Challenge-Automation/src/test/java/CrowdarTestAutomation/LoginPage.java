package CrowdarTestAutomation;

import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project.pom.Base;
import static org.junit.Assert.*;

@Getter
public class LoginPage extends Base {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Login Elements //

    By userNameLogin = By.id("user-name");
    By passwordLogin = By.id("password");
    By submitLogin = By.id("login-button");
    By errorMessage = By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]");
    By welcomePage = By.id("welcomeMsg");
    By lockedMessage = By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out')]");

    By products = By.xpath("//span[contains(text(),'Products')]");
    public void login() throws Exception {
        String user = "standard_user";
        String password = "secret_sauce";

        type(user,userNameLogin);
        type(password, passwordLogin);
        click(submitLogin);

    }

    public void invalidLogin() throws Exception {

        type("asdsa", userNameLogin);
        type("sfdsdg", passwordLogin);
        click(submitLogin);
        findElement(errorMessage).isDisplayed();


    }

    public void loginWithAlockedAccount() throws Exception {

        type("locked_out_user", userNameLogin);
        type("secret_sauce", passwordLogin);
        click(submitLogin);
        findElement(lockedMessage).isDisplayed();


    }

    public void testFail() throws Exception {
        String user = "standard_user";
        String password = "secret_sauce";

        type(user, userNameLogin);
        type(password, passwordLogin);
        assertEquals("product", driver.getTitle());



    }
}
