import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Numbers will be swapped at the end");

        System.out.print("Enter a number A: ");
        int a = input.nextInt();

        System.out.print("Enter a number B: ");
        int b = input.nextInt();

        int c=a;
        a=b;
        b=c;
        
        System.out.println("\nA after swapping is : " +a);
        System.out.println("B after swapping is : " +b);

    }
}
