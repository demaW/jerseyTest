package com.epam.dem.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Country {
    @XmlElement
    private String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return !(countryName != null ? !countryName.equals(country.countryName) : country.countryName != null);

    }

    @Override
    public int hashCode() {
        return countryName != null ? countryName.hashCode() : 0;
    }
}
