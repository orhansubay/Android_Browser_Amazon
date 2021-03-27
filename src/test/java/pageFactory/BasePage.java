package pageFactory;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

}


