/*write a program to initialize integer array and find the aximum and minimum of the array in java*/

import java.util.Arrays;

public class test6 {
    public static void main(String[] args) {
                int[] numbers = {45, 12, 89, 2, 67, 34, 99, 5};

                if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

               int min = numbers[0];
        int max = numbers[0];

               for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

               System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}