package main;

import input_manager.ConsoleInputManager;
import input_manager.FileInputManager;
import output_manager.ConsoleOutputManager;
import output_manager.FileOutputManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputPath = "src/main/resources/input.txt";
        String outputPath = "src/main/resources/output.txt";


        System.out.println("Chose one of 4 options (write one of the numbers to console):");
        System.out.println("1 -> numbers will be taken from file {inputPath} and written to {outputPath}");
        System.out.println("2 -> numbers will be taken from console (your input) and written to file {outputPath}");
        System.out.println("3 -> numbers will be taken from console (your input) and written to console");
        System.out.println("4 -> numbers will be taken from file {inputPath} and written to console");

        Scanner sc = new Scanner(System.in);
        System.out.print("Your input: ");
        int userAnswer = Integer.parseInt(sc.nextLine());

        if (userAnswer == 1) {
            ArrayList<Integer> sortedArrayList = FileInputManager.getSortedArrayListFromFile(inputPath);
            FileOutputManager.writeNumbersFromArrayListToFile(sortedArrayList, outputPath);

        } else if (userAnswer == 2) {
            ArrayList<Integer> listFromScanner = ConsoleInputManager.getFilteredListFromScanner();
            FileOutputManager.writeNumbersFromArrayListToFile(listFromScanner, outputPath);

        } else if (userAnswer == 3) {
            ArrayList<Integer> listFromScanner = ConsoleInputManager.getFilteredListFromScanner();
            ConsoleOutputManager.printOutput(listFromScanner);


        } else if (userAnswer == 4) {

            ArrayList<Integer> sortedArrayList = FileInputManager.getSortedArrayListFromFile(inputPath);
            ConsoleOutputManager.printOutput(sortedArrayList);

        } else {
            System.out.println("ERROR you must chose integer number from interval [1,4]");
        }


    }
}
