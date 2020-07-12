package homework;

/*
В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программиста • 10 программистов • и т.д
 */
public class Task7 {
    public static void main(String[] args) {

        int i = 3;
        howManyProgrammers(i);
    }

    public static void howManyProgrammers(int i) {
        if (i <= 0) {
            System.out.println("Ну хоть один-то должен быть!");
        } else {
            switch (i) {
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
