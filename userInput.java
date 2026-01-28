import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");

        Scanner input = new Scanner(System.in);  //Scanner class was declared so that we can take input

        String name = input.nextLine(); // to take string input for before
        System.out.println("Welcome " +name+ " to Java");

        System.out.print("\n\nEnter a number : ");
        int num1 = input.nextInt(); // to take integer input for num1

        System.out.print("Enter second number : ");
        int num2 = input.nextInt();

        int num3 = num1 + num2;

        System.out.println("The addition of two numbers is : "+num3);
        
    }
}
