package stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitionTest {

    @Given("^User is on NetiBanking lading page$")
    public void user_is_on_netibanking_lading_page() throws Throwable {
        System.out.println("Navigate on URL");
    }

    @When("^User login into appication with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_appication_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("Username: " + strArg1);
        System.out.println("Passoword: " + strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Validate Home Page");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println("Validation status: " + strArg1);
    }

}
