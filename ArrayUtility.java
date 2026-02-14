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

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns : ");
        int columns = input.nextInt();
        int[][] nums = new int[rows][columns];

        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<columns ; j++){
            System.out.print("Enter row :"+(i+1)+ " , column : "+(j+1)+ " : ");
            nums[i][j] = input.nextInt();
        }
    }
        return nums;
    }
}