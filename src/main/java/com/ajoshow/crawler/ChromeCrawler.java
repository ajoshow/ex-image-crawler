package com.ajoshow.crawler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andy on 2017/12/15.
 */
public class ChromeCrawler extends Crawler{

    public static final String DRIVER_PATH = "chromedriver.exe";

    private ChromeOptions opts;
    private String scriptContent;

    public ChromeCrawler() throws IOException {
        String driverPath = getClassLoader().getResource(DRIVER_PATH).getFile();

        System.out.println("DRIVER_PATH: " + DRIVER_PATH);
        System.setProperty("webdriver.chrome.driver", driverPath);

        opts = new ChromeOptions();
        opts.setHeadless(true);
        opts.setAcceptInsecureCerts(true);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> read(String siteUrl) {
        ChromeDriver driver = null;
        List<String> urls = new ArrayList<>();
        try {
            driver = new ChromeDriver(opts);
            System.out.println("============================");
            System.out.println("Read from: " + siteUrl);
            driver.get(siteUrl);
            System.out.println("Site title: " + driver.getTitle());
            WebDriverWait wait = new WebDriverWait(driver, getWaitInSecond());
            wait.withTimeout(Duration.ofSeconds(getWaitInSecond()));
            urls = (ArrayList<String>) driver.executeScript(getScriptContent());
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
