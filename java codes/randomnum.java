import java.util.*;
import java.util.Scanner;
public class randomnum
{
    public static void main(String args[])
    {
        Random r = new Random();
        int x =r.nextInt(6);
        System.out.println(x);
        long y =r.nextLong();
        System.out.println(y);
        double z =r.nextDouble();
        System.out.println(z);
        boolean a =r.nextBoolean();
        System.out.println(a);
    }
}
