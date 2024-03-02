import java.util.Scanner;
public class pattern4
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int z=1;z<=n-i;z++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--)//5
        {
            for(int z=n;z<=n-i;z++)//z= 5,
            {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}
