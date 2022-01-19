import java.util.Arrays;

public class Array4 {

    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        String test;

        for (int i = 0; i < n/2; i++) {
            test = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = test;
        }
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
}
}
