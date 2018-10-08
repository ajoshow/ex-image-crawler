package com.ajoshow.crawler;

import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andy on 2017/12/15.
 * @deprecated Phantomjs driver is no longer support, use {@link ChromeCrawler} instead.
 */

public class PhantomjsCrawler extends Crawler {

    private static final String PHANTOMJS_PATH = "phantomjs.exe";

    private DesiredCapabilities caps;

    public PhantomjsCrawler() throws IOException {
        String phantomjsPath = getClassLoader().getResource(PHANTOMJS_PATH).getFile();

        System.out.println("PHANTOMJS_PATH: " + PHANTOMJS_PATH);

        caps = DesiredCapabilities.phantomjs();
        caps.setJavascriptEnabled(true);
        String[] phantomArgs = {"--webdriver-loglevel=NONE"};
        caps.setCapability("phantomjs.page.settings.userAgent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36");
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomArgs);
        caps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                phantomjsPath
        );


    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> get(String siteUrl) {
        PhantomJSDriver driver = null;
        List<String> urls = new ArrayList<>();
        try {
            driver = new PhantomJSDriver(caps);
            System.out.println("============================");
            System.out.println("Read from: " + siteUrl);
            driver.get(siteUrl);
            System.out.println("Site title: " + driver.getTitle());
            // seems phantomjs has no effect from WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, getWaitInSecond());
            wait.withTimeout(Duration.ofSeconds(getWaitInSecond()));
            urls = (ArrayList<String>) driver.executeScript(getScriptContent());
            for (String url : urls) {
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
