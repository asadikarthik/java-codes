import java.util.Scanner;
class armstrong
{
    public static int power(int a ,int b)
    {
        int res=1;
        for(int i=1;i<=b;i++)
        {
            res = res * a;
        }
        return res;
    }
    public static boolean isarmstrong(int n)
    {
        int x =n , z=n;
        int count=0;
        while (n>0)
        {
            count++;
            n/=10;
        }
        int sum=0;
        while (x>0)
        {
            int r = x%10;
            int result = power(r,count);
            sum+=result;
            //System.out.println(result);
            x/=10;
        }
        if(z == sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int ran = s.nextInt();
        for(int i=1;i<=ran;i++)
        {
            if(isarmstrong(i))
            {
                System.out.print(i+"  ");
            }
        }
        s.close();
    }
}