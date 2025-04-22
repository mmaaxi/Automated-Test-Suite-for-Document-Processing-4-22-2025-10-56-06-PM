package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver;
    tc_002Page uploadPage;

    public tc_002Steps() {
        this.driver = Hooks.getDriver();
        uploadPage = PageFactory.initElements(driver, tc_002Page.class);
    }

    @Given("el usuario está en la página de carga de archivos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_archivos() {
        uploadPage.navigateToUploadPage();
    }

    @When("selecciona un archivo en formato PDF/DOCX dentro del límite de 50 MB")
    public void selecciona_archivo_en_formato_valido() {
        uploadPage.uploadFile("path/to/valid/file.pdf");
    }

    @Then("el archivo se carga y se muestra la vista previa con nombre, tamaño y tipo del archivo")
    public void archivo_cargado_con_vista_previa() {
        Assert.assertTrue(uploadPage.isPreviewDisplayed());
        Assert.assertTrue(uploadPage.isFileNameDisplayed());
        Assert.assertTrue(uploadPage.isFileSizeDisplayed());
        Assert.assertTrue(uploadPage.isFileTypeDisplayed());
    }
}