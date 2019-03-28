import org.openqa.selenium.WebDriver;

public class Page extends BasePage {

    String LINK_TRAIN = "//span[contains(@class,'chNavIcon appendBottom2 chSprite chTrains')]";
    String CHECK_PMR_STATUS_CHECKBOX = "//span[contains(text(),'CHECK PNR STATUS')]";
    String INPUT_PNR = "//input[@id='pnr']";
    String BUTTON_CHECK_STATUS = "//a[text()='CHECK STATUS']";
    String CHECK_PNR_TEXT = "//p[contains(@class, 'appendBottom')]";
    String PNR_TEXT = "0123456789";


    public Page(WebDriver driver) {
        super(driver);
    }
}
