package pl.coderslab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskManager {



    public static void readFileAndOutput (String fileName){
        File file = new File(fileName);
        StringBuilder read = new StringBuilder();
        try(Scanner scanner = new Scanner(file);){
            while (scanner.hasNextLine()) {
                read.append(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }
        System.out.println(read.toString());
    }




    public static void main(String[] args) {


    }
}
