import java.util.*;

public class sum_naturalnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=i+sum;
        }
        System.out.println("sum="+sum);
    }
}