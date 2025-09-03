import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        int a[][]= new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                c[i][j]=sc.nextInt();
                System.out.println(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
