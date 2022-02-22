package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CatalogPage {
    Methods methods;
    Logger logger = LogManager.getLogger(CatalogPage.class);

    public CatalogPage() {
        methods = new Methods();
    }

    public void catalogPageTest(){
        methods.scrollWithAction(By.cssSelector(".welcome.fl"));
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.click(By.cssSelector("img[title=\"Puan Kataloğundaki Türk Klasikleri\"]"));
        Select selectSort = new Select(methods.findElement(By.cssSelector("select[onchange=\"location = this.value;\"]")));
        selectSort.selectByVisibleText("Yüksek Oylama");
        logger.info("Puan kataloğu sayfasında öncelik 'Yüksek Oylama' olarak ayarlandı");
        methods.waitBySeconds(5);
    }
}
