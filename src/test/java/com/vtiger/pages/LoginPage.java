package com.vtiger.pages;

import com.vtiger.utility.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage  extends PageActions
{


    public WebDriver driver;

    public  LoginPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }


/*
String username="user_name";
String userpassword="user_password";
String login="Login";
*/


    /*
      By username=By.name("user_name");
      By password=By.name("user_password");
      By Login=By.name("Login");
  */




     @FindBy(name="user_name")
         WebElement username;

    @FindBy(name="user_password")
         WebElement password;

     @FindBy(name="Login")
         WebElement login;

     @FindBy(xpath ="//img[@src='include/images/vtiger-crm.gif']")
     WebElement logo;

    @FindBy(xpath ="//*[contains(text(),'You must specify a valid username and password.']")
    WebElement errMsg;




public void login()
{
    System.out.println("hello");
   username.sendKeys("admin");
    password.sendKeys("admin");
    login.click();
}

public void SetUserName(String uid)
{
    SetInput(username ,uid);



}
    public void Setpassword(String pwd)
    {
        SetInput(password ,pwd);



    }
    public void ClickLogin()
    {

     ClickElement(login);


    }


public void verfifylogo()
{
  ElementExist(logo);
}
public void verifyErrorMessage()
{
    ElementExist(errMsg);
}


    public void login(String admin12, String admin34)
    {
    }
}
