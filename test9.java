public class Test9 {
    public static void main(String[] args) {
       
        int[] arr = {4, 2, 5, 2, 3, 4, 1, 5, 6};
        int n = arr.length;

        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

  
        int[] unique = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

                        for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

                       if (!isDuplicate) {
                unique[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

                System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
    }
}