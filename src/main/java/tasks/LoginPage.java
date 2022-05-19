package tasks;

import model.TablaDeDatosFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginCartPage;

public class LoginPage implements Task {
    public LoginPage(TablaDeDatosFeature tablaDeDatosFeature) {
        this.tablaDeDatosFeature = tablaDeDatosFeature;
    }

    private TablaDeDatosFeature tablaDeDatosFeature;

    public static LoginPage ThePage(TablaDeDatosFeature tablaDeDatosFeature) {
        return Tasks.instrumented(LoginPage.class, tablaDeDatosFeature);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaDeDatosFeature.getUsername()).into(LoginCartPage.username_box),
                Enter.theValue(tablaDeDatosFeature.getPassword()).into(LoginCartPage.password_box),
                Click.on(LoginCartPage.enter_buttom)
                );

    }
}

