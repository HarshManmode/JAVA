class arithmetic 
{
    public static void main(String[] args) {
        int num=9;
        int num3=7;
        int num1=8;
        int num2=3;
        int result1 = num1/num2;
        int result2 = num1%num2;
        System.out.println("Quotient : " +result1);
        System.out.println("Remainder : " +result2);

        num1 += 2; //num1 will be added by 2 in a shortcut way
        System.out.println(num1);

        int result3 = num++;
        System.out.println("Post increment result :"  +result3);

        int result4= ++num;
        System.out.println("Pre increment result : " +result4);

        int result5 = num3--;
        System.out.println("Post decrement result :"  +result5);

        int result6= --num3;
        System.out.println("Pre decrement result : " +result6);


    }
}
