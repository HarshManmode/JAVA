import java.util.Scanner;

public class arraySumAvg {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = avg(numArray);

        System.out.println("Sum of the array is : "+sum);
        System.out.println("Average of the array is : "+avg);

    }

    public static long sum(int[] numArray){
        long sum = 0;
        for(int i=0 ; i<numArray.length ; i++){
            sum = sum + numArray[i];
        }
        return sum;
    }

    public static double avg(int[] numArray){
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}
