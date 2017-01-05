package com.cyzicus.controller;

import com.cyzicus.config.WordConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

    @Autowired
    WordConfig wordConfig;

    @RequestMapping("/lucky-word")
    public String showLuckyWord() {
        return wordConfig.getPreamble() + ": " + wordConfig.getLuckyWord();
    }

}
