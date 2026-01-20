class IfElseIf 
{
    public static void main(String[] args) {
        int x=5;
        int y=7;
        int z=6;

        if(x>y && x>z)
            System.out.println("x is greatest of three numbers");
        else if(y>z) // we can write (y>x && y>z) but as x is already not greatest to be efficient we jus compared y with z
            System.out.println("y is greatest of three numbers");
        else
            System.out.println("z is greatest of three number");
    }    
}
