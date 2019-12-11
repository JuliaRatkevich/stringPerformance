package com.julia;

public class Application {

    public static void main(String[] args) {

        StringPerformanceTester tester = new StringPerformanceTester("abcd123");

        NaiveConcatenator naiveConcatenator = new NaiveConcatenator();
        long time = tester.perform(naiveConcatenator, 100000);
        System.out.println("Naive: " + time);

        StringBuilderConcatenator stringBuilderConcatenator = new StringBuilderConcatenator();
        time = tester.perform(stringBuilderConcatenator, 100000);
        System.out.println("String builder: " + time);
    }
}
