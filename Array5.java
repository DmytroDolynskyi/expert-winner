import java.util.Arrays;

public class Array5 {

    public static void main(String[] args) {
        int [] array1 = new int[5];
        int [] array2 = new int[5];

        for (int i = 0; i < 5; i++) {
            array1[i] = (int)(Math.random()*6);
            array2[i] = (int)(Math.random()*6);
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += array1[i];
            average2 += array2[i];
        }
        average1/=5;
        average2/=5;

        System.out.println("Среднее арифметическое первого массива равно " + average1);
        System.out.println("Среднее арифметическое второго массива равно " + average2);

        if(average1 > average2){
            System.out.println("Среднее арифметическое первого массива больше среднего арифметического второго массива");
        } else if(average2 > average1){
            System.out.println("Среднее арифметическое второго массива больше среднего арифметического первого массива");
        } else if(average1 == average2){
            System.out.println("Средние арифметические массивов равны");
        }
}
}
