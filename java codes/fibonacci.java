import java.util.Scanner;
class fibonacci
{
    public static void main(String aegs[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=1;i<10;i++)
        {
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        s.close();
    }
}