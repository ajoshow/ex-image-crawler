package com.ajoshow.phantomjs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andy on 2017/12/15.
 */
public class SiteImageReader {

    public static final String PHANTOMJS_PATH = "phantomjs.exe";
    public static final String SCRIPT_PATH = "script.js";

    private DesiredCapabilities caps;
    private String scriptContent;

    public SiteImageReader() throws IOException {
        ClassLoader classLoader = Main.class.getClassLoader();
        String phantomjsPath = classLoader.getResource(PHANTOMJS_PATH).getFile();

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

        File scriptFile = new File(classLoader.getResource(SCRIPT_PATH).getFile());
        scriptContent = FileUtils.readFileToString(scriptFile, StandardCharsets.UTF_8);

    }

    @SuppressWarnings("unchecked")
    public List<String> read(String siteUrl) {
        PhantomJSDriver driver = null;
        List<String> urls = new ArrayList<>();
        try {
            driver = new PhantomJSDriver(caps);
            System.out.println("============================");
            System.out.println("Read from: " + siteUrl);
            driver.get(siteUrl);
            System.out.println("Site title: " + driver.getTitle());
            urls = (ArrayList<String>) driver.executeScript(scriptContent);
            System.out.println("Image urls: " + urls);
        } finally {
            if (driver != null) {
                driver.close();
                driver.quit();
            }
        }
        return urls;
    }

}
