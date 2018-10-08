package com.ajoshow.crawler;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public abstract class Crawler {

    public static final String SCRIPT_PATH = "script.js";
    private String scriptContent;
    private ClassLoader classLoader;
    private int waitInSecond;

    public Crawler() throws IOException {
        this.classLoader = Crawler.class.getClassLoader();
        this.waitInSecond = 5;

        File scriptFile = new File(classLoader.getResource(SCRIPT_PATH).getFile());
        this.scriptContent = FileUtils.readFileToString(scriptFile, StandardCharsets.UTF_8);
    }

    public void setWaitInSecond(int waitInSecond) {
        this.waitInSecond = waitInSecond;
    }

    public int getWaitInSecond() {
        return waitInSecond;
    }

    public ClassLoader getClassLoader(){
        return classLoader;
    }

    public String getScriptContent(){
        return scriptContent;
    }



    public abstract List<String> get(String siteUrl);
}
