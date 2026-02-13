public class MaxMinArray {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();

        int max = max(numArray);
        int min = min(numArray);
        System.out.println("Maximum number provided in array : "+max);
        System.out.println("Minimum number provided in array : "+min);
    }

    public static int max(int[] numArray){
        if(numArray.length == 0){
            return 0;
        }
        int max = numArray[0];
        for(int i = 1 ; i<numArray.length ; i++){
            if(max < numArray[i]){
                max = numArray[i];
            }
        }

        return max;
    }

    public static int min(int[] numArray){
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<numArray.length ; i++){
            if(min > numArray[i]){
                min = numArray[i];
            }
        }
        return min;
    }
}
