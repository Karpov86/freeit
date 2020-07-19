package homework;
/*
1)Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?
 */
public class Task1 {
    public static void main(String[] args) {

        double distance = 10; // initial distance
        double total = 0; // initial distance

        for (int i = 1; i < 8; i++) {
            System.out.printf("Day %d: distance is %.2f km \n", i, distance);
            total = total + distance; //total amount
            distance = distance + (distance * 0.1); // distance plus 10% of the current distance
        }
        System.out.printf("The total way that an athlete will run in 7 days is %.2f km", total);
    }

}
