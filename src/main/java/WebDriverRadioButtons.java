package com.onetec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButtons {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/WebDriverDemo/src/main/webapp/RadioButtonTest.html");

        List<WebElement> radioButtons = driver.findElements(By.name("color"));

        radioButtons.get(2).click();

    }

}
