// by me
import java.util.*;

class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number(0 or 1):");
        int n=sc.nextInt();

        if(n==0){
            System.out.println("stop");
        }
        else if (n==1) {
            int marks;
            do{
                System.out.println("Enter marks(out of 100):");
                marks=sc.nextInt();

                if(marks>=90)
                    System.out.println("good");
                else if(marks>=60 && marks<=89)
                    System.out.println("this is also good");
                else
                    System.out.println("good as well");
                System.out.println("Enter number(0 or 1):");
                n=sc.nextInt();
        }while(n==1);
        }
        else{
            System.out.println("Invalid number");
        }
    }
}



// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;

//         do {
//             System.out.println("Enter 1 to continue or 0 to stop:");
//             num = sc.nextInt();

//             if (num == 1) {
//                 System.out.println("Enter marks (out of 100):");
//                 int marks = sc.nextInt();

//                 if (marks >= 90) {
//                     System.out.println("This is Good");
//                 } else if (marks >= 60) {
//                     System.out.println("This is also Good");
//                 } else if (marks >= 0) {
//                     System.out.println("This is Good as well");
//                 } else {
//                     System.out.println("Invalid marks. Please enter a value between 0 and 100.");
//                 }
//             } else if (num != 0) {
//                 System.out.println("Invalid choice! Please enter 1 or 0.");
//             }

//         } while (num != 0); // Loop continues until the user enters 0

//         System.out.println("Program ended.");
//         sc.close();
//     }
// }
// //can use ternary operator instaed of if else for a cleaner code
