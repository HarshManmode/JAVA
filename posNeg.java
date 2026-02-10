import java.util.Scanner;

public class posNeg {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        if(num>=0){
            System.out.println("Number is positive");
        }
        else if(num<=0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
