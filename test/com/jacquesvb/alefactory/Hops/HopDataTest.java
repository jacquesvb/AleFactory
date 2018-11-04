package com.jacquesvb.alefactory.Hops;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HopDataTest {

    final String NAME = "TestHops";
    final String FLAVOR = "Quite terrible actually.";
    final float LOWALPHA = 1.5f;
    final float HIGHALPHA = 10f;
    final String STYLE1 = "Test Style 1";
    final String STYLE2 = "Test Style 2";
    final String STYLE3 = "Test Style 3";
    final String SUB1 = "Substitute hop 1";
    final String SUB2 = "Substitute hop 2";

    private HopData hopData = new HopData();
    private List<Hop> hop = hopData.getHopData();
    String name = hop.get(0).getName();
    String flavor = hop.get(0).getFlavor();
    float lowAlpha = hop.get(0).getLowAlphaAcid();
    float highAlpha = hop.get(0).getHighAlphaAcid();
    List<String> style = hop.get(0).getStyles();
    List<String> sub = hop.get(0).getSubstitute();

    @Test
    public void getName() {
        assertTrue(NAME, name.contentEquals(NAME));
    }

    @Test
    public void getFlavor() {
        assertTrue(FLAVOR ,flavor.contentEquals(FLAVOR));
    }

    @Test
    public void getLowAlpha() {

        assertTrue(Float.toString(LOWALPHA),lowAlpha == LOWALPHA);
    }

    @Test
    public void getHighAlpha() {

        assertTrue(Float.toString(HIGHALPHA),highAlpha == HIGHALPHA);
    }

    @Test
    public void getStyles() {
        assertTrue(STYLE1 + " " + STYLE2 + " " + STYLE3,
                style.get(0).equalsIgnoreCase(STYLE1) &&
                        style.get(1).equalsIgnoreCase(STYLE2) &&
                        style.get(2).equalsIgnoreCase(STYLE3)
        );
    }

    @Test
    public void getSubstitute() {
        assertTrue(SUB1 + " " + SUB2,
                sub.get(0).equalsIgnoreCase(SUB1) &&
                sub.get(1).equalsIgnoreCase(SUB2)
        );
    }
}