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
public class ChangeLanguage extends RunDriver {
    public void hoverMenu(){
        Actions ac = new Actions(driver);
        WebElement cLang = driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[1]/label/span[1]"));
        ac.moveToElement(cLang).build().perform();
    }
    
    public void defaultLanguage(){
        try{
            hoverMenu();
            //select English
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]/div/div/div[2]/ul/li/ul/li[1]")).click();
            Thread.sleep(500);
            //click save
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[5]/button")).click();
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void defaultCurrenct(){
        try{
            hoverMenu();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[3]")).click();
            Thread.sleep(500);
            WebElement inputCurre = driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[3]/div/div/div[2]/div/input"));
            //inputCurre.click();
            inputCurre.sendKeys("Bangladesh");
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[3]/div/div/div[2]/ul/li[2]/ul/li[94]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[5]/button")).click();
            System.out.println("set English and BDT");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test1(){
        try{
            //select BDT
            defaultCurrenct();
            Thread.sleep(2000);
            
            hoverMenu();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]/div/div/div[2]/ul/li/ul/li[14]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[5]/button")).click();
            Thread.sleep(2000);
            System.out.println("1st test complete");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test2(){
        try{
            // 2nd test
            hoverMenu();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]/div/div/div[2]/ul/li/ul/li[1]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[5]/button")).click();
            Thread.sleep(2000);
            System.out.println("2st test complete");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test3(){
        try{
            //3rd test
            hoverMenu();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]/div/div/div[2]/ul/li/ul/li[7]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[5]/button")).click();
            Thread.sleep(2000);
            System.out.println("3st test complete");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test4(){
        try{
            // 4th test
            defaultLanguage();
            Thread.sleep(2000);
            hoverMenu();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]/div/div/div[2]/ul/li/ul/li[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[5]/button")).click();
            Thread.sleep(2000);
            System.out.println("4th test complete");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test5(){
        try{
            // 5th test
            defaultLanguage();
            Thread.sleep(2000);
            hoverMenu();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[2]/div/div/div[2]/ul/li/ul/li[3]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[4]/div[3]/div/div/div[2]/div[5]/button")).click();
            Thread.sleep(2000);
            System.out.println("5th test complete");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void languageChange(){
        try{
            driver.navigate().to("https://www.alibaba.com/");
            test1();
            test2();
            test3();
            test4();
            test5();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
