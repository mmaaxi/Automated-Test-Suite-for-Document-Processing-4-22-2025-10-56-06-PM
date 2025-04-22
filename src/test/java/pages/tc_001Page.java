package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    private By cargarDocumentosOption = By.id("uploadOption");
    private By singleFileUploadBox = By.id("singleUpload");
    private By multipleFileUploadBoxes = By.className("multipleUpload");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://yourapplication.com/upload");
    }

    public void selectOption(String option) {
        if (option.equals("cargar documentos")) {
            driver.findElement(cargarDocumentosOption).click();
        }
    }

    public boolean isOptionDisplayed(String option) {
        By optionLocator = By.xpath("//option[text()='" + option + "']");
        return driver.findElement(optionLocator).isDisplayed();
    }

    public void chooseOption(String option) {
        By optionLocator = By.xpath("//button[text()='" + option + "']");
        driver.findElement(optionLocator).click();
    }

    public boolean isSingleFileUploadBoxEnabled() {
        return driver.findElement(singleFileUploadBox).isEnabled();
    }

    public boolean areMultipleFileUploadBoxesDisplayed() {
        return driver.findElements(multipleFileUploadBoxes).size() > 0;
    }
}