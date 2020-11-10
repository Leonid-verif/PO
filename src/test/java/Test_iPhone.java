package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.Pages.HomePage;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class Test_iPhone extends TestSetup {
    HomePage homePage;
    WebDriverWait wait;
    By iPhoneListBy = By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]");
    By samsungListBy = By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]");


    @BeforeMethod
    public void pageInitilize() {
        homePage = new HomePage(driver);
    }


    @Test
    public void test_search_iPhone() {

        homePage
                .open()
                .clickSearch()
                .typeSearchIphone()
                .clickSearchGo();

        List<WebElement> iPhoneList = driver.findElements(iPhoneListBy);
        for (WebElement el : iPhoneList) {
            el.getText();
            System.out.println(el.getText());
            assertTrue(el.getText().contains("iPhone"));
        }
    }

}
