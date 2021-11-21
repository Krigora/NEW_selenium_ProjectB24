package com.cybertek.tests.day10_dropdown_alerts_iframes_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CarGurusUsedCarSearchTest {

    String url = "https://www.cargurus.com";
    WebDriver driver; //can use in every method

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void searchForMinivanTest() {
        //verify on correct page by checking the title
        String expTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(driver.getTitle(), expTitle);
        //select Toyota
        Select make = new Select(driver.findElement(By.id("carPickerUsed_makerSelect")));
        make.selectByVisibleText("Toyota");

        //select Sienna
        //
        Select model = new Select(driver.findElement(By.id("carPickerUsed_modelSelect")));
        //<option value="d308" class="selectOption">Sienna</option>
        model.selectByValue("d308");

        //type zip code -> 22102
        WebElement zipCode = driver.findElement(By.name("zip"));
        zipCode.sendKeys("22102");

        //print currently selected options of make and model
        System.out.println("Selected Make = " + make.getFirstSelectedOption().getText());
        System.out.println("Selected Model = " + model.getFirstSelectedOption().getText());

    }

}
