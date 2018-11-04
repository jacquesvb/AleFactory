package com.jacquesvb.alefactory.Malt;

import java.util.List;

public class Malt {

    private String name;
    private String description;
    private List<Float> lovibond;
    private List<String> style;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Float> getLovibond() {
        return lovibond;
    }

    public void setLovibond(List<Float> lovibond) {
        this.lovibond = lovibond;
    }

    public List<String> getStyle() {
        return style;
    }

    public void setStyle(List<String> style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "com.jacquesvb.alefactory.Malt.com.jacquesvb.alefactory.Malt [name=" + name + ", description=" + description + ", lovibond=" + lovibond + ", style=" +
                style + "]";
    }
}
