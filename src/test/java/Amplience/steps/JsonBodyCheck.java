package Amplience.steps;

import Amplience.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class JsonBodyCheck {

    /** Check the following appears in the page
     *  name = Gregory Loscombe
     *  location = Manchester
     *  id = 15330
     *  public repos = 7
     *  public gists = 11
     *  followers = 13
     *  following = 29
     * */

    @BeforeClass
    public static void BeforeClass(){
        baseURI = ConfigurationReader.get("APIUrl");
    }

    @Test
    public void checkUser(){

        given().accept(ContentType.JSON)
                .and().when().get("6wl").then().statusCode(200)
                .contentType("application/json; charset=utf-8")
                .and().assertThat().header("Content-Length",equalTo("464")).assertThat()
                .body("login",equalTo("6wl"),
                "id",equalTo(15330),
                "name",equalTo("Gregory Loscombe"),
                "location",equalTo("Manchester"),
                "public_repos",equalTo(7),
                "public_gists",equalTo(11),
                "followers",equalTo(13),
                "following",equalTo(29)).log().all();
    }

    /** Instead of using Gherkin Language, to make a difference I did the task with TestNG structure.
     *  With a BeforeClass method I connected to my server with saved Url through configuration properties
     *  I verified status code, contentType, in the header Content Length,
     *  and later on verified the remaining details with a HamCrest Matchers.
     *  At the end Logged All so I could see the body.
     * */


}
