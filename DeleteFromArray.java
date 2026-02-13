import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter a number you want to delete : ");
        int num = input.nextInt();
        int[] newArr = delete(numArr, num);
        System.out.println("Here is your new array : ");
        ArrayUtility.displayArray(newArr);

    }

    public static int[] delete(int[] numArr , int num){
        int occ = occurancesArray.noOfOccurances(numArr, num);
        if(occ ==0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i =0, j=0;
        while(i<numArr.length){
            if(numArr[i] != num){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}
