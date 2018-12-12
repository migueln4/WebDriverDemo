package com.onetec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTablesXPath {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/WebDriverDemo/src/main/webapp/TablesTest.html");

/* Cómo sacar el XPath de cualquier elemento desde el navegador:
 * - Botón derecho sobre el elemento.
 * - Inspeccionar.
 * - Botón derecho sobre él en la pestaña "Elements" (Chrome).
 * - Copy --> Copy XPath
 * */

        WebElement elemento = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));

        System.out.println(elemento.getText());

    }

}
