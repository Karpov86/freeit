package homework;
/*
4)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Task4 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int result = 0;
        for (int i = 0; i < a; i++) {
            result = result + b;
        }
        System.out.println(result);
    }
}
