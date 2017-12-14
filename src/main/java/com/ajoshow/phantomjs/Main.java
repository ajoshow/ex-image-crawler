package com.ajoshow.phantomjs;

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
        SiteImageReader reader = new SiteImageReader();
        reader.read("https://shopee.tw/%E3%80%90%E7%8F%BE%E8%B2%A8%EF%BC%99%EF%BC%99%E5%85%8D%E9%81%8B%E3%80%91%E9%9F%93%E7%89%88%E7%94%B7%E8%A3%9D%E5%85%A7%E7%B5%A8%E6%AF%9B%E7%B4%A0%E9%9D%A2%E9%80%A3%E5%B8%BD%E4%B8%AD%E9%95%B7%E5%A4%96%E5%A5%97-%E7%94%B7%E9%9F%93%E7%89%88%E9%A2%A8%E8%A1%A3%E5%A4%96%E5%A5%97-%E9%80%A3%E5%B8%BD-%E4%BC%91%E9%96%92%E5%A4%BE%E5%85%8B-%E5%A4%96%E5%A5%97-%E4%BF%AE%E8%BA%AB%E5%A4%96%E5%A5%97%E5%A4%BE%E5%85%8B%E3%80%90HL024%E3%80%91-i.4031525.725003232?ads_keyword=%E9%A2%A8%E8%A1%A3%E5%A4%96%E5%A5%97&adsid=317849&campaignid=317849&position=0");
        reader.read("https://shopee.tw/%E5%A4%96%E5%A5%97%E9%A2%A8%E8%A1%A33M%E9%98%B2%E6%BD%91%E6%B0%B4MIT%E9%98%B2%E9%A2%A8%E8%BB%8D%E8%A3%9D%E9%98%B2%E9%A2%A8%E5%A5%B3%E7%94%9F%E9%95%B7%E7%89%88%E5%A4%96%E5%A5%97LIYO%E7%90%86%E5%84%AAE648002-i.27968127.628011262?ads_keyword=%E9%A2%A8%E8%A1%A3%E5%A4%96%E5%A5%97&adsid=318335&campaignid=318335&position=2");
        reader.read("https://shopee.tw/%E7%8F%BE%E8%B2%A8%E5%91%A2%E5%AD%90%E5%A4%A7%E8%A1%A3%E7%94%B7%E9%9F%93%E7%89%88%E6%BD%AE%E6%B5%81%E6%97%A5%E7%B3%BB%E5%BE%A9%E5%8F%A4%E7%AB%8B%E9%A0%98%E9%A2%A8%E8%A1%A3%E9%81%8E%E8%86%9D%E4%B8%AD%E9%95%B7%E6%AC%BE%E5%AD%B8%E7%94%9F%E5%AF%AC%E6%9D%BE%E5%B8%A5%E6%B0%A3%E6%BD%AE%E7%89%8C%E6%AD%A3%E9%9F%93-i.27430320.609474634");
        reader.read("https://shopee.tw/%E6%AD%90%E7%BE%8E%E6%99%82%E5%B0%9A%E6%BD%AE%E6%B5%81%E7%BE%8E%E6%BD%AE%E5%BE%A9%E5%8F%A490%E5%B9%B4%E4%BB%A3%E7%B6%93%E5%85%B8%E6%92%9E%E8%89%B2OVER-SIZE%E8%9D%99%E8%9D%A0%E7%89%88%E5%9E%8B%E5%AF%AC%E6%9D%BE%E7%AB%8B%E9%A0%98%E7%94%B7%E5%A5%B3%E9%A2%A8%E8%A1%A3INS%E6%BD%AE-i.17625880.740285830");
        reader.read("https://shopee.tw/%E9%9F%93%E7%89%88%E6%94%B6%E8%85%B0%E9%A1%AF%E7%98%A6%E9%A2%A8%E8%A1%A3%E5%A5%B3%E4%B8%AD%E9%95%B7%E6%AC%BE2017%E7%A7%8B%E5%AD%A3%E6%96%B0%E6%AC%BE%E4%BF%AE%E8%BA%AB%E5%AD%B8%E7%94%9Fbf%E7%99%BE%E6%90%AD%E5%AD%B8%E9%99%A2%E9%A2%A8%E8%96%84%E6%AC%BE%E8%97%8D%E8%89%B2-i.23915394.664100750");
    }
}
