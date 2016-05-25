package com.exigen.tst.web.countries.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InformationAboutCountries {

    @XmlElement(required=true)
    protected String country;
    @XmlElement(required=true)
    protected String city;
    @XmlElement(required=true)
    protected int population;

    public InformationAboutCountries() {}

    public String getCountry() {
       return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
}
