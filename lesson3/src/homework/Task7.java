package homework;

/*
7)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
public class Task7 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                result = result + i;
            }
        }
        System.out.println(result);
    }
}
