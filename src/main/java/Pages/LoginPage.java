package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By AddProduct = By.id("add-to-cart-sauce-labs-bike-light");
    private By ClickOnCart = By.className("shopping_cart_link");
    private By checkoutButton = By.id("checkout");
    private By firstNameInfo = By.id("first-name");
    private By lastNameInfo = By.id("last-name");
    private By postalCodeInfo = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        type(usernameField, username);
    }
    public void enterPassword(String password) {
        type(passwordField, password);
    }
    public void clickLogin() throws InterruptedException {
        click(loginButton);
        Thread.sleep(2000);
        click(AddProduct);
        click(ClickOnCart);
        Thread.sleep(2000);
    }

    public void login() {
        driver.get("https://www.saucedemo.com/");
    }

    public void clickcheckoutButton() throws InterruptedException {
        click(checkoutButton);
        Thread.sleep(2000);
    }
    public void enterFisrtName(String FirstName) throws InterruptedException {
        type(firstNameInfo, FirstName);
    }

    public void enterLastName(String LastName) {
        type(lastNameInfo, LastName);
    }

    public void enterPostalCode(String PostalCode) {
        type(postalCodeInfo, PostalCode);
    }

    public void clickButton() throws InterruptedException {
        click(continueButton);
        click(finishButton);
        Thread.sleep(2000);

    }

    public void verifyMessage(String message) {
        message("Thank you for your order!\n");
    }

    private void message(String s) {
    }
}


