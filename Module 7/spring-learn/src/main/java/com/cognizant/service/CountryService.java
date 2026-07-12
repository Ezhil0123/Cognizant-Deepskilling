package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.Country;

@Service
public class CountryService {

    private static List<Country> countryList;

    static {

        countryList = new ArrayList<>();

        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("DE", "Germany"));
        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("JP", "Japan"));
    }

    public List<Country> getAllCountries() {
        return countryList;
    }

    public Country getCountry(String code) {

    for (Country country : countryList) {

        if (country.getCode().equalsIgnoreCase(code)) {
            return country;
        }
    }

    return null;
}
}