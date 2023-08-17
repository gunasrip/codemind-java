import java.util.Scanner;
public class number{
    public static void main(String[] args)
    {
        Scanner Scanner= new Scanner(System.in);
        int x=Scanner.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}