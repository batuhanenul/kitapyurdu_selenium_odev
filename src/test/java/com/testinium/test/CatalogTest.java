package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.CatalogPage;
import org.junit.Test;

public class CatalogTest extends BaseTest {

    @Test
    public void catalogTest(){
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.catalogPageTest();
    }
}
