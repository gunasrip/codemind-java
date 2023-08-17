import java.util.Scanner;
public class pandemic
{
    public static void main(String[] args)
    {
        Scanner Scanner=new Scanner(System.in);
        int n=Scanner.nextInt();
        if(n==2)
        {
            System.out.println("1");
        }
        else if(n==1)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("2");
        }
    }
}
