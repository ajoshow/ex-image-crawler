package com.ajoshow.crawler;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;

public abstract class Crawler {

    public static final String SCRIPT_PATH = "script.js";
    private String scriptContent;
    private ClassLoader classLoader;

    public Crawler() throws IOException {
        this.classLoader = Crawler.class.getClassLoader();

        File scriptFile = new File(classLoader.getResource(SCRIPT_PATH).getFile());
        this.scriptContent = FileUtils.readFileToString(scriptFile, StandardCharsets.UTF_8);
    }


    public ClassLoader getClassLoader(){
        return classLoader;
    }

    public String getScriptContent(){
        return scriptContent;
    }



    public abstract Set<String> get(String siteUrl);
}
