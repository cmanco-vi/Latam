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
import tasks.OrderHistory;
import userinterface.OrderCartPage;

import java.util.List;

public class EjemploStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^que Crihstian Manco quiere visitar la página de opencart$")
    public void que_Crihstian_Manco_quiere_visitar_la_página_de_opencart()  {
        OnStage.theActorCalled("Crihstian").wasAbleTo(OpenUp.Page());

    }

    @And("^él inicia sesión en la página$")
    public void él_inicia_sesión_en_la_página(List<TablaDeDatosFeature> tablaDeDatosFeatures) {
        OnStage.theActorCalled("Crihstian").wasAbleTo(LoginPage.ThePage(tablaDeDatosFeatures.get(0)));
    }

    @When("^va a la sección de historial de pedidos y visualiza el historial de pedidos$")
    public void va_a_la_sección_de_historial_de_pedidos_y_visualiza_el_historial_de_pedidos() {
        OnStage.theActorInTheSpotlight().attemptsTo(OrderHistory.VerHistorialPedidos());
    }

    @Then("^él valida la sección de pedidos totales$")
    public void él_valida_la_sección_de_pedidos_totales() {
        System.out.println("Se visualiza Order History\n"+ OrderCartPage.label_order_history);
    }

}

