package com.jacquesvb.alefactory;

import java.util.List;

public class Decorator extends Display {

    public String bedazzle(String type, String inputString) {
        String newString = "********************\n";
        newString += "*" + showType(type, inputString) + "\n";
        newString += "********************";
        return newString;
    }

    public String bedazzle(String type, int inputInt) {
        String newString = "********************\n";
        newString += "*" + showType(type, inputInt) + "\n";
        newString += "********************";
        return newString;
    }

    public String bedazzle(String type, List<Float> inputFloat) {
        String newString = "********************\n";
        newString += "*" + showType(type, inputFloat) + "\n";
        newString += "********************";
        return newString;
    }
}
