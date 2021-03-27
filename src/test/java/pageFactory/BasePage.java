package pageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {

//    public BasePage(){
//        PageFactory.initElements(Driver.get(), this);
//    }

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

}


