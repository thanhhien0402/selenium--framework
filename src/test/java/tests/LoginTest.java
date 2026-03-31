package tests;

import framework.base.BaseTest;
import framework.pages.InventoryPage;
import framework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginSuccess(){

        LoginPage login = new LoginPage(getDriver());

        String password = System.getenv("APP_PASSWORD");

        InventoryPage inventory =
                login.login("standard_user", password);

        Assert.assertTrue(inventory.isLoaded());
    }
}