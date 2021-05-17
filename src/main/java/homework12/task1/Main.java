package homework12.task1;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\User\\IdeaProjects\\java_professional\\src\\main\\resources\\jacksonParser.json");
        Address address = new Address("Ukraine", "Kiev", "Khreshchatyk");
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());


        System.out.println(address);
        try {
            writer.writeValue(f, address);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
