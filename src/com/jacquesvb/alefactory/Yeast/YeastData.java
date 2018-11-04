package com.jacquesvb.alefactory.Yeast;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class YeastData {
    private byte[] yeastData;
    private ObjectMapper mapper = new ObjectMapper();
    private List<Yeast> yeast;

    public List<Yeast> getYeastData() {
        try {
            yeastData = Files.readAllBytes(Paths.get("src/com/jacquesvb/alefactory/Data/yeast.json"));
            yeast = mapper.readValue(yeastData, new TypeReference<List<Yeast>>(){});

            return yeast;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
