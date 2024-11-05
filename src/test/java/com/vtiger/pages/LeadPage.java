package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage extends HeaderPage
{


    public LeadPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(name="lastname")
    WebElement lastname;

    @FindBy(name="company")
    WebElement company;

    @FindBy(name="button")
    WebElement save;





    public void creatlead(String lname,String comp)
    {
              SetLastName(lname);
              SetCompany(comp);
              ClickSave();



    }
    public void SetLastName(String lname)
    {
        SetInput(lastname,lname);



    }
    public void SetCompany(String comp)
    {
        SetInput(company,comp);



    }
    public void ClickSave()
    {

        ClickElement(save);


    }

}
