package com.jacquesvb.alefactory.Hops;

import java.util.List;

public class HopFactory {

    private HopData hopData = new HopData();
    private List<Hop> hop = hopData.getHopData();
    private int quantity = hop.size();

    public Hops getHop(String hopType) {
        if(hopType == null) {
            return null;
        }
        String name;
        for(int i = 0; i < quantity; i++) {
            name = hop.get(i).getName();
            if(hopType.equalsIgnoreCase(name)) {
                return buildHop(i);
            }
        }
        return null;
    }

    private Hops buildHop(int hopIndex) {
        HopSelect hopSelect = new HopSelect(
                hop.get(hopIndex).getName(),
                hop.get(hopIndex).getFlavor(),
                hop.get(hopIndex).getLowAlphaAcid(),
                hop.get(hopIndex).getHighAlphaAcid(),
                hop.get(hopIndex).getStyles(),
                hop.get(hopIndex).getSubstitute()
        );
        return hopSelect;
    }
}
