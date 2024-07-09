package lab12;

import java.util.Stack;

public class PrimeNumbers {
    public static void main(String[] args) {
        Stack<Integer> primeStack = new Stack<>();
        int number = 2;

        while (primeStack.size() < 50) {
            if (isPrime(number)) {
                primeStack.push(number);
            }
            number++;
        }

        while (!primeStack.isEmpty()) {
            System.out.println(primeStack.pop());
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

