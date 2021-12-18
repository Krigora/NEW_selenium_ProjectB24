package com.cybertek.tests.day22_explicitwait_review;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WaitUntilElemVisibleTest extends TestBase {

    @Test
    public void waitForWebDriverElem() {
        driver.get(ConfigurationReader.getProperty("seleniumpractice.url"));
        WebElement startTimer = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        startTimer.click();
        //Wait until WebDriver is visible

    }
}
