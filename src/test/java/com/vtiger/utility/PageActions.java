package com.vtiger.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageActions
{

     public WebDriver driver;
     public WebDriverWait wait;


     public PageActions(WebDriver driver)
     {
         this.driver=driver ;
         wait =new WebDriverWait(driver, Duration.ofSeconds(5));


     }
     public void SetInput(WebElement elm,String value)
     {

      try
      {
           wait.until(ExpectedConditions.visibilityOf(elm));
           elm.clear();
           elm.sendKeys();
      }
      catch (Exception e)
      {

           System.out.println(e.getMessage());

      }


     }



     public void ClickElement(WebElement elm)
     {

          try
          {
               wait.until(ExpectedConditions.visibilityOf(elm));

               elm.click();
          }
          catch (Exception e)
          {

               System.out.println(e.getMessage());

          }


     }

    public void ElementExist(WebElement elm)
    {

        try
        {
            wait.until(ExpectedConditions.visibilityOf(elm));

            elm.isDisplayed();
        }
        catch (Exception e)
        {

            System.out.println(e.getMessage());

        }


    }







}
