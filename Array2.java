import java.util.Arrays;

public class Array2 {

    public static void main(String[] args) {
        int[] array = new int[12];
        int maxIndex = 0;
        int maxNumber = -16;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 31)-15;
            if(maxNumber <= array[i]){
                maxNumber = array[i];
                maxIndex = i;
        }
        }
            System.out.println(Arrays.toString(array));
            System.out.println("Максимальный элемент: " + maxNumber);
            System.out.println("Индекс максимального элемента: " + maxIndex);
}
}
