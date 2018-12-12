package com.onetec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTables {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/WebDriverDemo/src/main/webapp/TablesTest.html");

        //Primero, se coge la tabla exterior. Cuando se recorra el HTML, se va a encontrar la etiqueta <table> nada más. Ahí dentro hay más cosas.
        WebElement tablaExterior = driver.findElement(By.tagName("table"));

        //Esto busca dentro del elemento que se ha almacenado anteriormente un elemento que sea <table>
        WebElement tablaInterior = tablaExterior.findElement(By.tagName("table"));

        //Seleccionamos la segunda fila de la tabla interior
        WebElement fila = tablaInterior.findElements(By.tagName("td")).get(1);

        System.out.println(fila.getText()); //con getText se consigue lo que tiene escrito la etiqueta.

    }

}
