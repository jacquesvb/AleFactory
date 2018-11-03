import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonReader {

    public static void main(String[] args) {
        JacksonReader obj = new JacksonReader();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Convert JSON string from file to Object
            Yeast yeast = mapper.readValue(new File("src/Data/yeast.json"), Yeast.class);
            System.out.println(yeast);

            // Pretty print
            String prettyYeast1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(yeast);
            System.out.println(prettyYeast1);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
