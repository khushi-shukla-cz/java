import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int usernum;
        int mynum=(int) (Math.random()*100);

        do { 
            System.out.println("guess my number(1-100)");
            usernum=sc.nextInt();

            if(usernum==mynum){
                System.out.println("corect num");
                break;
            }
            else if(usernum>mynum){
                System.out.println("num is greater");
            }
            else{
                System.out.println("num is smaller");
            }
        } while (usernum>0);
    }
}