package pl.coderslab;


import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
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


    }
}










