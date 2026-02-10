import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number for HCF : ");
        int num1 = input.nextInt();
        System.out.print("Enter seconf number for HCF : ");
        int num2 = input.nextInt();
        int hcf = hcf(num1, num2);
        System.out.println("HCF of two numbers is : " +hcf);
    }
    public static int hcf(int num1 , int num2){
        int hcf =1;
        int least = least(num1, num2);
        for(int i=2 ; i<=least ; i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }
    public static int least(int num1 ,int num2){
        if(num1<num2){
            return num1;
        }else{
            return num2;
        }
    }
}
