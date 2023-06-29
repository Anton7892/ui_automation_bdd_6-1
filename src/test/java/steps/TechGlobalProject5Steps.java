package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.TechGlobalProject5Page;
import utils.Driver;

public class TechGlobalProject5Steps {
    WebDriver driver;
    TechGlobalProject5Page project5Page;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
        project5Page = new TechGlobalProject5Page();


    }
    @And("the user should see the {string} paragraph")
    public void theUserShouldSeeTheParagraph(String paragraph) {
        Assert.assertEquals(paragraph,project5Page.paginationHeading.getText());

    }

    @Then("the user should see the {string} button is disabled")
    public void theUserShouldSeeTheButtonIsDisabled(String arg0) {
    }

    @When("the user clicks on the {string} button till it becomes disabled")
    public void theUserClicksOnTheButtonTillItBecomesDisabled(String arg0) {
    }

    @Then("the user should see “Tokyo” City with the info below and an image")
    public void theUserShouldSeeTokyoCityWithTheInfoBelowAndAnImage() {
    }

    @When("the user clicks on the “Next” button")
    public void theUserClicksOnTheNextButton() {
    }

    @Then("the user should see “Delhi” City with the info below and an image")
    public void theUserShouldSeeDelhiCityWithTheInfoBelowAndAnImage() {
    }

    @Then("the user should see {string} City with the info below and an image")
    public void theUserShouldSeeCityWithTheInfoBelowAndAnImage(String arg0) {
    }

    @Then("the user should see “Sao Paulo“ City with the info below and an image")
    public void theUserShouldSeeSaoPauloCityWithTheInfoBelowAndAnImage() {
    }

    @Then("the user should see “Mexico City” City with the info below and an image")
    public void theUserShouldSeeMexicoCityCityWithTheInfoBelowAndAnImage() {
    }
}
