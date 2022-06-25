package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LandingPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.management.LockInfo;

public class LoginStepDefinition {
LoginPage loginPage=new LoginPage();
LandingPage landingPage=new LandingPage();
WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
    @Given("user on the login page")
    public void user_on_the_login_page() {
       String url= ConfigurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        String username=ConfigurationReader.getProperty("lib22_user");

        loginPage.usernameInput.sendKeys(username);


    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        String password=ConfigurationReader.getProperty("lib22_pass");
        loginPage.passwordInput.sendKeys(password);
        loginPage.signInButton.click();
    }
    @Then("user  should see dashboard")
    public void user_should_see_dashboard() {
       String expected="dashboard";
       WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
       wait.until(ExpectedConditions.urlContains(expected));

       String actual=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));
        Driver.closeDriver();
    }





    @When("user enters student username")
    public void user_enters_student_username() {

    }
    @When("user enters student password")
    public void user_enters_student_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @When("user enters librarian password {string}")
    public void user_enters_librarian_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("there should be {int} users")
    public void there_should_be_users(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @When("user enters  username {string}")
    public void user_enters_username(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters student password {string}")
    public void user_enters_student_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see the books")
    public void user_should_see_the_books() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I login using {string} and {string}")
    public void i_login_using_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
