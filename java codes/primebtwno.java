import java.util.Scanner;
class primebtwno
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        

        for(int i=n ;i<=m;i++)
        {
            if(i == 0||i==1)
            {
                continue;
            }
            int count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0 )
            {
                System.out.println(i);
            }
            
        }
        s.close();
        //System.out.println((count==1)?"Prime":"Not prime");
    }
}