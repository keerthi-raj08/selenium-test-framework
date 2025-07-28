package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        driver.get("https://example.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("user", "pass");
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login should be successful");
    }
}
