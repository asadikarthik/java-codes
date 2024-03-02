import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int x =n;
        int temp=0;
        while (n>0)
        {
            int r = n%10;
            temp = temp*10+r;
            n/=10;
        }
        System.out.println((x ==temp)?"Palindrome":"Not a Palindrome");
        s.close();
    }
}