package task1;

/*
В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
Например, "это однозначное положительное число". Достаточно будет определить, является личисло однозначным,
"двухзначным или трехзначным и более.
 */

public class Task1 {
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
