package homework;

import java.util.Scanner;
/*
В переменную записываем число.
Надо вывести на экран сколько в этомчисле цифр и положительное оно или отрицательное.
Например, "этооднозначное положительное число". Достаточно будет определить,
является личисло однозначным, "двухзначным или трехзначным и более.
 */
public class Task1 {
    public static void main(String[] args) {

        int number = -1234;
        StringBuilder sb = new StringBuilder();

        if (number / 10 == 0) {
            sb.append("Your number contains 1 digit");
        } else {
            int i = amountNumber(number);
            sb
                    .append("Your number contains ")
                    .append(i)
                    .append(" digits");
        }
        if (isPositive(number)){
            sb.append(" and it is positive.");
        } else {
            sb.append(" and it is negative.");
        }
        System.out.println(sb);
    }
    public static int amountNumber(int i) {
        int count = 1;
        while (i / 10 != 0) {
            i /= 10;
            count++;
        }
        return count;
    }

    public static boolean isPositive(int i) {
        return i >= 0;
    }
}
