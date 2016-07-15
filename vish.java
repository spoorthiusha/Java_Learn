import java.util.Scanner;
 public class vish
{
    public static void main(String[]args)
    {
        int a,b,c,d,ch;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose 1 for Spoorthi \n Choose 2 for Vishruth");
        ch = in.nextInt();
        
        switch( ch )
        {
            case 1:
        System.out.println("enter the value of a\n");
        a = in.nextInt();
        
        System.out.println("enter the value of b\n");
        b = in.nextInt();
        
        System.out.print("enter the value of c\n");
        c = in.nextInt();
        
        System.out.println("enter the value of d\n");
        d = in.nextInt();
         
        if ( a < b && b > d)
        {
            System.out.println("Vishu is my besttttt friend");
        }
        else if(c > d || d < a)
        {
            System.out.println("Vishu u r sooo lovelyyy idiott kanoo");
        }
        else if( d < c)
        {
            System.out.println("U r my lovely Faltooz");
        }
        else
        {
            System.out.println("V r KillerFaltooz");
        
        }
        
        case 2:
        System.out.println("2 u r selected");
        
        default:
        System.out.println("Exit");
        
    }
        
        
    }
}

   
        