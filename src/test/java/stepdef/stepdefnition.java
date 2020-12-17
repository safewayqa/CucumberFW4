package stepdef;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefnition {
	
	

    @Given("^chrome driver triggered$")
    public void chrome_driver_triggered() throws Throwable {
       System.out.println("Siteopen");
    }

    @When("^Browser launched$")
    public void browser_launched() throws Throwable {
    	 System.out.println("Chrome Opennned");
    }

    @Then("^Chrome browser displayed$")
    public void chrome_browser_displayed() throws Throwable {
    	 System.out.println("Chrome able to see");
    }
	

    @Given("^user landing page$")
    public void user_landing_page() throws Throwable {
    	 System.out.println("Rafiiiiii");
       
    }

   
    
    @When("^user enters the user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enters_the_user_name_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       System.out.println(arg1);
       System.out.println(arg2);
    }
    @Then("^user laneded on Signin page$")
    public void user_laneded_on_signin_page() throws Throwable {
    	 System.out.println("Rehan & Ridhu");
       
    }

	
    @Then("^check the order number also$")
    public void check_the_order_number_also() throws Throwable {
        System.out.println("My Family");
       
    }
    


    


   

   
}

