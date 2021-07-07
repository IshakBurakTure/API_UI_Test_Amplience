package Amplience.pages;

import Amplience.utilities.ConfigurationReader;
import Amplience.utilities.Driver;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static io.restassured.RestAssured.baseURI;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@itemprop='name']")
    public WebElement name;

    @FindBy(css = "span.p-label")
    public WebElement location;

    @FindBy(xpath = "(//span[@class='Counter'])[1]")
    public WebElement publicRepos;

    @FindBy(xpath = "(//span[@class='text-bold color-text-primary'])[1]")
    public WebElement followers;

    @FindBy(xpath = "(//span[@class='text-bold color-text-primary'])[2]")
    public WebElement following;

    public String getURL(){
        return Driver.get().getCurrentUrl();
    }


}
