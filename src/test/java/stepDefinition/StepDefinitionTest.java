package stepDefinition;

//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.And;
//import cucumber.api.junit.Cucumber;
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
        System.out.println("Given");
    }

    @When("^User login into appication with username and password$")
    public void user_login_into_appication_with_username_and_password() throws Throwable {
        System.out.println("When");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Then");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("And");
    }

}
