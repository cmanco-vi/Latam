package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DownloadsCartPage extends PageObject {
    public static final Target label_descargas = Target.the("Label descargas")
            .located(By.xpath("//*[@id='content']/ul[2]/li[2]/a"));
}
