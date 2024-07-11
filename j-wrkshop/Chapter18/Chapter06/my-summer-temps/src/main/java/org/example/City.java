package org.example;

public class City {
    
    private String cityName;
    private String countryName;
    private Double cityTemp;


    public City(String cityName, String countryName, Double cityTemp) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.cityTemp = cityTemp;
    }


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Double getCityTemp() {
        return cityTemp;
    }

    public void setCityTemp(Double cityTemp) {
        this.cityTemp = cityTemp;
    }
}
