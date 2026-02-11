import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = input.nextInt();
        firstPattern(row);
        System.out.println();
        secondPattern(row);
    }

    public static void secondPattern(int maxRows){
        for(int row = maxRows ; row >=1 ; row--){
            for(int i=1 ; i<=row ; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void firstPattern(int maxRows){
        for(int row=1 ; row <= maxRows ; row++){
            for(int i=1 ; i <= row ; i++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}