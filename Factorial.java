import java.util.Scanner;

class Factorial 
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        int n, i;

        System.out.print("\nEnter No. : ");
        n = s.nextInt();

        int fact = 1;
        for(i=1; i<=n; i++)
        {
            fact = fact*i;
        }

        System.out.println("Factorial : "+fact+"\n");

    }
    
}
