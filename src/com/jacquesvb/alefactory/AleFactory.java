package com.jacquesvb.alefactory;

import com.jacquesvb.alefactory.Hops.HopFactory;
import com.jacquesvb.alefactory.Hops.Hops;
import com.jacquesvb.alefactory.Malt.MaltFactory;
import com.jacquesvb.alefactory.Malt.Malts;
import com.jacquesvb.alefactory.Yeast.YeastFactory;
import com.jacquesvb.alefactory.Yeast.Yeasts;

import java.util.Iterator;
import java.util.List;

public class AleFactory {

    /**
     * Create factories for hops, malt, and yeast
     * 1. Read json data and add the name to a list.
     * 2. Create an object for each json object
     *
     */

    public static void main(String[] args) {
        Display display = new Display();
        YeastFactory yeastFactory = new YeastFactory();
        HopFactory hopFactory = new HopFactory();
        MaltFactory maltFactory = new MaltFactory();

        Yeasts abbey_ale = yeastFactory.getYeast("Abbey Ale");
        Yeasts noData = yeastFactory.getYeast("Nodata Ale");

        System.out.println(display.showType("Yeast name", abbey_ale.name()));
        System.out.println(display.showType("Description", abbey_ale.description()));
        System.out.println(display.showType("High temperature", abbey_ale.highTemp()));

        System.out.println("\n");
        noData.name();
        noData.description();

        System.out.println("\n");

        Hops chinook = hopFactory.getHop("Chinook");
        System.out.println(display.showType("Hop name", chinook.name()));

        System.out.println("\n");
        System.out.println("Standard List of Styles");
        System.out.println(chinook.style());
        System.out.println("\n");
        System.out.println("Convert List to a comma-separated string:");
        Adapter adp = new Adapter();
        System.out.println(adp.Stringify(chinook.style()));
        Decorator dec = new Decorator();
        System.out.println("\n");
        System.out.println("Convert List to a comma-separated bedazzled string:");
        System.out.println(dec.bedazzle("Hop styles: ", adp.Stringify(chinook.style())));

        System.out.println("\n");

        Malts coffeeMalt = maltFactory.getMalt("Coffee Malt");
        System.out.println(display.showType("Malt name", coffeeMalt.name()));
        System.out.println(display.showType("Malt Description", coffeeMalt.description()));
        System.out.println(display.showType("Lovibond", coffeeMalt.lovibond()));
    }
}
