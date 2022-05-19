package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.PointsCartPage;

public class Points implements Task {

    public static Points VerPuntos(){
        return Tasks.instrumented(Points.class);
    }

       @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PointsCartPage.label_puntos)
                );

    }
}

