package com.ajoshow.crawler;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author Andy on 2017/12/15.
 */
public class ChromeCrawler extends Crawler{

    private static final String CHROME_PATH = "chromedriver.exe";

    private ChromeOptions opts;

    public ChromeCrawler() throws IOException {
        String driverPath = getClassLoader().getResource(CHROME_PATH).getFile();

        System.out.println("CHROME_PATH: " + CHROME_PATH);
        System.setProperty("webdriver.chrome.driver", driverPath);

        opts = new ChromeOptions();
        opts.setHeadless(true);
        opts.setAcceptInsecureCerts(true);
        opts.addArguments("--proxy-server='direct://'");
        opts.addArguments("--proxy-bypass-list=*");
    }

    @Override
    @SuppressWarnings("unchecked")
    public Set<String> get(String siteUrl) {
        ChromeDriver driver = null;
        Set<String> urls = new HashSet<>();
        try {
            driver = new ChromeDriver(opts);
            System.out.println("============================");
            System.out.println("Read from: " + siteUrl);
            driver.get(siteUrl);
            System.out.println("Site title: " + driver.getTitle());

            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".animated-lazy-image")));
            driver.findElementByCssSelector(".animated-lazy-image").click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".shopee-modal__content")));

            urls = new HashSet((ArrayList<String>) driver.executeScript(getScriptContent()));
            for(String url : urls){
                System.out.println(url);
            }
        } finally {
            if (driver != null) {
                driver.close();
                driver.quit();
            }
        }
        return urls;
    }

}
