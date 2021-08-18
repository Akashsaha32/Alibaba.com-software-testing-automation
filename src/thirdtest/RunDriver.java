/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Akash Saha
 */
public class RunDriver {
    public static WebDriver driver;
    
    public void invokeBrowser(){
        try{
            System.setProperty("webdriver.chrome.driver", "I:\\APP\\All Selenium\\ChromeDriver92\\chromedriver.exe");
            //disable notification
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--disable-notifications--");
            
            driver = new ChromeDriver(option);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
