import java.util.Scanner;

public class oddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = sumOfOdd(num);
        System.out.println("Sum of odd till "+num+ " is : "+sum);
    }

    public static int sumOfOdd(int num){
        int sum=0;
        for(int i=1 ; i<=num ; i+=2){  //as we are adding odd numbers i+=2 is used meaning i=i+2;
            sum = sum+i;
        }
        return sum;
    }
}
