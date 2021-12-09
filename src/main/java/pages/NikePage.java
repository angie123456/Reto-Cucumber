package pages;
import org.openqa.selenium.By;


public class NikePage {

    By txtBuscador = By.xpath("//input[contains(@placeholder,'Buscar')]");
    By btnBuscador = By.xpath("//button[@class='pre-search-btn ripple']");
    By btnElementoBusqueda;
    By txtElementoBusqueda;
    By btnPais;

    public By getBtnPais() {return btnPais;}

    public void setBtnPais(String pais) {
        this.btnPais = By.xpath("//a[@title ='Estados Unidos']");
    }

    public By getTxtBuscador() {
        return txtBuscador;
    }

    public By getBtnBuscador() {
        return btnBuscador;
    }

    public By getBtnElementoBusqueda() {
        return btnElementoBusqueda;
    }

    public By getTxtElementoBusqueda() {
        return txtElementoBusqueda;
    }

    public void setBtnElementoBusqueda(String producto) {
        this.btnElementoBusqueda = By.xpath("//a[@class='ui-search-item__group__element ui-search-link']//h2[contains(text(),'"+producto+"')]");
    }

    public void setTxtElementoBusqueda(String producto) {
        this.txtElementoBusqueda = By.xpath("//h1[contains(text(),'"+producto+"')]");
    }
}
