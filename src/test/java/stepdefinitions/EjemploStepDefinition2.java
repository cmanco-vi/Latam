package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.TablaDeDatosFeature;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Downloads;
import tasks.LoginPage;
import tasks.OpenUp;
import userinterface.DownloadsCartPage;

import java.util.List;

public class EjemploStepDefinition2 {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^que Crihstian Manco quiere visitar la página de opencart_$")
    public void que_Crihstian_Manco_quiere_visitar_la_página_de_opencart_()  {
        OnStage.theActorCalled("Crihstian").wasAbleTo(OpenUp.Page());

    }

    @And("^él inicia sesión en la página_$")
    public void él_inicia_sesión_en_la_página_(List<TablaDeDatosFeature> tablaDeDatosFeatures) {
        OnStage.theActorCalled("Crihstian").wasAbleTo(LoginPage.ThePage(tablaDeDatosFeatures.get(0)));
    }

    @When("^va a la sección de descargas y visualiza las descargas_$")
    public void va_a_la_sección_de_descargas_y_visualiza_las_descargas_() {
        OnStage.theActorInTheSpotlight().attemptsTo(Downloads.VerDescargas());
    }

    @Then("^él valida la sección de descargas_$")
    public void él_valida_la_sección_de_descargas_() {
        System.out.println("Se visualiza Account Downloads\n"+ DownloadsCartPage.label_descargas);
    }

}

