import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON_Reader {
    public static void main(String args[]) {
        JSONParser parser = new JSONParser();

//        try {
//            JSONParser parsera = new JSONParser();
//            Object obj1 = parsera.parse(yourJsonString);
//            JSONObject jsonObject = (JSONObject) obj1;
//            Object obj2=parsera.parse((String) jsonObject.get(“children”));
//            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
//                JSONArray jsonArray1=new JSONArray((JSONObject)obj2);
//                for (int i = 0; i < jsonArray1.length(); i++) {
//                    org.json.JSONObject c1 = jsonArray1.getJSONObject(i);
//                    Object obj3=parsera.parse((String) c1.get("children"));
//                    JSONArray jsonArray2=new JSONArray((JSONObject)obj2);
//                    for (int j = 0; j < jsonArray2.length(); j++) {
//                        org.json.JSONObject c2 = jsonArray2.getJSONObject(j);
                        //Now you can read third child object values from object c2 } } } } catch (Exception e) { }

        try {
            Object object = parser.parse(new FileReader("src/amigaworld.json"));
            JSONObject jsonObject = (JSONObject)object;
            JSONArray amigaworld = (JSONArray) jsonObject.get("amigaworld");
            JSONObject amigaworldObject = (JSONObject) amigaworld.get(0);
            String issue = amigaworldObject.get("issue").toString();
            System.out.println(issue);
//            System.out.println(jsonArray.size());
//            Object object = parser.parse(new FileReader("src/sample.json"));
//            JSONArray jsonArray = (JSONArray)object;
//            System.out.println(jsonArray.size());
//
//            for(int i=0; i < jsonArray.size();i++) {
//                JSONObject jsonObject = (JSONObject)jsonArray.get(i);
//                String name = (String)jsonObject.get("Name");
//                System.out.println(name);
//
//                long age = (Long)jsonObject.get("Age");
//                System.out.println(age);
//
//                JSONArray country = (JSONArray)jsonObject.get("Countries");
//                Iterator iterator = country.iterator();
//                while(iterator.hasNext()) {
//                    System.out.println(iterator.next());
//                }
//            }
        } catch(FileNotFoundException fe) {
            fe.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
