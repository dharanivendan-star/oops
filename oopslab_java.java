package oopslab_java;

import java.util.InputMismatchException;
import java.util.Scanner;


public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCount;
        // prompt safely
        while (true) {
            try {
                System.out.print("How many students? ");
                studentCount = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException ex) {
                System.err.println("Please enter an integer.");
                sc.nextLine();
            }
        }

        String[] names = new String[studentCount];
        int[] marks = new int[studentCount];
        for (int i = 0; i <names.length ; i++) {
            System.out.printf("Student #%d name: ", i+1);
            names[i] = sc.nextLine();

            while (true) {
                System.out.printf("Mark (0–100) for %s: ", names[i]);
                try {
                    marks[i] = sc.nextInt();
                    sc.nextLine();
                    if (marks[i] < 0 || marks[i] > 100) {
                        System.out.println("Mark must be 0–100");
                    }
                    break;
                } catch (InputMismatchException ex) {
                    System.err.println("Not a valid number. Try again.");
                    sc.nextLine();
                } finally{
                    System.out.println("thk");
                }
            }
        }

        sc.close();

        }


    }



