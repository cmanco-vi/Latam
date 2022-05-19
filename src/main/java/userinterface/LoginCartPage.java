package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginCartPage extends PageObject {
       public static final Target username_box = Target.the("Caja de texto username")
            .located(By.id("input-email"));
    public static final Target password_box = Target.the("Caja de texto contrasena")
            .located(By.id("input-password"));
    public static final Target enter_buttom = Target.the("Boton entrar")
            .located(By.xpath("//*[@id='content']/div/div[2]/div/form/input"));
}
