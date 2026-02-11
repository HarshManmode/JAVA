import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        boolean pal = pal(num);
        if(pal){
            System.out.println("Number entered is palindrome");
        }else{
            System.out.println("Number entered is NOT palindrome");
        }
    }

    public static boolean pal(int num){
        return num == rev(num);
    }

    public static int rev(int num){
        int newNum = 0;
        while(num>0){
            int digit = num % 10 ;
            newNum = newNum *10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
