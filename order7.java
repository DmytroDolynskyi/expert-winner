import java.util.Objects;
import java.util.Scanner;

public class order7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что это есть такое: синий, большой, с усами и полный зайцев?");
        String a = "Троллейбус";
        String b = "Сдаюсь";
        String c = "Подумайте еще";
        String answer = scanner.nextLine();
            if (Objects.equals(answer, a)) {
                System.out.println("Правильно!");
                }
        else if (Objects.equals(answer, b)) {
                System.out.println("Правильный ответ: Троллейбус");
                }
        else {
            System.out.println(c);
                answer = scanner.nextLine();
                if (Objects.equals(answer, a)) {
                    System.out.println("Правильно!");
                }
                else if (Objects.equals(answer, b)) {
                    System.out.println("Правильный ответ: Троллейбус");
                }
                else {
                    System.out.println(c);
                    answer = scanner.nextLine();
                    if (Objects.equals(answer, a)) {
                        System.out.println("Правильно!");
                    }
                    else {
                        System.out.println("Правильный ответ: Троллейбус");
        }
        }
    }
    }
}
