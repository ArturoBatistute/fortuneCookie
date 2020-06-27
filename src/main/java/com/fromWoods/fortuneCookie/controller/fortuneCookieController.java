package com.fromWoods.fortuneCookie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class fortuneCookieController {

    final private List<String> fortunePhrases = Arrays.asList(

    );

    @GetMapping("/")
    public String indexRoute() {
        int index = ThreadLocalRandom.current().nextInt(fortunePhrases.size());

        return  fortunePhrases.get(index);
    }
}
