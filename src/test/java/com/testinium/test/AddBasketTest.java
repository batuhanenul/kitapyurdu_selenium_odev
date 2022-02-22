package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.AddBasketPage;
import com.testinium.page.CatalogPage;
import com.testinium.page.LoginPage;
import org.junit.Test;

public class AddBasketTest extends BaseTest {

    @Test
    public void addBasketTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        AddBasketPage addBasketPage = new AddBasketPage();
        addBasketPage.addBasketPageTest();
    }
}
