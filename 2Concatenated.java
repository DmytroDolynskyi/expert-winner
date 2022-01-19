public class Concatenated {

    public static void main(String[] args) {
            String a = "PHP Exercises and";
            String b = "Python Exercises";
            String c = String.join(" ", a, b);
            System.out.println(c);
        }
}