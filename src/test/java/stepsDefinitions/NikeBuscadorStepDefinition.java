
package stepsDefinitions;

import cucumber.api.java.en.*;
import steps.NikeSteps;

public class NikeBuscadorStepDefinition {

    NikeSteps nikeSteps = new NikeSteps();

@Given("^que me encuentro en la pagina de N$")
public void queMeEncuentroEnLaPaginaDeN() {
    nikeSteps.abrirPagina();
        }


    @When("^busque el pais (.*)$")
   public void busqueElPais(String pais) {
    nikeSteps.seleccionarPais(pais);
        }

   @When("^busque el producto Nike (.*)$")
     public void busqueElProductoNikeWildhorseCalzadoDeTrailRunningParaHombre(String producto) {
       nikeSteps.buscarElementoEnNike(producto);
        }
    @When("^busque el producto con excel en \"([^\"]*)\"$")
    public void busqueElProductoConExcelEn(String arg1) {

    }

   @Then("^podre ver Nike (.*) en pantalla$")
    public void podreVerNikeWildhorseCalzadoDeTrailRunningParaHombreEnPantalla(String producto) {
    nikeSteps.validarElementoEnPantalla(producto);
}

}