package com.jacquesvb.alefactory;

import com.google.common.collect.Iterables;

import java.util.List;

public class ListToString {

    /*
    Converts a List to a comma separated string
     */

    public String Stringify(List<String> getList) {
        String lastElement = Iterables.getLast(getList);
        String newList = "";
        for (String tmp : getList) {
            if(!tmp.equalsIgnoreCase(lastElement)) {
                newList = newList + tmp + ", ";
            } else {
                newList = newList + tmp;
            }
        }
        return newList;
    }
}
