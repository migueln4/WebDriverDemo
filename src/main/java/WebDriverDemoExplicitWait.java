package com.onetec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import java.util.concurrent.TimeUnit;

public class WebDriverDemoExplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement campoBusqueda = driver.findElement(By.className("gLFyf"));
        campoBusqueda.sendKeys("cowboy bebop");
        campoBusqueda.submit();

        WebElement enlaceImagenes = driver.findElements(By.linkText("Imágenes")).get(0);

        enlaceImagenes.click();

        WebElement enlaceImagenElegida = driver.findElement(By.id(("57sg9O3ccw5YnM:")));
        enlaceImagenElegida.click();

        /* -- Con esta línea, lo que se consigue es que se esperen 3 segundos para cada elemento a partir de que se ejecuta.
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        */

        /* -- Lo que se hace aquí es crear un objeto para que espere. En el cosntructor se debe meter el driver que estamos manejando y el tiempo en segundos que queremos que espere -- */
        WebDriverWait wait = new WebDriverWait(driver,10);

        //Sin embargo, se puede detener esa espera con el método until. Las ExpectedConditions son las cosas que se deben dar para que se acabe la espera. En este caso, que se vea correctamente, y donde debe, el enlace a Imágenes. Al poner esto así, la espera explícita solamente se produce con esta condición. El resto va mucho más rápido.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Imágenes")));

        WebElement a = driver.findElement(By.xpath("//*[@id=\"irc_cc\"]/div[2]/div[1]/div[2]/div[1]/a"));
        a.click();


    }
}