package com.onetec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

    public static void main(String[] args) {

       /*

        Esto queda comentado porque se ha introducido como variable del sistema la ruta en la que se encuentra el ChromeDriver.exe, lo cual es algo mucho menos peligroso.

        System.setProperty("webdriver.chrome.driver","C:/WebDriverDemo/chromedriver.exe");
        //Esto sale de: buscarlo en https://sites.google.com/a/chromium.org/chromedriver/getting-started. Básicamente, lo único que se hace es decirle dónde está el ChromeDriver para que pueda abrir el navegador.

        Abrir el menú inicio -> env -> Editar las variables de entorno del sistema -> Opciones avanzadas -> Variables de entorno

        Nueva... -> CHORMEDRIVER_PATH -> "C:/WebDriverDemo/
        Path -> Editar... -> Nueva -> %CHROMEDIRVER_PATH%
        */

// ---- ESTO ES PARA CONECTARSE CON GOOGLE CHROME----

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

/* ---- ESTO ES PARA CONECTARSE CON MOZILLA FIREFOX ----

        //Hace falta esto: https://github.com/mozilla/geckodriver
        //Es el mismo proceso que con Chrome
        WebDriver driverFox = new FirefoxDriver();

        driverFox.get("http://www.pluralsight.com"); */

        WebElement campoBusqueda = driver.findElement(By.className("gLFyf"));
        //Aquí se coge un elemento web. Esto detecta automáticamente qué tipo de elemento es lo que recupera, por eso se puede invocar al método sendKeys, ya que sabe que es un <input>.
        campoBusqueda.submit();

        WebElement enlaceImagenes = driver.findElements(By.linkText("Imágenes")).get(0); //Estoy pidiendo todos los enlaces que tengan como nombre "Imágenes". Me devuelve un ArrayList y yo cojo solamente el primer elemento de esta lista.

        enlaceImagenes.click();

        WebElement enlaceImagenElegida = driver.findElement(By.id(("57sg9O3ccw5YnM:")));
        enlaceImagenElegida.click();

    }
}
