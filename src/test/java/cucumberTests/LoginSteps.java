package cucumberTests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    // Hooks
    @Before()
    public void beforeScenario(){
        System.out.println("Launching the browser");
    }
    @After
    public void afterScenario(){
        System.out.println("Closing the browser");
    }

    @Given("User is in login page")
    public void userIsInLoginPage() {
        System.out.println("Given");
    }
    @When("User provides invalid username and password")
    public void userProvidesInvalidUsernameAndPassword() {
        System.out.println("Invalid When");
    }
    @When("User provides invalid username {string} and password {string}")
    public void userProvidesInvalidUsernameAndPassword(String uname, String pass) {
        System.out.println(uname + " " + pass);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        System.out.println("And");
    }

    @Then("Verify the current url")
    public void verifyTheCurrentUrl() {
        System.out.println("Then");
    }

    @When("User provides valid username and password")
    public void userProvidesValidUsernameAndPassword() {
        System.out.println("Valid When");
    }

}
