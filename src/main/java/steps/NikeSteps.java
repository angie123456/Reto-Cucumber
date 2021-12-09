package steps;

import drivers.GoogleChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.NikePage;




public class NikeSteps {

    NikePage nikePage = new NikePage();


    public void abrirPagina(){
        GoogleChromeDriver.chromeWebDriver("https://www.nike.com/xl/");
    }
    public void seleccionarPais(String pais){
        nikePage.setBtnPais(pais);
        GoogleChromeDriver.driver.findElement(nikePage.getBtnPais()).click();
    }
    public void realizoBusquedaDeProductos() {
       // for (int i = 0; i < listaProductos.size(); i++) {

        }

    public void buscarElementoEnNike(String producto){
        GoogleChromeDriver.driver.findElement(nikePage.getTxtBuscador()).sendKeys(producto);
        GoogleChromeDriver.driver.findElement(nikePage.getBtnBuscador()).click();
        nikePage.setBtnElementoBusqueda(producto);
        GoogleChromeDriver.driver.findElement(nikePage.getBtnElementoBusqueda()).click();
    }

    public void buscarElementoEnNikes(String productos){
        escribirEnTexto(nikePage.getTxtBuscador(), productos);
        clicEnElemento(nikePage.getBtnBuscador());
        nikePage.setBtnElementoBusqueda(productos);
        clicEnElemento(nikePage.getBtnElementoBusqueda());
    }

    public void validarElementoEnPantalla(String producto){
        nikePage.setTxtElementoBusqueda(producto);
        Assert.assertEquals(producto.replace("  "," "),GoogleChromeDriver.driver.findElement(nikePage.getTxtElementoBusqueda()).getText());
        GoogleChromeDriver.driver.quit();
    }

    public void escribirEnTexto(By elemento, String texto) {
        GoogleChromeDriver.driver.findElement(elemento).sendKeys(texto);
    }

    public void clicEnElemento(By elemento) {
        GoogleChromeDriver.driver.findElement(elemento).click();
    }
}
