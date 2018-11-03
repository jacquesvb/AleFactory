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
        YeastSelect yeastSelect = new YeastSelect();
        yeastSelect.name(yeast.get(yeastIndex).getName());
        yeastSelect.floc(yeast.get(yeastIndex).getFloc());
        yeastSelect.description(yeast.get(yeastIndex).getDescription());
        yeastSelect.lowTemp(yeast.get(yeastIndex).getLowTemp());
        yeastSelect.highTemp(yeast.get(yeastIndex).getHighTemp());
        yeastSelect.lowAttenuation(yeast.get(yeastIndex).getLowAttenuation());
        yeastSelect.highAttenuation(yeast.get(yeastIndex).getHighAttenuation());

        return yeastSelect;
    }
}
