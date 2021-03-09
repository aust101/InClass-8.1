package com.overaitis.assignment_8_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static boolean running = true;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Double> gradeMap = new HashMap<>();
        while(running) {
            System.out.println("(" + gradeMap.size() + "). Please enter the student's name:");
            String name = scanner.nextLine();
            System.out.println("(" + gradeMap.size() + "). Please enter the \"" + name + "\"'s grade:");
            String gradeString = scanner.nextLine();
            try {
                double grade = Double.valueOf(gradeString);
                gradeMap.put(name, grade);
                System.out.println("Student added! Would you like to continue? (Y/N)");
                String more = scanner.nextLine();
                if(!more.equalsIgnoreCase("Y"))
                    running = false;
            }
            catch (Exception e) {
                System.out.println("Invalid input! Please enter the information correctly...");
            }
        }
        System.out.println("\nOutputting grade map:\n");
        for (Map.Entry<String, Double> entry : gradeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "%");
        }
    }
}
