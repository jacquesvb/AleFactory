package Malt;

import java.util.List;

public class MaltFactory {

    private MaltData maltData = new MaltData();
    private List<Malt> malt = maltData.getMaltData();
    private int quantity = malt.size();

    public Malts getMalt(String maltType) {
        if(maltType == null) {
            return null;
        }
        String name;
        for(int i = 0; i < quantity; i++) {
            name = malt.get(i).getName();
            if(maltType.equalsIgnoreCase(name)) {
                return buildMalt(i);
            }
        }
        return null;
    }

    private Malts buildMalt(int maltIndex) {
        MaltSelect maltSelect = new MaltSelect(
                malt.get(maltIndex).getName(),
                malt.get(maltIndex).getDescription(),
                malt.get(maltIndex).getLovibond(),
                malt.get(maltIndex).getStyle()
        );
        return maltSelect;
    }
}
