 public class MultiplyArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }
        System.out.print("Result of array multiplication: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}

