package main.java;

import main.java.customExceptions.GreaterThanThresholdException;
import main.java.customExceptions.IntNotEvenException;
import main.java.customExceptions.NotPalindromeException;
import main.java.customExceptions.OptionalNullException;
import main.java.handlers.Checker;

public class Main {


    public static void main(String[] args) {
        try {
            Checker.checkPalindrome();
        } catch (NotPalindromeException e) {
            e.printStackTrace();
        }

        try {
            Checker.checkInt();
        } catch (IntNotEvenException | GreaterThanThresholdException e) {
            e.printStackTrace();
        }

        try {
            Checker.checkOptionalNull();
        } catch (OptionalNullException e) {
            e.printStackTrace();
        }

        Checker.doBadThings();
    }
}
