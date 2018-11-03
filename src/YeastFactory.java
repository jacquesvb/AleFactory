import java.util.List;

public class YeastFactory {

    YeastData yeastData = new YeastData();
    List<Yeast> yeast = yeastData.getYeastData();
    int quantity = yeast.size();

    public Yeasts getYeast(String yeastType) {
        if(yeastType == null) {
            return null;
        }
        String name;
        for(int i = 0; i < quantity; i++) {
            name = yeast.get(i).getName();
            if(yeastType.equalsIgnoreCase(name)) {
                return buildYeast(i);
            }
        }
        return null;
    }

    private Yeasts buildYeast(int yeastIndex) {
        YeastSelect yeastSelect = new YeastSelect(
                yeast.get(yeastIndex).getName(),
                yeast.get(yeastIndex).getFloc(),
                yeast.get(yeastIndex).getDescription(),
                yeast.get(yeastIndex).getLowTemp(),
                yeast.get(yeastIndex).getHighTemp(),
                yeast.get(yeastIndex).getLowAttenuation(),
                yeast.get(yeastIndex).getHighAttenuation()
                );
        return yeastSelect;
    }
}
