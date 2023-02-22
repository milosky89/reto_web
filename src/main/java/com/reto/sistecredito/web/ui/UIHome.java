package com.reto.sistecredito.web.ui;

import com.reto.sistecredito.web.util.Constants;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

public class UIHome {
    public static final Target BTN_CATEGORY = Target.the("category button")
            .locatedBy("//div[@class = 'HamburgerBtn-module_icon-container__12faL']");
    public static final Target SELECT_CATEGORY = Target.the("select category")
            .locatedBy("(//div[contains(@class,'TaxonomyDesktop-module')]/p)[{0}]");
    public static final Target SELECT_SUBCATEGORY = Target.the("Select subcategory")
            .locatedBy("(//div[contains(@class,'TaxonomyDesktop-module_secondLevelMenuContainer')]/section//a)[{0}]");
    public static final Target NOTIFICATION = Target.the("close notification")
            .located(ByShadow.cssSelector(".airship-btn-deny",".airship-html-prompt-shadow"));

    public static final Target NOTIFICATION2 = Target.the("close notification 2")
            .located(By.xpath("//div[contains(@class,'dy-lb-close')]"));
    public static final Target BTN_VIEWALL = Target.the("view all button")
            .locatedBy("//*[contains(text(),'Ver todo')]");
    //div[contains(@class,'dy-lb-close')]
    private UIHome(){
        throw new IllegalStateException(Constants.USER_INTERFACE_CLASS);
    }
}
