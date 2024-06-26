package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import tasks.Navigate;

public class SearchAppointmentSD {
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(OnlineCast.ofStandardActors());
        OnStage.theActorCalled("Client").can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("I am on the main booking page")
    public void iAmOnTheMainBookingPage() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(
                Navigate.to("VisasLogIn")
        );

    }
}
