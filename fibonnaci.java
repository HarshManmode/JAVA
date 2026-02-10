import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number till you wanna run the fibonnaci : ");
        int num = input.nextInt();
        System.out.println("Here is the fibonnaci series: ");
        series(num);

    }
    public static void series(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");

        int n1 = 0;
        int n2 = 1;
        while(n1 + n2 <= num){
            int n3 = n1+n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

    }
}
