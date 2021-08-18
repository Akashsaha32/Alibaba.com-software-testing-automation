/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Akash Saha
 */
public class Registration extends RunDriver {
    String siteName = "https://www.alibaba.com/";
    By signIn = By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]");
    By joinFree = By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]");
    By language = By.xpath("//*[@id=\"language-switch\"]");
    By country = By.xpath("//*[@id=\"country\"]/i");
    By searchIcon = By.xpath("/html/body/div[6]/div/div/div/div/span/input");
    By clickFirstIcon = By.xpath("/html/body/div[6]/div/div/ul/li/div/span[2]");
    By TradeRoll = By.xpath("//*[@id=\"tradeRole\"]/label[3]/span[2]");
    By pass = By.id("password");
    By cPass = By.id("rePassword");
    By companyName = By.id("companyName");
    By fname = By.name("firstName");
    By lname = By.name("lastName");
    By code = By.name("phoneCountry");
    By phoneNumber = By.name("phoneNumber");
    By email = By.id("email");
    By slideVerify = By.xpath("//*[@id=\"nc_1__scale_text\"]/span");
    By agreeCheckbox = By.xpath("//*[@id=\"container\"]/div/form/div/div[10]/div/div[1]/label/input");
    By registration = By.xpath("//*[@id=\"container\"]/div/form/div/div[11]/div");
    //-------------------------------------------------------------------------------------------------------------
    String mail = "akash.saha32.as@gmail.com";
    String lpass = "Bangladesh1";
    String cpass = "Bangladesh1";
    String cname = "Alpha Ltd.";
    String FIname = "Akash";
    String LAname = "Saha";
    String pcode = "880";
    String pnumber = "1517813363";
    
    //sendKeys in web

    public void sendMail(){
        driver.findElement(email).sendKeys(mail);
    }
    public void sendlpass(){
        driver.findElement(pass).sendKeys(lpass);
    }
    public void sendcpass(){
        driver.findElement(cPass).sendKeys(cpass);
    }
    public void sendcname(){
        //write company name
        driver.findElement(companyName).sendKeys(cname);
    }
    public void sendfname(){
        //write name
        driver.findElement(fname).sendKeys(FIname);
    }
    public void sendlname(){
        driver.findElement(lname).sendKeys(LAname);
    }
    public void sendpcode(){
        //contact
        driver.findElement(code).sendKeys(pcode);
    }
    public void sendpnumber(){
        driver.findElement(phoneNumber).sendKeys(pnumber);
    }
    
    
    
    public void agreeAndReg(){
        WebElement checkbox = driver.findElement(agreeCheckbox);
        if(!checkbox.isSelected()){
            checkbox.click();
        }
        driver.findElement(registration).click();
    }
    
    public void slideVerify(){
        //slide to verify
        WebElement slide = driver.findElement(slideVerify);
        int slideWid = slide.getSize().getWidth();
        Actions move = new Actions(driver);
        org.openqa.selenium.interactions.Action action = move.dragAndDropBy(slide, slideWid, 0).build();
        action.perform();
        System.out.println(slideWid);
    }
    
    public void countrySelect(){
        try{
            driver.findElement(country).click();
            Thread.sleep(1000);
            driver.findElement(searchIcon).sendKeys("Bangladesh");
            Thread.sleep(1000);
            driver.findElement(clickFirstIcon).click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void languageSelect(){
        try{
            Select lang = new Select(driver.findElement(language));
            lang.selectByIndex(0);
            Thread.sleep(3000);
            lang.selectByVisibleText("English");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hoverSigninJoinfree(){
        //hover to Sign in
            Actions hovS = new Actions(driver);
            WebElement hoverS = driver.findElement(signIn);
            hovS.moveToElement(hoverS).build().perform();
            
            //hover to Join Free
            Actions hovJ = new Actions(driver);
            WebElement hoverJ = driver.findElement(joinFree);
            hovJ.moveToElement(hoverJ).build().perform();
    }
    
    public void clickJoin(){
        //click to join free
        driver.findElement(joinFree).click();
    }
    
    public void test1(){
        try{
            driver.navigate().to(siteName);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void test2(){
        try{
            hoverSigninJoinfree();
            clickJoin();
            languageSelect();
            agreeAndReg();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void test3(){
        try{
            driver.findElement(TradeRoll).click();
            sendlpass();
            sendcpass();
            sendcname();
            sendfname();
            sendlname();
            sendpcode();
            sendpnumber();
            slideVerify();
            agreeAndReg();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void test4(){
        try{
            sendMail();
            driver.findElement(phoneNumber).clear();
            slideVerify();
            agreeAndReg();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void test5(){
        try{
            sendpnumber();
            slideVerify();
            agreeAndReg();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void registration(){
        try{
            test1();
            test2();
            test3();
            test4();
            //test5();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
