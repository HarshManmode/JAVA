public class diagonalSum2DArray {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);

        System.out.println("Sum of the diagonal elements of array is : "+sum);
    }

    public static long sum(int[][] numArr){
        long leftSum = sumOfLeftD(numArr);
        long rightSum = sumOfRightD(numArr);
        long sum = leftSum + rightSum ;

        if(numArr.length % 2 != 0){
            int ind = numArr.length/2;
            sum = sum - numArr[ind][ind];
        }
        return sum;
    }

    public static long sumOfLeftD(int[][] numArr){
        long sum = 0;
        for(int i=0 ; i<numArr.length ; i++){
            sum = sum + numArr[i][i];
        }
        return sum;
    }

    public static long sumOfRightD(int[][] numArr){
        long sum = 0;
        for(int i=0 ; i<numArr.length ; i++){
            int col = (numArr.length - 1) - i;
            sum = sum + numArr[i][col];
        }
        return sum;
    }
}
