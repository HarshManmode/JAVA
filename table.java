import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for Multiplication Table: ");
        int num = input.nextInt();
        mulTable(num);
    }

    public static void mulTable(int num){
        for(int i=1 ; i<=10 ; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
}
}