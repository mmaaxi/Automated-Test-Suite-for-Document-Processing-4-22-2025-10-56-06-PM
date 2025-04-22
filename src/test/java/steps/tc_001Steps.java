package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page documentUploadPage;

    @Given("I am on the document upload page")
    public void iAmOnTheDocumentUploadPage() {
        documentUploadPage = new tc_001Page(driver);
        documentUploadPage.navigateToDocumentUploadPage();
    }

    @When("I select {string}")
    public void iSelectOption(String option) {
        documentUploadPage.selectOption(option);
    }

    @Then("the system should display options for {string} and {string}")
    public void theSystemShouldDisplayOptionsForCargaUnicaAndCargaMultiple(String single, String multiple) {
        Assert.assertTrue(documentUploadPage.isOptionDisplayed(single));
        Assert.assertTrue(documentUploadPage.isOptionDisplayed(multiple));
    }
    
    @When("I choose {string}")
    public void iChooseOption(String option) {
        documentUploadPage.chooseOption(option);
    }

    @Then("a single file upload box should be enabled")
    public void aSingleFileUploadBoxShouldBeEnabled() {
        Assert.assertTrue(documentUploadPage.isSingleFileUploadBoxEnabled());
    }
    
    @Then("multiple file upload boxes for each required document should be displayed")
    public void multipleFileUploadBoxesShouldBeDisplayed() {
        Assert.assertTrue(documentUploadPage.areMultipleFileUploadBoxesDisplayed());
    }
}