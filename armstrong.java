import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if Armstrong : ");
        int num = input.nextInt();
        boolean armstrong = arm(num);

        if(armstrong){
            System.out.println("Number entered is Armstrong");
        }else{
            System.out.println("Number entered is NOT Armstrong");
        }
    }
    public static boolean arm(int num){
        int digits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while(num > 0){
            int lastDigit = num%10;
            num = num / 10;
            finalNumber = finalNumber + pow(lastDigit , digits);
        }
        return finalNumber == numCopy;
    }

    public static int pow(int num1 , int num2){
        int result = 1;
        for(int i=0 ; i < num2 ; i++){
            result = result * num1;
        }
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num = num/10;
        }
        return digits;
    }
}
