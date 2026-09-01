/*write a program to initialize an integers with values and check if a given number present in a array or not in java */
import java.util.Scanner;

public class test 7{
    public static void main(String[] args) {
                int[] numbers = {10, 25, 47, 3, 89, 56, 12};

               Scanner scanner = new Scanner(scannerInput());
        System.out.print("Enter the number to search: ");
        int target = 47; // You can replace this or take input via scanner.nextInt()

       
        boolean found = false;
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                foundIndex = i;
                break; // Stop searching once found
            }
        }

                if (found) {
            System.out.println(target + " is present in the array at index " + foundIndex + ".");
        } else {
            System.out.println(target + " is NOT present in the array.");
        }

        scanner.close();
    }

       private static java.io.InputStream scannerInput() {
        return System.in;
    }
}