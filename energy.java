import java.util.Scanner;

class energy
{
    public static void main(String[]args)
    {
        Scanner k = new Scanner(System.in);
        float m, v;
        
        System.out.print("Mass : ");
        m= k.nextFloat();

        System.out.print("Velocity : ");
        v= k.nextFloat();


        System.out.println("Kinetic Energy : "+(m*v*v)/2);

    }
}
