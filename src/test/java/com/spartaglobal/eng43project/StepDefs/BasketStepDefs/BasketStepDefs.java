package com.spartaglobal.eng43project.StepDefs.BasketStepDefs;

import com.spartaglobal.eng43project.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.eng43project.automationPracticeSite.AutomationPracticeSite;
import com.spartaglobal.eng43project.automationPracticeSite.Pages.Basket;
import io.cucumber.java.en.Given;

public class BasketStepDefs {
    // TODO: 18/11/2019  Change your driver path to your own path!
    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\NGeorgiev\\Downloads\\chromedriver_win32\\chromedriver.exe");
    private AutomationPracticeSite automationPracticeSite = new AutomationPracticeSite(seleniumConfig.getDriver());

}
