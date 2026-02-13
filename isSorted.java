public class isSorted {
    public static void main(String[] args) {
        
        int[] numArr = ArrayUtility.inputArray();
        boolean inc = inc(numArr);
        boolean dec = dec(numArr);

        if(inc || dec){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is NOT Sorted");
        }
    }
    public static boolean inc(int[] numArr){
        for(int i = 1; i<numArr.length ; i++){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
        }

        return true;
    }

    public static boolean dec(int[] numArr){
        for(int i = 1 ;i<numArr.length ; i++){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
        }
        return true;
    }
}
