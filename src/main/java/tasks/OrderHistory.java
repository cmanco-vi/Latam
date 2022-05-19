package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.OrderCartPage;

public class OrderHistory implements Task {

    public static OrderHistory VerHistorialPedidos(){
        return Tasks.instrumented(OrderHistory.class);
    }


       @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrderCartPage.label_view_your_order_history)
                );

    }
}

