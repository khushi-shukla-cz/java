import java.util.*;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int n=sc.nextInt();

        // solid butterfly
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        // hollow butterfly
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
