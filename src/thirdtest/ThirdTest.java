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
public class ThirdTest extends RunDriver{
  
    Registration rg = new Registration();
    Login lg = new Login();
    ChangeLanguage cl = new ChangeLanguage();
    SearchProduct sp = new SearchProduct();
    ProductView pv = new ProductView();
    PFBCatagery fc = new PFBCatagery();
    ProductSupplyType st = new ProductSupplyType();
    
    public void Run(){
        try{
            rg.invokeBrowser();
            rg.registration();
            Thread.sleep(2000);
            driver.close();
            Thread.sleep(1000);
            System.out.println("********************\n Registration \n********************");

            lg.invokeBrowser();
            lg.login();
            Thread.sleep(2000);
            driver.close();
            Thread.sleep(1000);
            System.out.println("********************\n Login \n********************");

            cl.invokeBrowser();
            cl.languageChange();
            Thread.sleep(2000);
            driver.close();
            Thread.sleep(1000);
            System.out.println("********************\n Language Change \n********************");

            sp.invokeBrowser();
            sp.productSearch();
            Thread.sleep(2000);
            driver.close();
            Thread.sleep(1000);
            System.out.println("********************\n Product Search \n********************");

            pv.invokeBrowser();
            pv.viewProduct();
            Thread.sleep(2000);
            driver.close();
            Thread.sleep(1000);
            System.out.println("********************\n View Product \n********************");

            fc.invokeBrowser();
            fc.filterCatagery();
            Thread.sleep(2000);
            driver.close();
            Thread.sleep(1000);
            System.out.println("********************\n Filter Catagery \n********************");

            st.invokeBrowser();
            st.supplytype();
            Thread.sleep(2000);
            driver.close();
            Thread.sleep(1000);
            System.out.println("********************\n Supply Type \n********************");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        ThirdTest alibaba = new ThirdTest();
        alibaba.Run();
        
    }
    
}
