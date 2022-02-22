package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.*;
import org.junit.Test;

public class TestAll extends BaseTest {
    @Test
    public void testAll()
    {
        LoginPage loginpage = new LoginPage();
        ProductPage productPage = new ProductPage();
        CatalogPage catalogPage = new CatalogPage();
        AddBasketPage addBasketPage = new AddBasketPage();
        BuyProductPage buyProductPage = new BuyProductPage();

        loginpage.login();
        productPage.selectProduct();
        catalogPage.catalogPageTest();
        addBasketPage.addBasketPageTest();
        buyProductPage.buyProductPageTest();

    }
}
