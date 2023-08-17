import java.util.Scanner;
public class share{
    public static void main(String[] args)
    {
        Scanner Scanner=new Scanner(System.in);
        int x=Scanner.nextInt();
        int y=Scanner.nextInt();
        if(x%2==0&&(x>0||y%2==0)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}