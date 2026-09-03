 /*write a program to find the largest 2 numbers  and the smallest 2 numbers in the given array in java*/
public class test8 {

    public static void main(String[] args) {
       
        int[] arr = {12, 45, 2, 41, 31, 10, 8, -5, 20};

    
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least 2 elements.");
            return;
        }

        
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        
        for (int num : arr) {
            
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }

            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin) {
                secondMin = num;
            }
        }

        System.out.println("Given Array: java.util.Arrays.toString(arr) -> ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("Largest number: " + firstMax);
        System.out.println("Second largest number: " + secondMax);
        System.out.println("Smallest number: " + firstMin);
        System.out.println("Second smallest number: " + secondMin);
    }
}