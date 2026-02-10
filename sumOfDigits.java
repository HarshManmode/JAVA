import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int sum = digitSum(num);
        System.out.println("Sum of digits is : "+sum);

    }
    public static int digitSum(int num){
        int sum=0;
        while (num>0){
            sum = sum + (num%10);
            num = num/10;
        }
        return sum;
    }
}