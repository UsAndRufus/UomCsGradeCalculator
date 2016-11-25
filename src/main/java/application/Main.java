package application;

import grades.FinalGrade;
import json.JsonParser;

public class Main {

    public static void main(String[] args) {
        JsonParser jsonParser = new JsonParser(args[0]);

        Menu menu = new Menu(jsonParser.getJsonWrapper());

        menu.display();
    }
}
