package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("testpass");
        loginPage.clickLogin();

        System.out.println("Login test executed using Page Object Model");
    }
}
