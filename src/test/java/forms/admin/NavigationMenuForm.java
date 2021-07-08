package forms.admin;

import com.codeborne.selenide.SelenideElement;
import webdriver.BaseForm;

import static com.codeborne.selenide.Selenide.$x;

public class NavigationMenuForm extends BaseForm {

    public SelenideElement getSectionBtn(String section) {
        return $x("//a[contains(., '" + section + "')]");
    }

    public SelenideElement getMenuItemBtn(String menuItem) {
        return $x("//a[contains(., '" + menuItem + "')]");
    }
}
