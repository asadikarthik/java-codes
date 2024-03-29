import java.util.Scanner;

public class matrixx
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n= s.nextInt();
        System.out.print("Enter number of columns : ");
        int m =s.nextInt();
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=s.nextInt();
            }
            //System.out.println();
        }
        
        System.out.println("Enter a element to search it's index :");
        int x=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==x)
                {
                    System.out.println(i+" "+j);
                }
            } 
        }
    }
}
