import java.util.*;
import java.util.regex.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        try{
            int a=sc.nextInt();
            System.out.println(a);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}

