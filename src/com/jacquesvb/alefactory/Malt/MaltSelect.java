package com.jacquesvb.alefactory.Malt;

import java.util.ArrayList;
import java.util.List;

public class MaltSelect implements Malts {

    private String name, description;
    private List<Float> lovibond;
    private List<String> styles;

    public MaltSelect(String name, String description, List<Float> lovibond, List<String> styles) {
        this.name = name;
        this.description = description;
        this.lovibond = lovibond;
        this.styles = styles;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public List<Float> lovibond() {
        List<Float> lovibondList = new ArrayList<>();
        lovibondList.addAll(lovibond);
        return lovibondList;
    }

    @Override
    public List<String> style() {
        List<String> styleList = new ArrayList<>();
        styleList.addAll(styles);
        return styleList;
    }
}
