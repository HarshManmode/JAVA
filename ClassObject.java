class Calculator{
    int a;

    public int add(int n1, int n2)
    {
        int r = n1+n2;
        return r;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        
        int num1 = 6;
        int num2 = 7;

        Calculator calc = new Calculator(); // to use the class created above we created an object of it
        int result = calc.add(num1,num2);

        System.out.println(result);
    }
}