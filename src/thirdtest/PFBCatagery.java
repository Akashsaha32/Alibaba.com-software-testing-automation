/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtest;

import org.openqa.selenium.By;

/**
 *
 * @author Akash Saha
 */
public class PFBCatagery extends RunDriver {
    public void preCondition1(){
        driver.navigate().to("https://www.alibaba.com/");
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[2]/input")).sendKeys("laptop");
        driver.findElement(By.className("ui-searchbar-submit")).click();
    }
    
    public void test1(){
        try{
            preCondition1();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div/a[1]")).click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test2(){
        test1();
    }
    
    public void test3(){
        try{
            preCondition1();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div/a[3]")).click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test4(){
        try{
            preCondition1();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div/a[4]")).click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test5(){
        try{
            preCondition1();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div/a[5]")).click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test6(){
        try{
            preCondition1();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div/a[6]")).click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test7(){
        test6();
    }
    
    public void filterCatagery(){
        try{
            test1();
            Thread.sleep(1000);
            System.out.println("1st Test Complete");
            
            test2();
            Thread.sleep(1000);
            System.out.println("2nd Test Complete");
            
            test3();
            Thread.sleep(1000);
            System.out.println("3rd Test Complete");
            
            test4();
            Thread.sleep(1000);
            System.out.println("4th Test Complete");
            
            test5();
            Thread.sleep(1000);
            System.out.println("5th Test Complete");
            
            test6();
            Thread.sleep(1000);
            System.out.println("6th Test Complete");
            
            test7();
            Thread.sleep(1000);
            System.out.println("7th Test Complete");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
