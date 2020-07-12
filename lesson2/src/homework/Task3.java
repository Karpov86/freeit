package homework;

/*
Дано целое число.
Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2.
Если нулевым, то заменить его на 10.
Вывести полученное число
 */
public class Task3 {
    public static void main(String[] args) {

        int i = -1;
        System.out.println(someMethod(i));
    }

    public static int someMethod(int i) {
        if (i == 0) {
            return 10;
        }
        return i < 0 ? i - 2 : i + 1;
    }
}
