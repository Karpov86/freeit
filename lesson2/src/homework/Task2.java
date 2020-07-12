package homework;

/*
Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Определить существует ли такой треугольник. Дано: a, b, c – стороны предполагаемого треугольника.
Требуется сравнить длину каждогоотрезка-стороны с суммой двух других. Если хотя бы в одном случае
отрезококажется больше суммы двух других, то треугольника с такими сторонами несуществует.
 */
public class Task2 {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        int c = 6;

        if (isExistTriangle(a, b, c)) {
            System.out.println("Triangle exist!");
        } else {
            System.out.println("Triangle not exist!");
        }
    }

    public static boolean isExistTriangle(int a, int b, int c) {
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Side by triangle can't be 0");
            return false;
        }
        return a < b + c && b < a + c && c < a + b;
    }
}
