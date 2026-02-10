import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year calculator");
        System.out.print("Enter a year : ");
        int year = input.nextInt();

        if(year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println("Year entered is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
