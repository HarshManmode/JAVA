import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number for LCM : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number for LCM : ");
        int num2 = input.nextInt();
        int lcm = lcm(num1, num2);
        System.out.println("LCM of two numbers is : " +lcm);
    }
    public static int lcm(int num1 , int num2){
        for(int i=1 ; i<=num2 ; i++){
            int factor = num1*i;

            if(factor % num2 == 0){
                return factor;
            }
        }
        return 0;
    }
}
