/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author Akash Saha
 */
public class Login extends RunDriver {
    By alibabaH = By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[1]/div[1]/div[1]");
    By alibabac = By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[1]/div[2]/a[1]");
    By signin = By.xpath("//*[@id=\"fm-login-submit\"]");
    By mailf = By.id("fm-login-id");
    By passf = By.id("fm-login-password");
    
    String mail = "akash.saha32.as@gmail.com";
    String pass = "Bangladesh1";
    
    public void sendMail(){
        driver.findElement(mailf).sendKeys(mail);
    }
    
    public void sendPass(){
        driver.findElement(passf).sendKeys(pass);
    }
    
    public void inititate(){
        driver.navigate().to("https://www.alibaba.com/");
        //click on alibaba button
        Actions ac = new Actions(driver);
        WebElement hoAli = driver.findElement(alibabaH);
        ac.moveToElement(hoAli).build().perform();
        driver.findElement(alibabac).click();
    }
    
    public void test1(){
        driver.findElement(signin).click();
        System.out.println("Passed");
    }
    
    public void test2(){
        sendMail();
        driver.findElement(signin).click();
        System.out.println("Passed");
    }
    
    public void test3(){
        sendMail();
        driver.findElement(passf).sendKeys("invalidpass");
        driver.findElement(signin).click();
        System.out.println("Passed");
    }
    public void test4(){
        driver.findElement(mailf).clear();
        driver.findElement(passf).clear();
        sendPass();
        driver.findElement(signin).click();
        System.out.println("Passed");
    }
    
    public void test5(){
        test4();
        System.out.println("Passed");
    }
    
    public void login(){
        try{
            inititate();
            test1();
            test2();
            test3();
            test4();
            test5();
        }catch(Exception e){
            e.getMessage();
        }
    }
}
