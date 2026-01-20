class casting 
{
    public static void main(String[] args) {
        int a = 257;
        byte b = (byte) a;
        System.out.println("Value of int casted to byte : " +b);

        float k = 5.6f;
        int t = (int) k;
        System.out.println("Value of float casted as int : " +t);

        byte x=20;
        byte y=30;
        int result= x*y;
        System.out.println("After multiplication byte will be promoted to int as its out of range , so result : " + result);
    }   
}