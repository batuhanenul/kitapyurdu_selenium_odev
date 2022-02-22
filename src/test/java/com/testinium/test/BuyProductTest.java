package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.BuyProductPage;
import com.testinium.page.CatalogPage;
import org.junit.Test;

public class BuyProductTest extends BaseTest {

    @Test
    public void buyProductTest(){
        BuyProductPage buyProductPage = new BuyProductPage();
        buyProductPage.buyProductPageTest();
    }
}
