import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int reverse = rev(num);
        System.out.println("Reversed number is : "+reverse);
    }
    public static int rev(int num){
        int i=0;
        while (num>0){
            int digit = num%10;
            i = i * 10 + digit;
            num = num/10;
        }
        return i;
    }
}
