/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Akash Saha
 */
public class ProductSupplyType extends RunDriver {
    PFBCatagery pc = new PFBCatagery();
    
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[1]/h5"));
        js.executeScript("arguments[0].scrollIntoView();", ele);
    }
    
    public void preCondition(){
        try{
            pc.preCondition1();
            Thread.sleep(500);
            scrollDown();
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test1(){
        try{
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[2]/a[1]/label[@class='seb-checkbox']/span")).click();
            Thread.sleep(5000);
            scrollDown();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test2(){
        try{
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[2]/a[2]/label[@class='seb-checkbox']/span")).click();
            Thread.sleep(5000);
            scrollDown();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test3(){
        try{
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[2]/a[3]/label[@class='seb-checkbox']/span")).click();
            Thread.sleep(5000);
            scrollDown();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void supplytype(){
        try{
            preCondition();
            test1();
            Thread.sleep(500);
            test2();
            Thread.sleep(500);
            test3();
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
