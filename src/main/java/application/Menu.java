package application;

import grades.FinalGrade;
import json.JsonWrapper;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    private JsonWrapper jsonWrapper;

    public Menu(JsonWrapper jsonWrapper) {
        this.jsonWrapper = jsonWrapper;
    }

    public void display() {

        boolean running = true;
        while (running) {
            printMenuOptions();

            running = interpretMenuChoice();
        }

    }

    private boolean interpretMenuChoice() {
        boolean shouldContinue = true;

        String input = scanner.nextLine();

        switch (input) {
            case "1":
                showCurrentFinalGrade();
                break;
            case "2":
                break;
            case "3":
                shouldContinue = false;
                break;
            default:
                System.out.println("Unrecognised option. Please try again");
                break;
        }

        return shouldContinue;
    }

    private void printMenuOptions() {
        System.out.println("\nWelcome to the Grade Calculator. Choose an option from below");
        System.out.println("1. Show your current final grade");
        System.out.println("2. Enter interactive target grade mode");
        System.out.println("3. Exit application");
    }

    private void showCurrentFinalGrade() {
        FinalGrade finalGrade = jsonWrapper.getFinalGrade();

        finalGrade.print();
    }
}
