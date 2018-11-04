package com.jacquesvb.alefactory.Malt;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MaltDataTest {

    final String NAME = "TestMalt";
    final String DESCRIPTION = "This is a test malt.";
    final float LOVIBOND = 14.4f;
    final String STYLE1 = "Test Style 1";
    final String STYLE2 = "Test Style 2";

    private MaltData maltData = new MaltData();
    private List<Malt> malt = maltData.getMaltData();
    String name = malt.get(0).getName();
    String description = malt.get(0).getDescription();
    List<Float> lovibond = malt.get(0).getLovibond();
    List<String> style = malt.get(0).getStyle();

    @Test
    public void getName() {
        assertTrue(NAME, name.contentEquals(NAME));
    }

    @Test
    public void getDescription() {
        assertTrue(DESCRIPTION ,description.equalsIgnoreCase(DESCRIPTION));
    }

    @Test
    public void getLovibond() {
        assertTrue(Float.toString(LOVIBOND),lovibond.get(0) == LOVIBOND);
    }

    @Test
    public void getStyle() {
        assertTrue(STYLE1 + " " + STYLE2,
                style.get(0).equalsIgnoreCase(STYLE1) &&
                        style.get(1).equalsIgnoreCase(STYLE2)
        );
    }
}