package com.saucedemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.List;

import static com.google.common.base.Ascii.equalsIgnoreCase;
import static java.awt.SystemColor.menu;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private static final WebDriver webDriver;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tester\\IdeaProjects\\Praktic_35_6\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        //webDriver.get("https://www.google.com");
    }


    @Given("User is on Login page url {string}")
    public void user_is_on_login_page_url(String url) {
        webDriver.get(url);
    }


    @When("User enters UserName {string}")
    public void user_enters_user_name(String UserName) {
        WebElement FormName = webDriver.findElement(By.id("user-name"));
        FormName.click();
        FormName.sendKeys(UserName);

    }
    @When("User enters Password {string}")
    public void user_enters_password(String Password) {
        WebElement FormPass = webDriver.findElement(By.id("password"));
        FormPass.click();
        FormPass.sendKeys(Password);
    }
    @When("User push button Login")
    public void user_push_button_login() {
        webDriver.findElement(By.id("login-button")).click();
    }

    @Then("assert that expectedResult is {string}")
    public void assert_that_expected_result_is(String expectedResult) {
        final String actualCart = webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).getText();
        //System.out.println(actualCart);
        //  System.out.println(expectedResult);
        assertEquals(expectedResult, actualCart);
    }

    //scenario positive logOut
    @Given("User push menu and button logOut")
    public void user_push_menu_and_button_log_out() {
        WebDriverWait wait = new WebDriverWait (webDriver, Duration.ofSeconds(30));
        webDriver.findElement(By.id("react-burger-menu-btn")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")))
               .findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();

    }
    @Then("User logOut")
    public void user_log_out() {

    }

    @Then("User see text  error {string}")
    public void user_see_text_error(String error) {
        final String errorUserNameEmpty = webDriver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        assertEquals(error,errorUserNameEmpty);
            }

}
