import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of triangle in cm: ");
        double b= input.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double h = input.nextDouble();

        double Area = 0.5*b*h;

        System.out.println("Area of Triangle is : " +Area + "cm2");
    }
}
