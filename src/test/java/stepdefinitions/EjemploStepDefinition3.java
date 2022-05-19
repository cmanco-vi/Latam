package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.TablaDeDatosFeature;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.LoginPage;
import tasks.OpenUp;
import tasks.Points;
import userinterface.PointsCartPage;

import java.util.List;

public class EjemploStepDefinition3 {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^que Crihstian Manco quiere visitar la página de opencart__$")
    public void que_Crihstian_Manco_quiere_visitar_la_página_de_opencart__()  {
        OnStage.theActorCalled("Crihstian").wasAbleTo(OpenUp.Page());

    }

    @And("^él inicia sesión en la página__$")
    public void él_inicia_sesión_en_la_página__(List<TablaDeDatosFeature> tablaDeDatosFeatures) {
        OnStage.theActorCalled("Crihstian").wasAbleTo(LoginPage.ThePage(tablaDeDatosFeatures.get(0)));
    }

    @When("^va a la sección de puntos de recompensa y visualiza los puntos__$")
    public void vaALaSecciónDePuntosDeRecompensaYVisualizaLosPuntos__() {
        OnStage.theActorInTheSpotlight().attemptsTo(Points.VerPuntos());
   }

    @Then("^él valida la sección de puntos de recompensa__$")
    public void élValidaLaSecciónDePuntosDeRecompensa__() {
        System.out.println("Se visualiza Your Reward Points\n"+ PointsCartPage.label_puntos);
    }
}

