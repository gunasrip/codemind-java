import java.util.Scanner;
public class siri{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=1;i<n;i++)
        {
            a=(int)((n*(n+1))/2);
        }
            System.out.println(a);
        
    }
}