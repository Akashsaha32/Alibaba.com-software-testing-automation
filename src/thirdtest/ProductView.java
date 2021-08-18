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
public class ProductView extends RunDriver {
    public void test1(){
        try{
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[2]/input")).sendKeys("laptop");
            driver.findElement(By.className("ui-searchbar-submit")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div[2]/div[2]/div/a[1]")).click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void test2(){
        try{
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[2]/input")).clear();
            driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[2]/input")).sendKeys("laptop");
            driver.findElement(By.className("ui-searchbar-submit")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div[2]/div[2]/div/a[2]")).click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void viewProduct(){
        try{
            driver.navigate().to("https://www.alibaba.com/");
            test1();
            Thread.sleep(1000);
            System.out.println("1st Test complete");
            
            test2();
            Thread.sleep(1000);
            System.out.println("2st Test complete");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
