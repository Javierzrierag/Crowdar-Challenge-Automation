//package CrowdarTestAutomation;
//
//import lombok.Getter;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import project.pom.Base;
//
//@Getter
//public class TestPage extends Base {
//
//    public TestPage(WebDriver driver) {
//        super(driver);
//    }
//                    // Elements from the main Page //
//
//    By do1 = By.id("do1");
//    By do1Disable = By.xpath("//button[@id='do1'][@class='button disabled']");
//    By do2 = By.id("do2");
//    By do2Disable = By.xpath("//button[@id='do2'][@class='button disabled']");
//    By increaseFont = By.id("btnIncreaseFont");
//    By decreaseFont = By.id("btnDecreaseFont");
//    By backgroundColorButton = By.id("btnSetBgColor");
//    By backgroundColorInput = By.id("bgColor");
//    By formColor = By.id("formToColorize");
//    By textFontSize = By.id("textFontSize");
//    By fontSizeDefault = By.xpath("//p[@style='font-size: 20px;']");
//    By fontSizeIn1 = By.xpath("//p[@style='font-size: 23px;']");
//    By fontSizeIn2 = By.xpath("//p[@style='font-size: 26px;']");
//    By fontSizeDe1 = By.xpath("//p[@style='font-size: 23px;']");
//    By fontSizeDe2 = By.xpath("//p[@style='font-size: 17px;']");
//    By defaultBackgroundColor = By.xpath("//div[@style='']");
//    By greenBackgroundColor = By.xpath("//div[@style='background: green;']");
//    By blueBackgroundColor = By.xpath("//div[@style='background: blue;']");
//    By blackBackgroundColor = By.xpath("//div[@style='background: black;']");
//
//    public void testDo1Do2Button() throws Exception {
//
//        findElement(do2Disable).isDisplayed();
//        findElement(do1).isEnabled();
//        click(do1);
//
//        findElement(do1Disable).isDisplayed();
//        findElement(do2).isEnabled();
//        click(do2);
//        findElement(do1).isEnabled();
//
//    }
//
//    public void testChangeFontSize() throws Exception {
//
//        //Increment the font
//
//        isDisplayed(textFontSize);
//        isDisplayed(fontSizeDefault);
//        click(increaseFont);
//        isDisplayed(fontSizeDe1);
//        click(increaseFont);
//        isDisplayed(fontSizeDe2);
//
//        // Decrease the font
//
//        click(decreaseFont);
//        isDisplayed(fontSizeDe1);
//        click(decreaseFont);
//        isDisplayed(fontSizeDefault);
//        click(decreaseFont);
//        isDisplayed(fontSizeDe2);
//
//    }
//
//    public void testBackgroundColor() throws Exception {
//
//        isDisplayed(defaultBackgroundColor);
//        type("green", backgroundColorInput);
//        click(backgroundColorButton);
//        isDisplayed(greenBackgroundColor);
//     //   clear(backgroundColorInput);
//
//        clearAndWriteToElement("blue", backgroundColorInput);
//        click(backgroundColorButton);
//        isDisplayed(blueBackgroundColor);
//    //    clear(backgroundColorInput);
//
//        clearAndWriteToElement("black", backgroundColorInput);
//        click(backgroundColorButton);
//        isDisplayed(blackBackgroundColor);
//        clear(backgroundColorInput);
//
//        click(backgroundColorButton);
//        isDisplayed(defaultBackgroundColor);
//
//
//    }
//}


