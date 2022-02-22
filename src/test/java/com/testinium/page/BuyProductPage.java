package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BuyProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(BuyProductPage.class);



    public BuyProductPage(){
        methods = new Methods();
    }
    public void buyProductPageTest(){


        methods.click(By.cssSelector("a[onclick=\"setShippigAddressType('new')\"]"));
        methods.sendKeys(By.id("address-firstname-companyname"),"denemeAD");
        methods.sendKeys(By.id("address-lastname-title"),"denemeSOYAD");
        Select selectCity = new Select(methods.findElement(By.id("address-zone-id")));
        selectCity.selectByVisibleText("İstanbul");
        methods.waitBySeconds(2);
        Select selectCounty = new Select(methods.findElement(By.id("address-county-id")));
        selectCounty.selectByVisibleText("ÜMRANİYE");
        methods.sendKeys(By.id("district"),"ESENEVLER MAH");
        methods.sendKeys(By.id("address-address-text"),"Çamlı Sok.");
        methods.sendKeys(By.id("address-mobile-telephone"),"5350541111");
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(5);
        logger.info("Adres eklendi");

        //KART BİLGİLERİ GİRME
        methods.sendKeys(By.id("credit-card-owner"),"B.H. ENÜL");
        methods.sendKeys(By.id("credit_card_number_1"),"1111");
        methods.sendKeys(By.id("credit_card_number_2"),"1111");
        methods.sendKeys(By.id("credit_card_number_3"),"1111");
        methods.sendKeys(By.id("credit_card_number_4"),"1111");
        Select selectMonth = new Select(methods.findElement(By.id("credit-card-expire-date-month")));
        selectMonth.selectByVisibleText("01");
        Select selectDate = new Select(methods.findElement(By.id("credit-card-expire-date-year")));
        selectDate.selectByVisibleText("2022");
        methods.sendKeys(By.id("credit-card-security-code"),"123");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector("span[class='error']")));
        logger.info("Hatalı kart girişi yapıldı.");
        methods.click(By.cssSelector(".checkout-logo"));
        methods.mouseOverLogOut(By.cssSelector(".common-sprite"));








    }
}
