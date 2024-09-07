import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Функция для нахождения максимума
            System.out.print("Введите два числа для нахождения максимума: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Максимум: " + findMax(a, b));

            // 2. Калькулятор деления
            System.out.print("Введите два числа для деления: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            System.out.println("Результат деления: " + divide(num1, num2));

            // 3. Конвертер строк в числа
            System.out.print("Введите строку для конвертации в число: ");
            String str = scanner.next();
            System.out.println("Конвертация строки в число: " + convertStringToInt(str));

            // 4. Проверка возраста
            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();
            checkAge(age);

            // 5. Нахождение корня
            System.out.print("Введите число для нахождения квадратного корня: ");
            double number = scanner.nextDouble();
            System.out.println("Квадратный корень: " + findSquareRoot(number));

            // 6. Факториал
            System.out.print("Введите число для нахождения факториала: ");
            int factNum = scanner.nextInt();
            System.out.println("Факториал: " + factorial(factNum));

            // 7. Проверка массива на нули
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            checkArrayForZeros(array);

            // 8. Калькулятор возведения в степень
            System.out.print("Введите основание и степень: ");
            double base = scanner.nextDouble();
            int exponent = scanner.nextInt();
            System.out.println("Возведение в степень: " + power(base, exponent));

            // 9. Обрезка строки
            System.out.print("Введите строку и длину для обрезки: ");
            String strToTrim = scanner.next();
            int length = scanner.nextInt();
            System.out.println("Обрезанная строка: " + trimString(strToTrim, length));

            // 10. Поиск элемента в массиве
            System.out.print("Введите элемент для поиска в массиве: ");
            int element = scanner.nextInt();
            findElementInArray(array, element);

            // 11. Конвертация в двоичную систему
            System.out.print("Введите число для конвертации в двоичную систему: ");
            int binNum = scanner.nextInt();
            System.out.println("Двоичное представление: " + convertToBinary(binNum));

            // 12. Проверка делимости
            System.out.print("Введите два числа для проверки делимости: ");
            int divA = scanner.nextInt();
            int divB = scanner.nextInt();
            checkDivisibility(divA, divB);

            // 13. Чтение элемента списка
            System.out.print("Введите индекс элемента для чтения (0, 1 или 2): ");
            int index = scanner.nextInt();
            java.util.List<String> list = java.util.Arrays.asList("A", "B", "C");
            System.out.println("Чтение элемента списка: " + readElementFromList(list, index));

            // 14. Парольная проверка
            System.out.print("Введите пароль для проверки силы: ");
            String password = scanner.next();
            checkPasswordStrength(password);

            // 15. Проверка даты
            System.out.print("Введите дату в формате dd.MM.yyyy: ");
            String date = scanner.next();
            checkDateFormat(date);

            // 16. Конкатенация строк
            System.out.print("Введите две строки для конкатенации: ");
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println("Конкатенация строк: " + concatenateStrings(str1, str2));

            // 17. Остаток от деления
            System.out.print("Введите два числа для нахождения остатка от деления: ");
            int remA = scanner.nextInt();
            int remB = scanner.nextInt();
            System.out.println("Остаток от деления: " + remainder(remA, remB));

            // 18. Квадратный корень (дублируется, уберите если не нужно)
            System.out.print("Введите число для нахождения квадратного корня (дублируется): ");
            double squareRootNum = scanner.nextDouble();
            System.out.println("Квадратный корень: " + squareRoot(squareRootNum));

            // 19. Конвертер температуры
            System.out.print("Введите температуру в градусах Цельсия для конвертации в Фаренгейт: ");
            double celsius = scanner.nextDouble();
            System.out.println("Конвертация температуры: " + convertTemperatureToFahrenheit(celsius));

            // 20. Проверка строки на пустоту
            System.out.print("Введите строку для проверки на пустоту: ");
            String checkStr = scanner.next();
            checkStringIsEmpty(checkStr);

        } catch (InputMismatchException e) {
            System.err.println("Ошибка ввода! Пожалуйста, вводите корректные данные.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // Все методы остаются без изменений...
    public static int findMax(int a, int b) {
        if (a == b) throw new IllegalArgumentException("Числа равны!");
        return Math.max(a, b);
    }

    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Недопустимо деление на ноль!");
        return a / b;
    }

    public static int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат строки для конвертации в число!");
        }
    }

    public static void checkAge(int age) {
        if (age < 0 || age > 150) throw new IllegalArgumentException("Некорректный возраст!");
    }

    public static double findSquareRoot(double number) {
        if (number < 0) throw new IllegalArgumentException("Отрицательное число!");
        return Math.sqrt(number);
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Некорректное число для факториала!");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void checkArrayForZeros(int[] array) {
        for (int num : array) {
            if (num == 0) throw new IllegalArgumentException("Массив содержит нули!");
        }
    }

    public static double power(double base, int exponent) {
        if (exponent < 0) throw new IllegalArgumentException("Отрицательная степень!");
        return Math.pow(base, exponent);
    }

    public static String trimString(String str, int length) {
        if (length > str.length()) throw new IllegalArgumentException("Длина превышает длину строки!");
        return str.substring(0, length);
    }

    public static void findElementInArray(int[] array, int element) {
        boolean found = false;
        for (int num : array) {
            if (num == element) {
                found = true;
                break;
            }
        }
        if (!found) throw new IllegalArgumentException("Элемент не найден в массиве!");
    }

    public static String convertToBinary(int number) {
        if (number < 0) throw new IllegalArgumentException("Отрицательное число!");
        return Integer.toBinaryString(number);
    }

    public static void checkDivisibility(int a, int b) {
        if (b == 0) throw new ArithmeticException("Недопустимо деление на ноль!");
        if (a % b != 0) throw new IllegalArgumentException("Первое число не делится на второе!");
    }

    public static String readElementFromList(java.util.List<String> list, int index) {
        if (index < 0 || index >= list.size()) throw new IndexOutOfBoundsException("Индекс выходит за пределы списка!");
        return list.get(index);
    }

    public static void checkPasswordStrength(String password) {
        if (password.length() < 8) throw new IllegalArgumentException("Слабый пароль!");
    }

    public static void checkDateFormat(String date) {
        try {
            java.time.LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Некорректный формат даты!", date, 0);
        }
    }

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) throw new NullPointerException("Одна из строк равна null!");
        return str1 + str2;
    }

    public static int remainder(int a, int b) {
        if (b == 0) throw new ArithmeticException("Недопустимо деление на ноль!");
        return a % b;
    }

    public static double squareRoot(double number) {
        if (number < 0) throw new IllegalArgumentException("Отрицательное число!");
        return Math.sqrt(number);
    }

    public static double convertTemperatureToFahrenheit(double celsius) {
        if (celsius < -273.15) throw new IllegalArgumentException("Температура ниже абсолютного нуля!");
        return celsius * 9/5 + 32;
    }

    public static void checkStringIsEmpty(String str) {
        if (str == null || str.isEmpty()) throw new IllegalArgumentException("Строка пустая или равна null!");
    }
}
