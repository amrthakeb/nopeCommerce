package TestBase;

import Util.WindowManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import Util.evenReporter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Base {
    protected String currentTCName;


    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("Start-maximized");
        option.addArguments("incognito");
        driver =new ChromeDriver(option);
        driver.get("https://demo.nopcommerce.com/");

    }

////@AfterTest
////    public void close(){
////        driver.close();
////    }
}




  // @AfterMethod
////    public void recordFailure(ITestResult result){
//
//        if(ITestResult.FAILURE==result.getStatus())
//        {
//            var camera=(TakesScreenshot)driver;
//            File screenShot=camera.getScreenshotAs(OutputType.FILE);
//            String TCName=getTCName();
//            try {
//                Files.move(screenShot.toPath(), new File(
//                                "src/main/resources/screenShots/"+TCName+".png").toPath(),
//                        StandardCopyOption.REPLACE_EXISTING);
//            }catch (IOException e)
//            {e.printStackTrace();}
//
//
//        }


   // }


