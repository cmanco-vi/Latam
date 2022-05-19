package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderCartPage extends PageObject {
       public static final Target label_view_your_order_history = Target.the("Label View your order history")
            .located(By.xpath("//*[@id='content']/ul[2]/li[1]/a"));
       public static final Target label_order_history = Target.the("Label order history")
               .located(By.xpath("//*[@id='content']/h1"));

}
