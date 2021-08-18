/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtest;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Akash Saha
 */
public class SearchProduct extends RunDriver {
    
    public void test1(){
        driver.findElement(By.className("ui-searchbar-submit")).click();
    }
    
    public void test2(){
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[2]/input")).sendKeys("laptop");
        driver.findElement(By.className("ui-searchbar-submit")).click();
    }
    
    public void test3(){
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[2]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[2]/input")).sendKeys("samsung mobile phone");
        driver.findElement(By.className("ui-searchbar-submit")).click();
    }
    
    public void test4(){
        try{
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[2]/input")).clear();
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[2]/input")).sendKeys("samsung");
            driver.findElement(By.className("ui-searchbar-submit")).click();
        
            Thread.sleep(5000);

            List<WebElement> list = (List<WebElement>) driver.findElements(By.xpath("//div[@flasher-type='item']"));
            int countProduct = list.size();
            System.out.println("Total number of product is: "+countProduct);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void productSearch(){
        try{
            driver.navigate().to("https://www.alibaba.com/");
            driver.manage().deleteAllCookies();
            test1();
            Thread.sleep(500);
            System.out.println("Test 1 Complete");
            test2();
            Thread.sleep(500);
            System.out.println("Test 2 Complete");
            test3();
            Thread.sleep(500);
            System.out.println("Test 3 Complete");
            test4();
            Thread.sleep(500);
            System.out.println("Test 4 Complete");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
