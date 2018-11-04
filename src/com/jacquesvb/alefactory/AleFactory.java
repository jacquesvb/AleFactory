package com.jacquesvb.alefactory;

import com.jacquesvb.alefactory.Hops.HopFactory;
import com.jacquesvb.alefactory.Hops.Hops;
import com.jacquesvb.alefactory.Malt.MaltFactory;
import com.jacquesvb.alefactory.Malt.Malts;
import com.jacquesvb.alefactory.Yeast.YeastFactory;
import com.jacquesvb.alefactory.Yeast.Yeasts;

public class AleFactory {

    /**
     * Create factories for hops, malt, and yeast
     * 1. Read json data and add the name to a list.
     * 2. Create an object for each json object
     *
     */

    public static void main(String[] args) {
        YeastFactory yeastFactory = new YeastFactory();
        HopFactory hopFactory = new HopFactory();
        MaltFactory maltFactory = new MaltFactory();

        Yeasts abbey_ale = yeastFactory.getYeast("Abbey Ale");
        Yeasts noData = yeastFactory.getYeast("Nodata Ale");
        abbey_ale.name();
        abbey_ale.lowTemp();
        abbey_ale.highTemp();
        abbey_ale.description();
        System.out.println("\n");
        noData.name();
        noData.description();

        System.out.println("\n");

        Hops chinook = hopFactory.getHop("Chinook");
        chinook.name();
        chinook.flavor();
        chinook.highAlpha();
        chinook.lowAlpha();
        chinook.substitute();

        System.out.println("\n");

        Malts coffeeMalt = maltFactory.getMalt("Coffee com.jacquesvb.alefactory.Malt");
        coffeeMalt.name();
        coffeeMalt.description();
        coffeeMalt.lovibond();
        coffeeMalt.style();
    }
}
