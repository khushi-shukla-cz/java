import java.util.*;

class numpyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();

        // half number pyramid
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n");

        //inverted half numpyramid
        // for(int i=m;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //inverted half num pyramid with better runtime
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}