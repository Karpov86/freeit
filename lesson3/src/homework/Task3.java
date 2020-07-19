package homework;
/*
3)Вычислить: 1+2+4+8+...+256
 */
public class Task3 {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; number <= 256; ) {
            number = number + i;
            i *= 2;
        }
        System.out.println("1+2+4+8+...+256 = " + number);
    }
}
