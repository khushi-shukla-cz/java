import java.util.Scanner;

public class solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter 1 to continue or 0 to stop:");
            num = sc.nextInt();

            if (num == 1) {
                System.out.println("Enter marks (out of 100):");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                }
            } else if (num != 0) {
                System.out.println("Invalid choice! Please enter 1 or 0.");
            }

        } while (num != 0); // Loop continues until the user enters 0

        System.out.println("Program ended.");
        sc.close();
    }
}
//can use ternary operator instaed of if else for a cleaner code

/* 
//apna cllg code
import java.util.Scanner;

public class solutions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 0 or 1");
        int num=0;

        do {
            System.out.println("enter marks");
            int marks=sc.nextInt();
                if(marks>=90)
                    System.out.println("This is good");
                else if(marks>=60 && marks<90)
                    System.out.println("This is also good");
                else
                    System.out.println("This is good as well");
                System.out.println("want to continue?(yes(1) or no(0))");
                num=sc.nextInt();
            } while (num==1);
        
    }
}*/