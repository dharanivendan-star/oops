package oopslab_java;
import java.util.Scanner;

public class Prime {
    // Method to check if n is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        // Check divisibility from 2 up to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}




