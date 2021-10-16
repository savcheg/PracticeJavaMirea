package practice.number.four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Вариант 9\nВВедите количество нулей затем едениц");
        int numberOfZeros = in.nextInt();
        int numberOfUnits = in.nextInt();
        System.out.println(recursionOfUnitsAndZeros(numberOfZeros, numberOfUnits));

        System.out.println("Вариант 10\nВведите десятичное число");
        int number = in.nextInt();
        System.out.println(recursionReversOfNumber(number, 0));

//        System.out.println("Вариант 11");
//        System.out.println(recursionNumberOfUnits());

        System.out.println("Вариант 12");
        recursionOfNotEven();

        System.out.println("Вариант 13");
        recursionOfNotEvenNumbers();

        System.out.println("Вариант 14\nВведите число");
        int n = in.nextInt();
        System.out.println(recursionSplitNumber(n));
    }

    //Вариант 9
    public static int recursionOfUnitsAndZeros(int zeroCount, int unitCount) {
        if (zeroCount == 0 && unitCount > 0)
            return 1;
        if (zeroCount == 1 && unitCount > 0)
            return unitCount + 1;
        if (zeroCount > 0 && unitCount == 0)
            return 0;
        return recursionOfUnitsAndZeros(zeroCount - 1, unitCount - 1) +
                recursionOfUnitsAndZeros(zeroCount, unitCount - 1);
    }

    //Вариант 10


    public static int recursionReversOfNumber(int n, int i) {
        return (n==0) ? i : recursionReversOfNumber( n/10, i*10 + n%10 );
    }

    //Вариант 11
    public static int recursionNumberOfUnits() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return recursionNumberOfUnits() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return recursionNumberOfUnits() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return recursionNumberOfUnits() + n + m;
            } else {
                return n + m;
            }
        }
    }

    //Вариант 12
    public static void recursionOfNotEven() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1)
                System.out.println(n);
            recursionOfNotEven();
        }
    }

    //Вариант 13
    public static void recursionOfNotEvenNumbers() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0)
                recursionOfNotEvenNumbers();
        }
    }

    //Вариант 14
    public static String recursionSplitNumber(int n) {
        if (n < 10)
            return Integer.toString(n);
        else
            return recursionSplitNumber(n / 10) + " " + n % 10;
    }
}
