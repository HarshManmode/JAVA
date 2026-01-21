public class ForLoop 
{
    public static void main(String[] args) {
        
        for(int i=5;i>=1;i--)
        {
            System.out.println("Hello - " + i);
        }

        for(int i=0;i<=5;i++)
        {
            System.out.println("Hello - " + i);
        }

        for(int i=1;i<=5;i++)
        {
            System.out.println("DAY " +i);

            for(int j=1;j<=9;j++)
            {
                System.out.println("   " + (j+8)+" o clock" + " - " + (j+9)+" o clock" );
            }
        }
    }    
}
