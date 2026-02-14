public class SumAvg2DArray {
    public static void main(String[] args) {
        
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double avg = avg(numArr);
        System.out.println("Sum of 2D array is : "+sum);
        System.out.println("Average of 2D array is : "+avg);
    }

    public static long sum(int[][] numArr){
        long sum = 0;
        for(int i=0 ; i<numArr.length ; i++){
            for(int j=0 ; j<numArr[i].length ; j++){
                sum = sum+numArr[i][j];
            }
        }
        return sum;
    }

    public static double avg(int[][] numArr){
        if(numArr.length == 0){
            return 0;
        }

        int rows = numArr.length;
        int columns = numArr[0].length;
        double size = rows*columns;
        return sum(numArr)/size;
    }
}
