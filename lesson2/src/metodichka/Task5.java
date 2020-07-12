package metodichka;

import java.util.Scanner;

/*
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
 */
public class Task5 {
    public static void main(String[] args) {

        int i = 1234;

        if (compare(i)) {
            System.out.println("All digits of this number are different.");
        } else {
            System.out.println("Not all digits of this number are different.");
        }

    }

    public static boolean compare(int i) {
        int number1 = i / 1000;
        int number2 = i % 1000 / 100;
        int number3 = i % 100 / 10;
        int number4 = i % 10;
        return number1 != number2
                && number1 != number3
                && number1 != number4
                && number2 != number3
                && number2 != number4
                && number3 != number4;
    }
}
