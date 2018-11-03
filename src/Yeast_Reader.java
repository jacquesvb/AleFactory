import java.util.List;

public class Yeast_Reader {
    public static void main(String args[]) {
        try {
            YeastData yeastData = new YeastData();
            List<Yeast> yeast = yeastData.getYeastData();
            System.out.println(yeast.size());
            System.out.println("Yeast Object\n" + yeast);
            System.out.println(yeast.get(1).getName());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
