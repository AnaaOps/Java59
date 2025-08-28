import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int x,y,z=0;
        Scanner sc=new Scanner(System.in);

        try {
            x=sc.nextInt();
            y= sc.nextInt();
            z = x / y;
            System.out.println("Exception occurs");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println(z);
        }
    }
}
