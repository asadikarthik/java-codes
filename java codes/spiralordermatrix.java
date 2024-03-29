import java.util.*;
public class spiralordermatrix
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int n =s.nextInt();
        System.out.print("Enter no of columns : ");
        int m =s.nextInt();
        int a[][]= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=m-1;
        while(rowStart<=rowEnd && colStart<=colEnd)
        {
            for(int i=colStart;i<=colEnd;i++)
            {
                System.out.print(a[rowStart][i]+" ");
            }
            rowStart++;
    
            for(int i=rowStart;i<=rowEnd;i++)
            {
                System.out.print(a[i][colEnd]+" ");
            }
            colEnd--;
    
            for(int i=colEnd;i>=colStart;i--)
            {
                System.out.print(a[rowEnd][i]+" ");
            }
            rowEnd--;
    
            for(int i=rowEnd;i>=rowStart;i--)
            {
                System.out.print(a[i][colStart]+" ");
            }
            colStart++;
        }
    }
}
