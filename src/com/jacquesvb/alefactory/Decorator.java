package com.jacquesvb.alefactory;

import java.util.List;

public class Decorator extends Display {

    public String bedazzle(String type, String inputString) {
        String newString;
        newString = "********************\n";
        newString = newString + "*" + showType(type, inputString) + "\n";
        newString = newString + "********************";
        return newString;
    }

    public String bedazzle(String type, int inputInt) {
        String newString;
        newString = "********************\n";
        newString = newString + "*" + showType(type, inputInt) + "\n";
        newString = newString + "********************";
        return newString;
    }

    public String bedazzle(String type, List<Float> inputFloat) {
        String newString;
        newString = "********************\n";
        newString = newString + "*" + showType(type, inputFloat) + "\n";
        newString = newString + "********************";
        return newString;
    }
}
