package com.cybertek.pages;

import static org.testng.Assert.*;

public class EdmundsNewCarPage extends BasePage {

    @Override
    public void isCurrentPage() {
        assertEquals(driver.getTitle(), "New Cars for Sale - Pricing and Deals | Edmunds");
    }
}
