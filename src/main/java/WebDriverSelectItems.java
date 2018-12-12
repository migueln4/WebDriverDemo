package com.onetec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItems {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/WebDriverDemo/src/main/webapp/SelectItemsTest.html");

        //Para los combos de selección hay que importar una clase que se usa con una dependencia transitiva en Maven.
        WebElement elementoSeleccionado = driver.findElement(By.id("select1"));
        //En el constructor se le pasa el WebElement donde se ha guardado el combo de selección.
        Select select = new Select(elementoSeleccionado);
        //Esta clase tiene unos métodos muy útiles para moverse por este tipo de cosas.
        select.selectByVisibleText("Delantero");

    }

}
