package test.java.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    By searchInput = By.id("twotabsearchtextbox");
    By searchInputGo = By.id("nav-search-submit-text");

public HomePage(WebDriver driver){
    this.driver = driver;
    wait = new WebDriverWait(driver,10, 500);

}

    public HomePage open() {
        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        return this;

    }
    public HomePage clickSearch() {
        driver.findElement(searchInput).click();
    return this;
    }

    public HomePage typeSearchIphone() {
        driver.findElement(searchInput).sendKeys("iPhone");
        wait.until(ExpectedConditions.elementToBeClickable(searchInputGo));
    return this;
    }


    public HomePage typeSearchSamsung() {
        driver.findElement(searchInput).sendKeys("Samsung");
        wait.until(ExpectedConditions.elementToBeClickable(searchInputGo));
        return this;
    }

    public HomePage clickSearchGo() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")));





    return this;
    }
}

