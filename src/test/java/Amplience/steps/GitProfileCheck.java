package Amplience.steps;

import Amplience.pages.DashboardPage;
import Amplience.utilities.ConfigurationReader;
import Amplience.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class GitProfileCheck {

    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user is on the Github page")
    public void the_user_is_on_the_Github_page() {
        Driver.get().get(ConfigurationReader.get("GitHubUrl"));
        String url = "https://github.com/6wl";
        Assert.assertEquals(dashboardPage.getURL(),url);
    }


    @Then("the user should verify the details as follows")
    public void the_user_should_verify_the_details_as_follows(Map<String,String> profileDetails) {
        Assert.assertEquals(profileDetails.get("name"),dashboardPage.name.getText());
        Assert.assertEquals(profileDetails.get("location"),dashboardPage.location.getText());
        Assert.assertEquals(profileDetails.get("public_repos"),dashboardPage.publicRepos.getText());
        Assert.assertEquals(profileDetails.get("followers"),dashboardPage.followers.getText());
        Assert.assertEquals(profileDetails.get("following"),dashboardPage.following.getText());
    }


}
