package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {

    WebDriver driver;

    By uploadInput = By.id("uploadInput");
    By previewContainer = By.id("previewContainer");
    By fileName = By.id("fileName");
    By fileSize = By.id("fileSize");
    By fileType = By.id("fileType");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadFile(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
    }

    public boolean isPreviewDisplayed() {
        return driver.findElement(previewContainer).isDisplayed();
    }

    public boolean isFileNameDisplayed() {
        return driver.findElement(fileName).isDisplayed();
    }

    public boolean isFileSizeDisplayed() {
        return driver.findElement(fileSize).isDisplayed();
    }

    public boolean isFileTypeDisplayed() {
        return driver.findElement(fileType).isDisplayed();
    }
}