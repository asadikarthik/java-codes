import java.util.Scanner;
class prime
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        for(int i=1;i<=(n/2);i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        System.out.println((count==1)?"Prime":"Not prime");
        s.close();
    }
}