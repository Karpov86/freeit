package homework;

/*
2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
public class Task2 {

    public static void main(String[] args) {

        int amountOfAmoeba = 1;
        for (int i = 0; i < 24; ) {
            amountOfAmoeba *= 2;
            i += 3;
        }
        System.out.printf("%d Amoebas will be in 24 hours", amountOfAmoeba);
    }
}
