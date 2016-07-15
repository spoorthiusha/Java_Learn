import java.util.Scanner;
 public class Switch
{
    public static void main(String[]args)
    {
        int ch;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose 1 for Spoorthi \n Choose 2 for Vishruth");
        ch = in.nextInt();
        
        switch( ch )
        {
            case 1:
            System.out.println("1 u r selected");
            break;
            
            case 2:
            System.out.println("2 u r selected");
            break;
            
            default:
            System.out.println("Exit");
        
        }
    }
}

   
        