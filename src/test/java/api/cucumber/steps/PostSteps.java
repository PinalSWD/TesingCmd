package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @Given("User should be Logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {
        System.out.println("userShouldBeLoggedInAndShouldBePresentOnHisWall");
    }

    @When("I type the message in the box")
    public void iTypeTheMessageInTheBox() {
        System.out.println("iTypeTheMessageInTheBox");
    }

    @And("Click on post button")
    public void clickOnPostButton() {
        System.out.println("clickOnPostButton");
    }

    @Then("the message should get posted.")
    public void theMessageShouldGetPosted() {
        System.out.println("theMessageShouldGetPosted");
    }
}
