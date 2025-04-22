package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_010Page {
    WebDriver driver;
    WebDriverWait wait;

    By documentUploadSection = By.id("document-upload-section");
    By uploadButton = By.id("upload-button");
    By confirmButton = By.id("confirm-button");
    By slipNotification = By.id("slip-notification");
    By originalDocumentsHistory = By.id("original-documents-history");
    By extractedDataHistory = By.id("extracted-data-history");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void login() {
        // Implement login logic
    }

    public void navigateToDocumentUpload() {
        // Implement navigation logic
    }

    public void uploadDocuments() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadButton)).click();
        // Implement document upload logic
    }

    public void confirmProcessing() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmButton)).click();
        // Implement processing confirmation logic
    }

    public boolean isSlipGenerated() {
        WebElement slipNotif = wait.until(ExpectedConditions.visibilityOfElementLocated(slipNotification));
        return slipNotif.isDisplayed();
    }

    public boolean areOriginalDocumentsSaved() {
        WebElement documentsHistory = wait.until(ExpectedConditions.visibilityOfElementLocated(originalDocumentsHistory));
        return documentsHistory.isDisplayed();
    }

    public boolean areExtractedDataSaved() {
        WebElement dataHistory = wait.until(ExpectedConditions.visibilityOfElementLocated(extractedDataHistory));
        return dataHistory.isDisplayed();
    }
}