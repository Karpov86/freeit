package homework;
/*
5)Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
public class Task5 {
    public static void main(String[] args) {
        double centimeter = 0;
        System.out.println("Inch\tCentimeter");
        for (int i = 1; i <= 20; i++) {
            centimeter = centimeter + 2.54;
            System.out.printf("%d\t\t%.2f\n", i, centimeter);
        }
    }
}
