import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principle amount(in rupees) : ");
        int p= input.nextInt();

        System.out.print("Enter your Rate of interest(in %) : ");
        float r=input.nextFloat();

        System.out.print("Enter your time(in years) : ");
        float t=input.nextFloat();

        float interest=(p*r*t)/100;

        System.out.println("Simple interest : "+interest);
    }
}
