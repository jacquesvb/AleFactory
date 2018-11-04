package Malt;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MaltData {
    private byte[] maltData;
    private ObjectMapper mapper = new ObjectMapper();
    private List<Malt> malt;

    public List<Malt> getMaltData() {
        try {
            maltData = Files.readAllBytes(Paths.get("src/Data/malt.json"));
            malt = mapper.readValue(maltData, new TypeReference<List<Malt>>(){});

            return malt;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
