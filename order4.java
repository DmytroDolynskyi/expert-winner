import java.util.Scanner;

public class order4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int scanint = scanner.nextInt();
        int sum = 0;
        while (scanint <= 0) {
            System.out.println("Введено НЕ целое положительное число!");
            System.out.println("Введите целое положительное число: ");
            scanint = scanner.nextInt();
        if (scanint > 0) {
                    for (int a = 1; a <= scanint; a++) {
                        sum += a;
                        if (a == scanint) {
                        System.out.println("Сумма = " + sum);
                        }
                    }
                }
        }
    }
}
