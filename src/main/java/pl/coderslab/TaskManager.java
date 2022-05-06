package pl.coderslab;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {

        String filename = "tasks.csv";
        File file = new File(filename);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + ",");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Brak pliku o tej nazwie");
        }

        ArrayList<String> tasksList = new ArrayList<>();
        String[] arrayOfTasks = StringUtils.split(stringBuilder.toString(), ",");
        tasksList.addAll(Arrays.asList(arrayOfTasks));
        System.out.println(tasksList);

        // Action choose
        System.out.println(ConsoleColors.BLUE + "Please select an option:");
        String[] actionsToChooseArray = {"add", "remove", "list", "exit"};
        for (int i = 0; i < actionsToChooseArray.length; i++) {
            System.out.println(ConsoleColors.WHITE_BRIGHT + actionsToChooseArray[i].toString());

        }
        Scanner actionScanner = new Scanner(System.in);
        String action = actionScanner.nextLine();
        while (!action.equals("exit")) {
            while (action.equals("add") || action.equals("remove") || action.equals("list")) {
                if (action.equals("add")) {
                    System.out.println("Please add task description");
                    String newTask = actionScanner.nextLine();
                    System.out.println("Please add task due date (yyyy-mm-dd): ");
                    String date = actionScanner.nextLine();
                    while (date.charAt(0) != '2') {
                        System.out.println("Date example \"2022-05-02\"");
                        date = actionScanner.nextLine();
                    }
                    System.out.println("Is your task important: true / false ");
                    String important = actionScanner.nextLine();
                    while (!important.equals("true") && !important.equals("false")) {
                        System.out.println("You have to type true or false");
                        important = actionScanner.nextLine();

                    }
                    tasksList.add(newTask + " ");
                    tasksList.add(date + " ");
                    tasksList.add(important);
                    System.out.println("New task added");
                    break;

                } else if (action.equals("list")) {
                    int k = 0;
                    for (int i = 0; i < tasksList.size(); i++) {
                        if (i % 3 == 0){
                            System.out.print(ConsoleColors.WHITE_BRIGHT + k + ": ");
                            k++;
                        }
                        System.out.print(ConsoleColors.WHITE_BRIGHT + tasksList.get(i));
                        if ((i - 2) % 3 == 0) {
                            System.out.println();
                        }

                    }
                    break;
                } else if (action.equals("remove")){

                    System.out.println("Which task would u like to remove ? Please select number");
                    String numberToRemove = actionScanner.nextLine();
                    try {
                        while (!NumberUtils.isParsable(numberToRemove)) {
                            System.out.println("Incorect argument passed. Please give number greater or equal 0");
                            numberToRemove = actionScanner.nextLine();
                        }
                        tasksList.remove(Integer.parseInt(numberToRemove) * 3);
                        tasksList.remove(Integer.parseInt(numberToRemove) * 3);
                        tasksList.remove(Integer.parseInt(numberToRemove) * 3);
                        System.out.println("Task number: " + numberToRemove + " removed");
                        break;
                    }catch (IndexOutOfBoundsException e) {

                        System.out.println("Nie ma takiego numeru tablicy");
                    }
                }
            }
            System.out.println(ConsoleColors.BLUE + "\n" + "Choose one of these: add, remove, list, exit");
            action = actionScanner.nextLine();

        }
        Path close = Paths.get(filename);

        try {
                Files.write(close, tasksList);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(ConsoleColors.BLUE + "Bye Bye");
    }
}






