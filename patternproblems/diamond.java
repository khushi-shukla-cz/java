import java.util.*;

public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m=sc.nextInt();

        //refer notes once 
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=m;i>=1;i--){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
