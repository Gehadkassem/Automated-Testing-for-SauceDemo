package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps() {
        this.driver = BaseTest.driver; // Get the WebDriver instance from BaseTest
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginPage = new LoginPage(driver);
        loginPage.login();
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @When("I click the login button")
    public void i_click_the_login_button() throws InterruptedException {
        loginPage.clickLogin();
    }

    @Then("I should be redirected to the Products Page")
    public void i_should_be_redirected_to_the_Products_Page() {
        // Implement verification of successful login
    }


    @When("I click on the checkout button")
    public void I_click_on_the_checkout_button() throws InterruptedException {
        loginPage.clickcheckoutButton();
    }

    @And("I provide checkout with data")
    public void I_provide_checkout_data() throws InterruptedException {
        loginPage.enterFisrtName("Gehad");
        loginPage.enterLastName("Kassem");
        loginPage.enterPostalCode("12345");
    }
    @And("I click on the continue & Finish button")
    public void I_click_on_the_continue_button() throws InterruptedException {
        loginPage.clickButton();


        }
    @Then("I should see the message {string}")
    public void i_should_see_the_message(String message) {
        loginPage.verifyMessage(message);

        BaseTest.tearDown();
    }

    private void assertEquals(String expectedMessage, String actualMessage) {
    }
}
