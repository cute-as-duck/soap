package com.spring.soap.service;

import jakarta.annotation.PostConstruct;
import org.spring.generated.Country;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CountryService {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country france = new Country();
        String name = "France";
        france.setName(name);
        countries.put(name, france);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }


}
