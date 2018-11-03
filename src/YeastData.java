import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class YeastData {
    byte[] yeastData;
    ObjectMapper mapper = new ObjectMapper();
    List<Yeast> yeast;

    public List<Yeast> getYeastData() {
        try {
            yeastData = Files.readAllBytes(Paths.get("src/Data/yeast.json"));
            yeast = mapper.readValue(yeastData, new TypeReference<List<Yeast>>(){});

            return yeast;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
