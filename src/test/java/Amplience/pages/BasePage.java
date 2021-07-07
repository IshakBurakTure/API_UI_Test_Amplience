package Amplience.pages;

import Amplience.utilities.ConfigurationReader;
import Amplience.utilities.Driver;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    /**
     *  I Created BasePage so I can keep all my WebElements in same place, easy to reuse, easy to modify/maintain.
     *  I made the class abstract and created DashboardPage which extends BasePage.
     *  With that, I am not revealing my code.
     *
     * */

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
