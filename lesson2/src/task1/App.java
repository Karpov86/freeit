package task1;

import java.util.Scanner;

import static task1.Task1.amountNumber;
import static task1.Task1.isPositive;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Inter your number");
        int number = in.nextInt();

        if (number / 10 == 0) {
            sb.append("Your number contains 1 digit");
        } else {
            int i = amountNumber(number);
            sb
                    .append("Your number contains ")
                    .append(i)
                    .append(" digits");
        }
        if (isPositive(number)){
            sb.append(" and it is positive.");
        } else {
            sb.append(" and it is negative.");
        }
        System.out.println(sb);
    }
}
