import java.util.*;

class solidrectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();

        // solid rectangle
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

        // hollow rectangle
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==m || j==1  ||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}