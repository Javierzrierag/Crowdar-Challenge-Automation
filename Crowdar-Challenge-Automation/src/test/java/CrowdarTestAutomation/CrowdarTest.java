package CrowdarTestAutomation;

import baseUrl.url;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrowdarTest {

    private WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp() throws Exception {
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriverConections();

        loginPage.visit(url.TEST);
    }

    public String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    @Rule
    public TestRule watcher = new TestWatcher() {
        @Override
        public void failed(Throwable throwable, Description description) {
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(screenshotFile, new File("..\\Crowdar-Challenge-Automation\\Screenshots\\","error_"+description.getMethodName()+getDate()+".png"));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        @Override
        protected void finished(Description description){
            driver.quit();
        }
    };

    @Test
    public void login() throws Exception {
        loginPage.login();
    }

    @Test
    public void invalidLogin() throws Exception {
        loginPage.invalidLogin();
    }

    @Test
    public void loginWithlockedAccount() throws Exception {
        loginPage.loginWithAlockedAccount();

    }

    @Test
    public void testFail() throws Exception {
        loginPage.testFail();
    }

}
