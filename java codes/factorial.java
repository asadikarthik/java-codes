import java.util.Scanner;
public class factorial
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int res=0;
        if( n == 0)
        {
            res=1;
        }
        else
        {
            res++;
            for(int i=1;i<=n;i++)
            {
                res*=i;
            }
        }
        System.out.println(res);
        s.close();
    }
}
