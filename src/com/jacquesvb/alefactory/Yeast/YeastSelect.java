package com.jacquesvb.alefactory.Yeast;

public class YeastSelect implements Yeasts {

    private String name, floc, description;
    private int lowTemp, highTemp, lowAtten, highAtten;

    public YeastSelect(String name, String floc, String description, int lowTemp, int highTemp, int lowAtten,
                       int highAtten) {
        this.name = name;
        this.floc = floc;
        this.description = description;
        this.lowTemp = lowTemp;
        this.highTemp = highTemp;
        this.lowAtten = lowAtten;
        this.highAtten = highAtten;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String floc() {
        return floc;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public int lowTemp() {
        return lowTemp;
    }

    @Override
    public int highTemp() {
        return highTemp;
    }

    @Override
    public int lowAttenuation() {
        return lowAtten;
    }

    @Override
    public int highAttenuation() {
        return highAtten;
    }
}
