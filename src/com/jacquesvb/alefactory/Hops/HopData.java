package com.jacquesvb.alefactory.Hops;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HopData {
    private byte[] hopData;
    private ObjectMapper mapper = new ObjectMapper();
    private List<Hop> hop;

    public List<Hop> getHopData() {
        try {
            hopData = Files.readAllBytes(Paths.get("src/com/jacquesvb/alefactory/Data/hops.json"));
            System.out.println("This is Hop Data: " + hopData);
            hop = mapper.readValue(hopData, new TypeReference<List<Hop>>(){});

            return hop;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
