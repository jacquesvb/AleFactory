package com.jacquesvb.alefactory;

import java.util.List;

public class Display {

    public String showType(String type, String inputString) {
        String newString = type + ": " + inputString;
        return newString;
    }

    public String showType(String type, int inputInt) {
        String newString = type + ": " + Integer.toString(inputInt);
        return newString;
    }

    public String showType(String type, List<Float> inputFloat) {
        String newString = type + ": " + inputFloat;
        return newString;
    }
}
