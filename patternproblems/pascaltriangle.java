import java.util.*;

public class pascaltriangle {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m = sc.nextInt();

        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num = num * (i - j) / j;
            }
            System.out.println();
        }
    }
}
