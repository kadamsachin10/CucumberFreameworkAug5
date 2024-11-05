package com.vtiger.stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class leadsteps extends BaseSteps
{


    @When("user enter the mandatories fields and click on save button")
    public void user_enter_the_mandatories_fields_and_click_on_save_button(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> lst = dataTable.entries();

        for(int i =0; i<lst.size(); i++)
        {

            ldp.ClickNewLead();
            ldp.creatlead(lst.get(i).get("lastname"), lst.get(i).get("company"));


        }

    }
        @Then("lead should be created sucessfully")
        public void lead_should_be_created_sucessfully ()
        {


        }


    }



