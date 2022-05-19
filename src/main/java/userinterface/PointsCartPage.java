package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PointsCartPage extends PageObject {
    public static final Target label_puntos = Target.the("Label puntos")
            .located(By.xpath("//*[@id='content']/ul[2]/li[3]/a"));
}
