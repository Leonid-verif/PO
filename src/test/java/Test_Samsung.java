package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.Pages.HomePage;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class Test_Samsung extends TestSetup {
    HomePage homePage;
    WebDriverWait wait;
    By iPhoneListBy = By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]");
    By samsungListBy = By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]");


    @BeforeMethod
    public void pageInitilize() {
        homePage = new HomePage(driver);
    }



    @Test
    public void test_search_Samsung()  {

        homePage
                .open()
                .clickSearch()
                .typeSearchSamsung()
                .clickSearchGo();

        List<WebElement> samsungList = driver.findElements(samsungListBy);
        for (WebElement el : samsungList) {
            el.getText();
            System.out.println(el.getText());
            assertTrue(el.getText().toLowerCase().contains("samsung"),"Ожидаемый результат: строка содержит 'samsung'");
        }

    }
}
