package com.vtiger.pages;

import com.vtiger.utility.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends PageActions
{


    public HeaderPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText="Logout")
    WebElement logout;

    @FindBy(linkText="NewLead")
    WebElement NewLead;

    @FindBy(linkText="Leads")
    WebElement leads ;

    @FindBy(linkText="Home")
    WebElement Home ;


    public void VerifyHome()
    {

        ElementExist(Home);
    }


    public void VerifyLogout()
    {

        ElementExist(logout);
    }

    public void ClickLogout()
    {

       ClickElement(logout);
    }
    public void ClickNewLead()
    {

        ClickElement(NewLead);
    }
    public void ClickLeads()
    {

        ClickElement(leads);
    }






}
