import java.util.Scanner;

public class occurancesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Enter number you need to find : ");
        int num = input.nextInt();
        int occurances = noOfOccurances(numArray, num);
        System.out.println("Element found number of times : "+occurances);
    }

    public static int noOfOccurances(int[] numArray , int num){
        int occ = 0;
        for(int i = 0 ; i < numArray.length ; i++){
            if(numArray[i] == num){
                occ ++;
            }
        }
        return occ;
    }
}
