package homework;

/*
Даны 3 целых числа.
Найти количество положительных чисел в исходном наборе.
 */
public class Task4 {
    public static void main(String[] args) {

        int a = 3;
        int b = -3;
        int c = 2;

        System.out.println("Amount positive number: " + count(a, b, c));
    }

    public static int count(int a, int b, int c) {
        int count = 0;

        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        return count;
    }
}
