package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Lokator elemen
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    // Konstruktor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Metode untuk mengisi field username
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    // Metode untuk mengisi field password
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    // Metode untuk mengklik tombol login
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
