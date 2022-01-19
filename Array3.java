import java.util.Arrays;

public class Array3 {

    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 90)+10;
        }
            System.out.println(Arrays.toString(array));

        boolean sequence = true;
        for (int i = 1; i < array.length; i++) {
            if(array[i]<=array[i-1]){
                sequence = false;
                break;
            }
        }
        if(sequence){
            System.out.println("Массив является строго растущей последовательностью");
        } else {
            System.out.println("Массив не является строго растущей последовательностью");
        }
}
}
