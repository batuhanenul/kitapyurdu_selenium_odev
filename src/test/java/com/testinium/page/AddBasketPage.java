package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddBasketPage {
    Methods methods;
    Logger logger = LogManager.getLogger(AddBasketPage.class);

    public AddBasketPage(){
        methods = new Methods();
    }

    public void addBasketPageTest(){
        methods.scrollWithAction(By.cssSelector(".welcome.fl"));
        methods.click(By.xpath("//li/span[text()='Tüm Kitaplar']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("li>a[href='kategori/kitap-hobi/1_212.html']"));
        methods.clickRandomProduct();
        methods.click(By.id("button-cart"));
        logger.info("rastgele bir ürün sepete eklendi");
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.click(By.linkText("Favorilerim"));
        methods.click(By.xpath("(//*[@data-title='Favorilerimden Sil'])[3]"));
        logger.info("favorilerden 3. ürün silindi.");
        methods.waitBySeconds(1);
        methods.click(By.id("sprite-cart-icon"));
        methods.click(By.id("js-cart"));
        methods.findElement(By.cssSelector("input[name='quantity']")).clear();
        methods.sendKeys(By.cssSelector("input[name='quantity']"),"2");
        methods.click(By.cssSelector(".fa.fa-refresh.green-icon"));
        methods.waitBySeconds(1);
        List<WebElement> wElementList = methods.findElements(By.cssSelector("a[class='button red']"));
        methods.click(wElementList.get(1));

        methods.waitBySeconds(5);


    }
}
