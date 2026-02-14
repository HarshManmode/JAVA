import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.print("Enter the number to be searched : ");
        int num = input.nextInt();

        boolean found = search(numArr, num);
        if(found){
            System.out.println("Number was found");
        }else{
            System.out.println("Number not found");
        }
    }

    public static boolean search(int[][] numArr , int num){
        for(int i=0 ; i<numArr.length ; i++){
            for(int j=0 ; j<numArr[i].length ;j++){
                if(numArr[i][j] == num){
                    return true;
                }
            }
        }
        return false;
    }
}
