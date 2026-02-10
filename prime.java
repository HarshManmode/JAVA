import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check for Prime : ");
        int num = input.nextInt();
        boolean prime = prime(num);
        if(prime){
            System.out.println("Number entered is Prime");
        }else{
            System.out.println("Number entered is NOT Prime");
        }
    }
    public static boolean prime(int num){
        for(int i =2 ; i<num ; i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}
