package com.jacquesvb.alefactory;

import java.util.List;

public class Decorator1 implements IDisplay {

    private IDisplay display;

    public Decorator1(IDisplay idisplay) {
        display = idisplay;
    }

    public String showType(String type, String inputString) {
        String newString = "********************\n";
        newString += "*" + display.showType(type, inputString) + "\n";
        newString += "********************";
        return newString;
    }
}
