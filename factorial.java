import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for which factoeial is needed : ");
        int num = input.nextInt();
        int fact = fact(num);
        System.out.println("Factorial of number is : "+fact);
    }

    public static int fact(int num){
        if(num<2){
            return 1;
        }
        int fact = 1;
        for(int i=2; i<=num ; i++){
            fact = fact *i;
        }
        return fact;
    }
}