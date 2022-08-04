package ru.itsjava.iostreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStreamsPractice {
    public static void main(String[] args) {
//        File file = new File("src/main/resources/file.txt");
//
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            printWriter.println("Строка1");
//            printWriter.println("Строка2");
//            printWriter.println("Строка3");
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
//
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            String input;
//            while ((input = reader.readLine()) != null) {
//                System.out.println("reader.readLine() = " + input);
//            }
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        File file1 = new File("src/main/resources/file1.txt");
        File file2 = new File("src/main/resources/file2.txt");

        try (PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.println("Домашнее задание 1");
            printWriter.println("Домашнее задание 2");
            printWriter.println("Домашнее задание 3");
            printWriter.println("Домашнее задание 4");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println("Домашнее задание 5");
            printWriter.println("Домашнее задание 6");
            printWriter.println("Домашнее задание 7");
            printWriter.println("Домашнее задание 8");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        List<String> list1 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list1.add(line);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list1.add(line);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        for (String elemList1 : list1) {
            System.out.println("elemList1 = " + elemList1);
        }

        try (PrintWriter printWriter = new PrintWriter(file1)) {
            for (String line : list1) {
                printWriter.println(line);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }


    }
}
