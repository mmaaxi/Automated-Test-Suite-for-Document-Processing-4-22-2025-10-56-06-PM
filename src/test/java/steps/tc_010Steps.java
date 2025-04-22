package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("^el usuario ha iniciado sesión y navega a la sección de carga de documentos$")
    public void el_usuario_ha_iniciado_sesion_y_navega_a_la_seccion_de_carga_de_documentos() {
        page.login();
        page.navigateToDocumentUpload();
    }

    @When("^el usuario carga los documentos necesarios y confirma el procesamiento$")
    public void el_usuario_carga_los_documentos_necesarios_y_confirma_el_procesamiento() {
        page.uploadDocuments();
        page.confirmProcessing();
    }

    @Then("^el sistema debe generar el 'Slip de salida'$")
    public void el_sistema_debe_generar_el_slip_de_salida() {
        assertTrue(page.isSlipGenerated());
    }

    @Then("^el sistema debe guardar los documentos originales en el historial de la solicitud$")
    public void el_sistema_debe_guardar_los_documentos_originales_en_el_historial_de_la_solicitud() {
        assertTrue(page.areOriginalDocumentsSaved());
    }

    @Then("^el sistema debe guardar los datos extraídos en el historial de la solicitud$")
    public void el_sistema_debe_guardar_los_datos_extraidos_en_el_historial_de_la_solicitud() {
        assertTrue(page.areExtractedDataSaved());
    }
}