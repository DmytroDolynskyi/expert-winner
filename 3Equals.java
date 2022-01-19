public class Equals {

    public static void main(String[] args) {
        String a = "This is exercise 1";
        String b = "This is Exercise 1";
        if (a.equalsIgnoreCase(b)) {
            System.out.println(a + " is equal to " + b);
        }
        else {
            System.out.println(a + " is not equal to " + b);
        }
    }
}