package metodichka;


/*
Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.
 */
public class Task4 {
    public static void main(String[] args) {
        int i = 4321;

        System.out.println(reverse(i));
    }

    public static int reverse(int i){
        return (i % 10 * 1000) + (((i % 100) / 10) * 100) + (((i % 1000) / 100) * 10) + (i / 1000);
    }
}
