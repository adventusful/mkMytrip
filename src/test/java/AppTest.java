import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends BaseTest {


    private static final String PNR_TEXT = "0123456789";


    @Test
    public void test_app() throws InterruptedException {

        Page page = new Page(driver);

        driver.findElement(By.xpath(page.LINK_TRAIN)).click();
        driver.findElement(By.xpath(page.CHECK_PMR_STATUS_CHECKBOX)).click();
        driver.findElement(By.xpath(page.INPUT_PNR)).sendKeys(PNR_TEXT);
        driver.wait(500);
        driver.findElement(By.xpath(page.BUTTON_CHECK_STATUS)).click();

        //Check
        String actualnumber = driver.findElements(By.xpath(page.CHECK_PNR_TEXT)).get(0).getText().replace("PNR ", "");
        Assert.assertEquals(actualnumber, PNR_TEXT);
    }


}
