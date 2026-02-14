public class palindromeArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        boolean pal = checker(numArr);
        if(pal){
            System.out.println("Array entered is Palindrome");
        }else{
            System.out.println("Array is NOT Palindrome");
        }
    }

    public static boolean checker(int[] numArr){
        for(int i=0 ; i<numArr.length /2 ;i++){
            if(numArr[i] != numArr[(numArr.length - 1) - i]){
                return false;
            }
        }
        return true;
    }
}