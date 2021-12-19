package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.*;

public class EdmundsNewCarPage extends BasePage {

    @FindBy(name = "select-make")
    public WebElement make;

    public void selectMake(String carMake) {
        Select makeDropDown = new Select(make); //creating Select class object because it is drop down
        makeDropDown.selectByVisibleText(carMake);
    }

    @Override
    public void isCurrentPage() {
        assertEquals(driver.getTitle(), "New Cars for Sale - Pricing and Deals | Edmunds");
    }
}
