package input_manager;

import filter.MyFilter;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInputManager {

    public static ArrayList<Integer> getFilteredListFromScanner() {
        Scanner sc = new Scanner(System.in);
        MyFilter filter = new MyFilter();
        System.out.println("Write numbers to console and separate them with Enter button.");
        System.out.println("To end the input, please write '-' character and press Enter.");
        ArrayList<Integer> listFromScanner = new ArrayList<>();
        String varFromScanner = "";

        while (true) {
            varFromScanner = sc.nextLine();
            if (varFromScanner.equals("-")) {
                break;
            }
            listFromScanner.add(Integer.parseInt(varFromScanner));
        }
        ArrayList<Integer> filteredListFromScanner = filter.getFilteredArrayList(listFromScanner);
        System.out.println("LOG: Console input ended.");
        return filteredListFromScanner;
    }
}
