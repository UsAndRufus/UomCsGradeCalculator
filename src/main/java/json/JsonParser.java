package json;

import com.google.gson.Gson;
import grades.FinalGrade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class JsonParser {

    private Gson gson = new Gson();

    private String jsonString;
    private JsonWrapper jsonWrapper;

    public JsonParser(String path) {
        try {
            jsonString = readJsonFile(path);
            jsonWrapper = gson.fromJson(jsonString, JsonWrapper.class);
        } catch (IOException e) {
            System.out.println("IOException thrown: " + e);
        }
    }

    private static String readJsonFile(String location) throws IOException {
        Path path = Paths.get(location).toAbsolutePath();

        System.out.println("Reading JSON file from " + path);

        return Files.lines(path).collect(Collectors.joining());
    }

    public JsonWrapper getJsonWrapper() {
        return jsonWrapper;
    }

}