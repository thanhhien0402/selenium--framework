package tests;

import framework.base.BaseTest;
import framework.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void addItemToCart(){

        LoginPage login = new LoginPage(getDriver());

        String username = System.getenv("APP_USERNAME");
        String password = System.getenv("APP_PASSWORD");

        InventoryPage inventory =
                login.login(username, password);

        inventory.addFirstItemToCart();

        Assert.assertEquals(
                inventory.getCartItemCount(),
                1
        );
    }
}