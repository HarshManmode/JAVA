class ternary 
{
    public static void main(String[] args) {
        int num=5;
        int result = 0;

        result = num%2 == 0 ? 10 : 20 ; //if true return value after ? , if false return value after : 

        if(result == 10)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }    
}
