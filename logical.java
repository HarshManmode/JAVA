class logical 
{
    public static void main(String[] args) {
        int x=7;
        int y=5;
        int a=5;
        int b=9;

        boolean result1 = x>y && a>b;

        boolean result2 = x>y && a<b;

        boolean result3 = x>y || a>b;

        boolean result4 = x<y || a>b;

        System.out.println("x>y and a>b : " +result1);
        System.out.println("x>y and a<b : " +result2);
        System.out.println("x>y or a>b : " +result3);
        System.out.println("x<y or a>b : " +result4);
    }    
}
