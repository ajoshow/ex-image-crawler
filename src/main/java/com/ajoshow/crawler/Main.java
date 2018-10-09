package com.ajoshow.crawler;

import org.openqa.selenium.phantomjs.PhantomJSDriverService;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Andy on 2017/12/15.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Logger.getLogger(PhantomJSDriverService.class.getName()).setLevel(Level.OFF);
        Crawler crawler = new ChromeCrawler();
        crawler.get("https://shopee.tw/%E3%80%8A%E7%8F%BE%E8%B2%A8%E3%80%8B%E5%85%92%E7%AB%A5%E8%90%AC%E8%81%96%E7%AF%80%E9%80%A0%E5%9E%8B%E6%9C%8D-%E5%85%92%E7%AB%A5%E5%8D%97%E7%93%9C%E8%A3%9D-%E4%B8%AD%E5%B0%8F%E7%AB%A5%E8%90%AC%E8%81%96%E7%AF%80%E6%9C%8D-%E8%90%AC%E8%81%96%E7%AF%80%E5%8D%97%E7%93%9C%E8%A1%A3-%E8%90%AC%E8%81%96%E7%AF%80%E9%81%93%E5%85%B7-i.5662197.1418524433");
        crawler.get("https://shopee.tw/%E5%A4%96%E5%A5%97%E9%A2%A8%E8%A1%A33M%E9%98%B2%E6%BD%91%E6%B0%B4MIT%E9%98%B2%E9%A2%A8%E8%BB%8D%E8%A3%9D%E9%98%B2%E9%A2%A8%E5%A5%B3%E7%94%9F%E9%95%B7%E7%89%88%E5%A4%96%E5%A5%97LIYO%E7%90%86%E5%84%AAE648002-i.27968127.628011262?ads_keyword=%E9%A2%A8%E8%A1%A3%E5%A4%96%E5%A5%97&adsid=318335&campaignid=318335&position=2");
        crawler.get("https://shopee.tw/%E7%8F%BE%E8%B2%A8%E5%91%A2%E5%AD%90%E5%A4%A7%E8%A1%A3%E7%94%B7%E9%9F%93%E7%89%88%E6%BD%AE%E6%B5%81%E6%97%A5%E7%B3%BB%E5%BE%A9%E5%8F%A4%E7%AB%8B%E9%A0%98%E9%A2%A8%E8%A1%A3%E9%81%8E%E8%86%9D%E4%B8%AD%E9%95%B7%E6%AC%BE%E5%AD%B8%E7%94%9F%E5%AF%AC%E6%9D%BE%E5%B8%A5%E6%B0%A3%E6%BD%AE%E7%89%8C%E6%AD%A3%E9%9F%93-i.27430320.609474634");
        crawler.get("https://shopee.tw/adidas-Tiro-15-Trainng-Pants-%E9%81%8B%E5%8B%95%E8%A4%B2-%E6%84%9B%E8%BF%AA%E9%81%94-%E6%83%85%E4%BE%B6%E6%AC%BE-%E8%8B%B1%E5%80%AB%E9%9B%85%E7%97%9E%E9%95%B7%E8%A4%B2-%E9%81%8B%E5%8B%95%E9%95%B7%E8%A4%B2-%E6%85%A2%E8%B7%91%E8%A4%B2-%E7%94%B7%E5%A5%B3%E8%A4%B2-i.44094574.754959306");
        crawler.get("https://shopee.tw/PUFII-%E9%9C%B2%E5%96%AE%E8%82%A9%E9%96%8B%E8%A1%A9%E7%B6%81%E8%85%B0%E9%9B%AA%E7%B4%A1%E9%95%B7%E6%B4%8B%E8%A3%9D%E9%80%A3%E8%BA%AB%E8%A3%99(%E9%99%84%E8%85%B0%E5%B8%B6)-3%E8%89%B2-0322-%E7%8F%BE-%E9%A0%90-Y%E3%80%90CP14278%E3%80%91-i.26162161.1005444319");
    }
}
