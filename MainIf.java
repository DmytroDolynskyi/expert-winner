package lesson1;

public class MainIf {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 2;
        if (a<=b && b<=c){
            System.out.println("Последовательность - " + a+ " " + b + " " +c);
        }
        else if (a<=c && c<=b){
            System.out.println("Последовательность - " + a+ " " + c + " " +b);
        }
        else if (c<=a && a<=b){
            System.out.println("Последовательность - " + c+ " " + a + " " +b);
        }
        else if (c<=b && b<=a){
            System.out.println("Последовательность - " + c+ " " + b + " " +a);
        }
        else if (b<=a && a<=c){
            System.out.println("Последовательность - " + b+ " " + a + " " +c);
        }
        else if (b<=c && c<=a){
            System.out.println("Последовательность - " + b+ " " + c + " " +a);
        }
    }

}
