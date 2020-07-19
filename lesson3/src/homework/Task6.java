package homework;

/*
6)Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(i + "\t");
            }
            // for create a table
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
