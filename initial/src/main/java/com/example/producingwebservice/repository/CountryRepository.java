package com.example.producingwebservice.repository;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {
    //private static final Map<String,Country> countries=new HashMap<>();

    @PostConstruct
    public void initData(){

    }
}
