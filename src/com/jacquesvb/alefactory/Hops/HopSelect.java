package com.jacquesvb.alefactory.Hops;

import java.util.ArrayList;
import java.util.List;

public class HopSelect implements Hops {

    private String name, flavor;
    private float lowAlphaAcid, highAlphaAcid;
    private List<String> styles, substitute;

    public HopSelect(String name, String flavor, float lowAlphaAcid, float highAlphaAcid, List<String> styles,
                     List<String> substitute) {
        this.name = name;
        this.flavor = flavor;
        this.lowAlphaAcid = lowAlphaAcid;
        this.highAlphaAcid = highAlphaAcid;
        this.styles = styles;
        this.substitute = substitute;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String flavor() {
        return flavor;
    }

    @Override
    public List<String> substitute() {
        List<String> subList = new ArrayList<>();
        subList.addAll(substitute);
        return subList;
    }

    @Override
    public List<String> style() {
        List<String> styleList = new ArrayList<>();
        styleList.addAll(styles);
        return styleList;
    }

    @Override
    public float lowAlpha() {
        return lowAlphaAcid;
    }

    @Override
    public float highAlpha() {
        return highAlphaAcid;
    }
}

