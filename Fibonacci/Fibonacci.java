package Fibonacci;

import java.util.ArrayList;

/**
 * Fibonacci
 */
public class Fibonacci {
    public static void main(String args[]) {
        fib(12);
    }

    public static void fib(int num) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        for (int i = 2; i < num; i++) {
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }

        System.out.println(arr);
    }
}