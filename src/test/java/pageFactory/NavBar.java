package pageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NavBar extends BasePage{

//    public NavBar(){
//        PageFactory.initElements(Driver.get(), this);
//    }

    public NavBar(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement tabSearchTextBox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchSubmit;

    //Auto suggestion list parent element. It is visible once user enter min one character in the search-box
    @FindBy(id = "suggestions")
    public WebElement autoSuggestions;
    // 10 auto suggestion products list
    @FindBy(xpath = "//div[@data-alias='aps']")
    public List<WebElement> autoSuggestionList;

    public void searchByProductName(String searchKeyword) {
        tabSearchTextBox.sendKeys(searchKeyword);
        searchSubmit.click();
    }


    public long getNumberOfSuggestedProducts(){
        return autoSuggestionList.stream().count();
    }
}
