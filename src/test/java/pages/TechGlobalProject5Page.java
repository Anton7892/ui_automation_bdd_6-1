package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class TechGlobalProject5Page {

    public TechGlobalProject5Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".is-size-2")
    public WebElement paginationHeading;

    @FindBy(id = "sub_heading")
    public WebElement worldCityPopHeading;

    @FindBy(id = "content")
    public WebElement paragraph;

    @FindBy(css = "button[id*='previous'")
    public WebElement previousButton;

    @FindBy(css = "button[id*='next'")
    public WebElement nextButton;





}
