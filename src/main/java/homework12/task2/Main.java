package homework12.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Address address = new Address("Ukraine","Kiev","Khreshchatyk");

        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        String json = gson.toJson(address);

        System.out.println(json);

        Files.write(Paths.get("C:\\Users\\User\\IdeaProjects\\java_professional\\src\\main\\resources\\GsonParser.json"),
                json.getBytes(), StandardOpenOption.CREATE);
    }
}
