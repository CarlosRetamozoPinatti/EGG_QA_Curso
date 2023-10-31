package web.tests;

import org.testng.annotations.Test;

public class SauceDemoV2Test extends BaseTest {

    @Test
    public void OnlineShopTest(){
        getLoginPage();
        loginPage.login("standard_user", "secret_sauce");
        getShopPage();
        shopPage.AddToCart();
        getCartPage();
        cartPage.ContinueShopping();
        getBillPage();
        billPage.BillingInfo("Charlie", "Baldman", "123123");
    }
}
