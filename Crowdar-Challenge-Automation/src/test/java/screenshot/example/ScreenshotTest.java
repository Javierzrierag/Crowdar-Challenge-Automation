package screenshot.example;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class ScreenshotTest {

    WebDriver driver;

    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
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
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File("error_" + description.getMethodName() + getDate() + ".png"));
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
    public void test() {
        fail();
    }
}
