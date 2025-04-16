import java.util.*;

public class Calculator {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator=sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println("a+b="+(a+b));
                break;
            case '-':
                System.out.println("a-b="+(a-b));
                break;
            case '*':
                System.out.println("a*b="+(a*b));
                break;
            case '/':
                System.out.println("a/b="+(a/b));
                break;
            case '%':
                System.out.println("a%b="+(a%b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
