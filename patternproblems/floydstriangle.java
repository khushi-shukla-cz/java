import java.util.*;

public class floydstriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m=sc.nextInt();
        int num=1;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+++" ");
            }
            System.out.println();
        }

    }
}
