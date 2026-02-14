public class reverseArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Reversed Array is : ");
        ArrayUtility.displayArray(numArr);
    }
    public static void reverse(int[] arr){
        for(int i = 0 ; i < arr.length / 2 ; i++){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;

        }
    }
}
