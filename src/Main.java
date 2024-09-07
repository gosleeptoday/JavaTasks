import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        System.out.print("Введите целое число (Задача 1): ");
        int num1 = scanner.nextInt();
        System.out.println(num1 % 2 == 0 ? "Четное" : "Нечетное");

        // Задача 2
        System.out.print("Введите три целых числа (Задача 2): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Минимальное число: " + Math.min(a, Math.min(b, c)));

        // Задача 3
        System.out.println("Таблица умножения на 5 (Задача 3):");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }

        // Задача 4
        System.out.print("Введите целое число N (Задача 4): ");
        int N = scanner.nextInt();
        int sum = (N * (N + 1)) / 2;
        System.out.println("Сумма от 1 до N: " + sum);

        // Задача 5
        System.out.print("Введите целое число N для Фибоначчи (Задача 5): ");
        int fibCount = scanner.nextInt();
        int aFib = 0, bFib = 1;
        for (int i = 0; i < fibCount; i++) {
            System.out.print(aFib + " ");
            int nextFib = aFib + bFib;
            aFib = bFib;
            bFib = nextFib;
        }
        System.out.println();

        // Задача 6
        System.out.print("Введите целое число для проверки на простоту (Задача 6): ");
        int primeCheck = scanner.nextInt();
        boolean isPrime = true;
        if (primeCheck < 2) isPrime = false;
        for (int i = 2; i <= Math.sqrt(primeCheck); i++) {
            if (primeCheck % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Простое число" : "Не простое число");

        // Задача 7
        System.out.print("Введите целое число N для обратного порядка (Задача 7): ");
        int reverseCount = scanner.nextInt();
        for (int i = reverseCount; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 8
        System.out.print("Введите два целых числа A и B (Задача 8): ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int evenSum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) evenSum += i;
        }
        System.out.println("Сумма четных чисел: " + evenSum);

        // Задача 9
        System.out.print("Введите строку для реверса (Задача 9): ");
        String strToReverse = scanner.next();
        String reversedStr = new StringBuilder(strToReverse).reverse().toString();
        System.out.println("Обратная строка: " + reversedStr);

        // Задача 10
        System.out.print("Введите целое число для подсчета цифр (Задача 10): ");
        int countDigitsNum = scanner.nextInt();
        int digitCount = String.valueOf(Math.abs(countDigitsNum)).length();
        System.out.println("Количество цифр: " + digitCount);

        // Задача 11
        System.out.print("Введите целое число N для вычисления факториала (Задача 11): ");
        int factorialNum = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= factorialNum; i++) {
            factorial *= i;
        }
        System.out.println("Факториал: " + factorial);

        // Задача 12
        System.out.print("Введите целое число для суммы цифр (Задача 12): ");
        int sumDigitsNum = scanner.nextInt();
        int sumDigits = 0;
        while (sumDigitsNum != 0) {
            sumDigits += sumDigitsNum % 10;
            sumDigitsNum /= 10;
        }
        System.out.println("Сумма цифр: " + sumDigits);

        // Задача 13
        System.out.print("Введите строку для проверки на палиндром (Задача 13): ");
        String palindromeStr = scanner.next();
        String normalizedStr = palindromeStr.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedPalindromeStr = new StringBuilder(normalizedStr).reverse().toString();
        System.out.println(normalizedStr.equals(reversedPalindromeStr) ? "Палиндром" : "Не палиндром");

        // Задача 14
        System.out.print("Введите размер массива для поиска максимума (Задача 14): ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        int maxNum = array1[0];
        for (int num : array1) {
            if (num > maxNum) maxNum = num;
        }
        System.out.println("Максимальное число: " + maxNum);

        // Задача 15
        System.out.print("Введите размер массива для суммы элементов (Задача 15): ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        int totalSum = 0;
        for (int num : array2) {
            totalSum += num;
        }
        System.out.println("Сумма всех элементов: " + totalSum);

        // Задача 16
        System.out.print("Введите размер массива для подсчета положительных и отрицательных чисел (Задача 16): ");
        int size3 = scanner.nextInt();
        int[] array3 = new int[size3];
        System.out.println("Введите элементы массива:");

        int positiveCount = 0, negativeCount = 0;

        for (int i = 0; i < size3; i++) {
            array3[i] = scanner.nextInt();
            if (array3[i] > 0) positiveCount++;
            else if (array3[i] < 0) negativeCount++;
        }

        System.out.println("Положительных чисел: " + positiveCount);
        System.out.println("Отрицательных чисел: " + negativeCount);

        // Задача 17
        System.out.print("Введите два целых числа A и B для поиска простых чисел в диапазоне (Задача 17): ");
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        System.out.println("Простые числа в диапазоне:");
        for (int i = startRange; i <= endRange; i++) {
            boolean isPrimeInRange = true;
            if (i < 2) isPrimeInRange = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeInRange = false;
                    break;
                }
            }
            if (isPrimeInRange) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Задача 18
        System.out.print("Введите строку для подсчета гласных и согласных букв (Задача 18): ");
        String vowelConsonantStr = scanner.next();
        int vowelsCount = 0, consonantsCount = 0;

        for (char ch : vowelConsonantStr.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowelsCount++;
            } else if (Character.isLetter(ch)) {
                consonantsCount++;
            }
        }
        System.out.println("Гласные: " + vowelsCount);
        System.out.println("Согласные: " + consonantsCount);

        // Задача 19
        System.out.print("Введите строку для перестановки слов в обратном порядке (Задача 19): ");
        scanner.nextLine(); // очистка буфера
        String wordsStr = scanner.nextLine();
        String[] wordsArray = wordsStr.split("\\s+");
        StringBuilder reversedWordsStr = new StringBuilder();
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            reversedWordsStr.append(wordsArray[i]).append(" ");
        }
        System.out.println("Перестановка слов: " + reversedWordsStr.toString().trim());

        // Задача 20
        System.out.print("Введите целое число для проверки на число Армстронга (Задача 20): ");
        int armstrongNum = scanner.nextInt();
        int digitsCountArmstrong = String.valueOf(armstrongNum).length();
    }
}
