import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements to be in array : ");
        int size = input.nextInt();
        int[] nums = new int[size];

        for(int i=0 ; i<size ; i++){
            System.out.print("Enter element number "+(i+1)+ " : ");
            nums[i] = input.nextInt();
        }
        return nums;
    }

    public static void displayArray(int[] numArray){
        for(int i=0 ; i<numArray.length; i++){
            System.out.println(numArray[i]+ " ");
        }
        System.out.println();
    }
}