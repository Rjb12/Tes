package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class CucumberTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        // Inisialisasi WebDriver dan buka halaman login
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("User enters valid username {string} and password {string}")
    public void userEntersValidCredentials(String username, String password) {
        // Masukkan username dan password yang valid
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Then("User clicks the login button")
    public void userClicksTheLoginButton() {
        // Klik tombol login
        loginPage.clickLoginButton();
    }
}
