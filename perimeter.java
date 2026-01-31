import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        double l = input.nextDouble();

        System.out.print("Enter breadth of rectangle : ");
        double b = input.nextDouble();

        double p= 2*l + 2*b ;

        System.out.println("Permiter of Rectangle : "+p);
    }
}
