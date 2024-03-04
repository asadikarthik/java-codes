public class Arraytrasf
{
    public static void main(String args[])
    {
        int a[][] = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        System.out.println("Give matrix is : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=1;i<a.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        System.out.println("Transpose of a matrix is : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
