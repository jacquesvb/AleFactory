package com.jacquesvb.alefactory.Yeast;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class YeastDataTest {

    final String NAME = "TestYeast";
    final String FLOC = "Test Flocculation";
    final int LOWATTEN = 50;
    final int HIGHATTEN = 60;
    final int LOWTEMP = 65;
    final int HIGHTEMP = 75;
    final String DESC = "This is a test yeast.";

    private YeastData yeastData = new YeastData();
    private List<Yeast> yeast = yeastData.getYeastData();
    String name = yeast.get(0).getName();
    String floc = yeast.get(0).getFloc();
    int lowAtten = yeast.get(0).getLowAttenuation();
    int highAtten = yeast.get(0).getHighAttenuation();
    int lowTemp = yeast.get(0).getLowTemp();
    int highTemp = yeast.get(0).getHighTemp();
    String desc = yeast.get(0).getDescription();

    @Test
    public void getName() {
        assertTrue(NAME, name.contentEquals(NAME));
    }

    @Test
    public void getFlocculation() {
        assertTrue(FLOC, floc.equalsIgnoreCase(FLOC));
    }

    @Test
    public void getLowAttenuation() {
        assertTrue(Integer.toString(LOWATTEN), lowAtten == LOWATTEN);
    }

    @Test
    public void getHighAttenuation() {
        assertTrue(Integer.toString(HIGHATTEN), highAtten == HIGHATTEN);
    }

    @Test
    public void getLowTemperature() {
        assertTrue(Integer.toString(LOWTEMP), lowTemp == LOWTEMP);
    }

    @Test
    public void getHighTemperature() {
        assertTrue(Integer.toString(HIGHTEMP), highTemp == HIGHTEMP);
    }

    @Test
    public void getDescription() {
        assertTrue(DESC, desc.equalsIgnoreCase(DESC));
    }
}