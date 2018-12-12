package com.onetec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckbox {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/WebDriverDemo/src/main/webapp/CheckboxesTest.html");

        WebElement checkbox = driver.findElement(By.id("postreCheckbox"));
        checkbox.click();
        checkbox.click();//Esto lo desclica
    }

}
