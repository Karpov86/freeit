package homework;
/*
Даны 3 целых числа.
Найти количество положительных и отрицательныхчисел в исходном наборе.
 */
public class Task5 {
    public static void main(String[] args) {
        int a = 3;
        int b = -3;
        int c = 2;
        amountPositiveAndNegativeNumber(a, b, c);
    }

    public static void amountPositiveAndNegativeNumber(int a, int b, int c){
        int countPositive = 0;
        int countNegative = 0;
        if (a > 0) {
            countPositive++;
        } else {
            countNegative++;
        }
        if (b > 0) {
            countPositive++;
        } else {
            countNegative++;
        }
        if (c > 0) {
            countPositive++;
        } else {
            countNegative++;
        }
        System.out.println("Amount positive numbers: " + countPositive);
        System.out.println("Amount negative numbers: " + countNegative);

    }
}
