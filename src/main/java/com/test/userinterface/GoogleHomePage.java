package com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleHomePage {

    public static final Target SEARCH_FIELD = Target.the("Search field").located(By.xpath("//textarea[@title='Buscar']"));
}
