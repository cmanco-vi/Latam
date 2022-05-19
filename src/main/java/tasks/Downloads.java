package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.DownloadsCartPage;

public class Downloads implements Task {

    public static Downloads VerDescargas(){
        return Tasks.instrumented(Downloads.class);
    }

       @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DownloadsCartPage.label_descargas)
                );

    }
}

