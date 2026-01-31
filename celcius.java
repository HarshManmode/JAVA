import java.util.Scanner;

public class celcius {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fehrenheit : ");
        float f= input.nextFloat();
        float c= (f-32) * 5/9 ;
        System.out.println("Temperature in degree celsius is : " + c +" C");
    }
}
