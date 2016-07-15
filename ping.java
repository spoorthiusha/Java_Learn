import java.util.Scanner;
public class ping
{
    public static void main(String[]args)
    {
        int x,y,z,s;
        System.out.println("enter three digits and calculate their sum");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        s = x + y + z;
        System.out.println("sum of entered digits\n" +s);
    }
}