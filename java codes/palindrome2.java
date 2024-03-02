import java.util.Scanner;
public class palindrome2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str =s.next();
        String n = str ,x = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            x = x + str.charAt(i);
        }
        if(n == x)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
        s.close();
    }
}
