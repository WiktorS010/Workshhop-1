package pl.coderslab;

import com.sun.jdi.Value;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {

    // Czytanie pliku i tworzenie tablicy 2d
        String fileName = "tasks.csv";
        File file = new File(fileName);
        StringBuilder read = new StringBuilder();
        int counter = 0;
        int counter1 = 0;
        try (Scanner scanner = new Scanner(file);) {
            while (scanner.hasNextLine()) {
                counter1++;
                read.append(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }


        String[] array1 = StringUtils.split(read.toString(), "\n");
        StringBuilder read1 = new StringBuilder();


        for (int i = 0; i < array1.length; i++) {
            read1.append(array1[i] + ",");
        }

        String[][] tasks = new String[counter1][3];
        String[] array2 = StringUtils.split(read1.toString(), ",");

        for (int i = 0; i < tasks.length; i++) {
            for (int j = 0; j < tasks[i].length; j++) {

                tasks[i][j] = array2[counter];
                counter++;
            }


    }


        String[] optionsToChoose = {"add", "remove", "list", "exit"};

        System.out.println(ConsoleColors.BLUE + "Please select an option:");

        for (int i = 0; i < optionsToChoose.length; i++) {
            System.out.println(ConsoleColors.WHITE + optionsToChoose[i].toString());
        }

        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();

        if (action.equals("add")){
            System.out.println("Please add task description");
            String newTask = scanner.nextLine();

            System.out.println("Please add task due date");
            String date = scanner.nextLine();

            System.out.println("Is your task important: true / false ");
            String important = scanner.nextLine();



        }else if (action.equals("list")){
            for (int i = 0; i < counter1; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println();
                }
            }


        }

        }


    }







