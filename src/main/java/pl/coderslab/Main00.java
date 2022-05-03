package pl.coderslab;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// PROBA ZROBIENIA WARSZTATU Z TABLICAMI


public class Main00 {
    public static void main(String[] args) {
//
//// Czytanie pliku i tworzenie tablicy 2d
//        String fileName = "tasks.csv";
//        File file = new File(fileName);
//        StringBuilder read = new StringBuilder();
//        int counter = 0;
//        int counter1 = 0;
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNextLine()) {
//                counter1++;
//                read.append(scanner.nextLine() + "\n");
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Brak pliku");
//        }
//
//
//        String[] array1 = StringUtils.split(read.toString(), "\n");
//        StringBuilder read1 = new StringBuilder();
//
//
//        for (int i = 0; i < array1.length; i++) {
//            read1.append(array1[i] + ",");
//        }
//
//        String[][] tasks = new String[counter1][3];
//        String[] array2 = StringUtils.split(read1.toString(), ",");
//
//        for (int i = 0; i < tasks.length; i++) {
//            for (int j = 0; j < tasks[i].length; j++) {
//
//                tasks[i][j] = array2[counter];
//                counter++;
//            }
//
//
//        }
//
//        // Wybor akcji
//        String[] optionsToChoose = {"add", "remove", "list", "exit"};
//
//        System.out.println(ConsoleColors.BLUE + "Please select an option:");
//
//        for (int i = 0; i < optionsToChoose.length; i++) {
//            System.out.println(ConsoleColors.WHITE + optionsToChoose[i].toString());
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        String action = scanner.nextLine();
//        String[] addArray = new String[3];
//
//
//        while (!action.equals("add") && !action.equals("remove") && !action.equals("list") && !action.equals("exit")) {
//            System.out.println("You have to type one of these: add, remove, list, exit");
//            action = scanner.nextLine();
//        }
//
//        if (action.equals("add")) {
//            System.out.println("Please add task description");
//            String newTask = scanner.nextLine();
//
//            System.out.println("Please add task due date (yyyy-mm-dd): ");
//            String date = scanner.nextLine();
//            while (date.charAt(0) != '2') {
//                System.out.println("Date example \"2022-05-02\"");
//                date = scanner.nextLine();
//            }
//
//            System.out.println("Is your task important: true / false ");
//            String important = scanner.nextLine();
//            while (!important.equals("true") && !important.equals("false")) {
//                System.out.println("You have to type true or false");
//                important = scanner.nextLine();
//            }
//
//            addArray[0] = newTask;
//            addArray[1] = date;
//            addArray[2] = important;
//            // 4             3
//            String[][] tasks2 = new String[tasks.length + 1][3];
//            //        2
//            for (int i = 0; i < tasks2.length - 2; i++) {
//                for (int j = 0; j < 3; j++) {
//                    tasks2[i][j] = tasks[i][j];
//                }
//            }
//            for (int i = 0; i < 3; i++) {
//                tasks2[tasks2.length - 1][i] = addArray[i];
//            }
//
//            for (int i = 0; i < tasks2.length; i++) {
//                for (int j = 0; j < tasks2[i].length; j++) {
//                    System.out.println(ArrayUtils.toString(tasks2[i][j]));
//                }
//            }
//
//        } else if (action.equals("list")) {
//            for (int i = 0; i < counter1; i++) {
//                for (int j = 0; j < 3; j++) {
//                    System.out.println();
//                }
//            }
//
//        }
        // NAUKA LIST
        ArrayList<String> namestest = new ArrayList<>();
        //Create                                                   0        1       2       3
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        //Get element
        System.out.println(names.get(1));

        //Get size
        System.out.println(names.size());

        //Add element on the end
        names.add("Wiktor");

        //Set element
        names.set(0,"Wiktor");
        System.out.println();

        //Remove element
        names.remove(0);
        names.remove("Eric");

        //Print
        System.out.println(names);
    }
}
