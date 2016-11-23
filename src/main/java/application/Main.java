package application;

import grades.FinalGrade;
import json.JsonParser;

public class Main {

    public static void main(String[] args) {
        JsonParser jsonParser = new JsonParser(args[0]);

        FinalGrade finalGrade = jsonParser.getFinalGrade();

        finalGrade.print();
    }
}
