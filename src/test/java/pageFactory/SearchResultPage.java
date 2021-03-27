package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class SearchResultPage extends BasePage{

// **** Start of Upper Result Info Bar element
    @FindBy(xpath = "//body[1]/div[1]/div[2]/span[1]/div[1]/span[1]/h1[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
    public WebElement upperResultInfo;

    public int numberOfProductUpperResultInfo(){
        String tagIngo = upperResultInfo.getText();
        String[] tagIngoArray = tagIngo.split("\\s+");
        String yy = tagIngoArray[2].trim();
        int x= Integer.parseInt(yy);
        return x;
    }


//  End of Upper Result Info Bar element ****



// **** Start of Filter option element

    //Amazon prime Option
    @FindBy(css = "#departments")
    public WebElement departments;

    //Average Customer Review Options

    //Brand Options
    @FindBy(css = "#brandsRefinements")
    public WebElement brands;

    @FindBy(tagName = "li")
    public List<WebElement> brandList;

    //Price Range Options

    @FindBy(id = "low-price")
    public WebElement lowPriceInput;

    @FindBy(id = "high-price")
    public WebElement highPriceInput;

    @FindBy(xpath = "//input[@class='a-button-input']")
    public WebElement go;

    public void filterByPriceRange(int lowestPrice, int highestPrice){
        lowPriceInput.sendKeys(String.valueOf(lowestPrice));
        highPriceInput.sendKeys(String.valueOf(highestPrice));
        go.click();
    }

// End of Filter option element ****


// **** Start of Search Result element

    //The list doesn't include sponsored products
    @FindBy(xpath = "//div[@class='s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 sg-col sg-col-12-of-16']")
    public List<WebElement> listOfProductInPage;

    @FindBy(xpath = "//ul/li[@class='a-last']")
    public WebElement nextPage;

// End of Search Result element ****

    public void clickOnNextPAge(){
        nextPage.click();
    }





}
