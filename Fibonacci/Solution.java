/*
 * Написать реализацию поиска n-го числа Фибоначчи.
 * 1 1 2 3 5 8 12...
 */
package Fibonacci;

class Solution {
    private static int fib(int n) {
        if (n < 3) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(30));
    }
};
