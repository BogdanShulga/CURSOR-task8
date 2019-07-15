package main.java.handlers;

import main.java.customExceptions.GreaterThanThresholdException;
import main.java.customExceptions.IntNotEvenException;
import main.java.customExceptions.NotPalindromeException;
import main.java.customExceptions.OptionalNullException;

import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class Checker {
    public static void checkPalindrome()
                    throws NotPalindromeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string you want to check: ");
        String clean = scanner.nextLine().replaceAll("\\s+", "");
        if (clean.equalsIgnoreCase(new StringBuilder(clean).reverse().toString())) {
            System.out.println("The string is palindrome.");
        } else {
            throw new NotPalindromeException("The string is not palindrome!");
        }
    }

    public static void checkInt()
                    throws GreaterThanThresholdException, IntNotEvenException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer you want to check for evenness: ");
        int i = 1;
        try {
            i = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (i > 100) {
            throw new GreaterThanThresholdException("The integer is greater then 100!");
        } else if (i % 2 == 0) {
            System.out.println("The integer, you entered, is even.");
        } else {
            throw new IntNotEvenException("The integer is not even!");
        }
    }

    public static void checkOptionalNull()
                    throws OptionalNullException {
        Integer i = new Random().nextInt(100) > 30 ? null : 3;
        Optional<Integer> integerOptional = Optional.ofNullable(i);
        System.out.println("Checking random integer...");
        System.out.println("Random integer is "
                + integerOptional.orElseThrow(OptionalNullException::new));
    }

    public static void doBadThings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter \"1\" to throw StackOverflowError " +
                "or \"2\" to throw OutOfMemoryError ");
        int i = 0;
        try {
            i = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You entered incorrect data!");
        }
        if (i == 1) {
            noooooSOF();
        } else if (i == 2) {
            noooooOOM();
        } else {
            System.out.println("You entered incorrect data!");
        }

    }

    private static void noooooSOF() {
        noooooSOF();
    }

    private static void noooooOOM() {
        Integer[] integers = new Integer[100000 * 100000];
    }
}
