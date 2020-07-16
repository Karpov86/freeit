package homework;

/*
В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программиста • 10 программистов • и т.д
 */
public class Task7 {
    public static void main(String[] args) {

        for (int i = 0; i <= 32; i++) {
            howManyProgrammers(i);
        }
    }

    private static int lastInt(int i) {
        while (i > 10) {
            i %= 10;
        }
        return i;
    }

    private static boolean isLastMatchEleven(int i) {
        while (i > 100) {
            i %= 100;
        }
        return i == 11;
    }

    private static int lastTwoInt(int i) {
        while (i > 100) {
            i %= 100;
        }
        return i;
    }

    public static void howManyProgrammers(int i) {
        int k = i;
        if (lastInt(i) == 1) {
            k = 1;
        }
        if (lastTwoInt(i) > 20){
            k = lastInt(i);
        }
        if (isLastMatchEleven(i)) {
            k = 5;
        }
        if (i <= 0) {
            System.out.println("Ну хоть один-то должен быть!");
        } else {
            switch (k) {
                case 1:
                    System.out.println(i + " програмист");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(i + " програмиста");
                    break;
                default:
                    System.out.println(i + " програмистов");
                    break;
            }
        }
    }
}
