package com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeDuckDuckGoPage {

    public static final Target SEARCH_FIELD = Target.the("Search field").located(By.id("search_form_input_homepage"));
}
