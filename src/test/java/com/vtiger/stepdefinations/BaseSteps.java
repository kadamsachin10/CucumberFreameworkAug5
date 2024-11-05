package com.vtiger.stepdefinations;

import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSteps
{

   public static WebDriver driver;
   public static LoginPage lp;
   public static LeadPage ldp;


   public void launchapp()
   {

        driver = new ChromeDriver();
       driver.get("http://localhost:100");
       lp =new LoginPage(driver);
       ldp=new LeadPage(driver);
   }











}
