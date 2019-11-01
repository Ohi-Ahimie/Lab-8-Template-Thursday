package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;
    private int population;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    int getPopulation(){return this.population;}

    @Override
    public int compareTo(City o) {
        return city.compareTo(o.getCityName());
    }
}
