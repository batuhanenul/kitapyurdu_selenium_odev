package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.BuyProductPage;
import com.testinium.page.CatalogPage;
import com.testinium.page.LoginPage;
import org.junit.Test;

public class BuyProductTest extends BaseTest {

    @Test
    public void buyProductTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BuyProductPage buyProductPage = new BuyProductPage();
        buyProductPage.buyProductPageTest();
    }
}
