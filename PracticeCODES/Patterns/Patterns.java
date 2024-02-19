import java.util.Scanner;

public class Patterns {

    // Butterfly Pattern
    public void butterflyPattern(int m) {

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            for (int j = 1; j <= 2 * (m - i); j++) {

                System.out.print("  ");

            }

            for (int j = i; j >= 1; j--) {

                System.out.print("* ");

            }

            System.out.println();
        }

        for (int i = m; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {

                System.out.print("* ");

            }

            for (int j = 1; j <= 2 * (m - i); j++) {

                System.out.print("  ");

            }

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }

    }

    // Diamond Pattern
    public void diamondPattern(int a) {

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {

                System.out.print(" ");

            }

            for (int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

        for (int i = a; i >= 1; i--) {

            for (int j = 1; j <= a - i; j++) {

                System.out.print(" ");

            }

            for (int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

    // Palindrome Pattern
    public void palindromePattern(int a) {

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {

                System.out.print("  ");

            }

            for (int j = i; j >= 1; j--) {

                System.out.print(j + " ");

            }

            for (int j = 1; j < i; j++) {

                System.out.print(j + 1 + " ");

            }

            System.out.println();

        }

    }

    // Solid Rhombus
    public void solidRhombus(int a) {

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {

                System.out.print("  ");

            }

            for (int k = 1; k <= a; k++) {

                System.out.print("* ");

            }

            System.out.println();

        }

    }

    // Triangle
    public void triangle(int a) {

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {

                System.out.print(" ");

            }

            for (int k = 1; k <= i; k++) {

                System.out.print(i + " ");
            }

            System.out.println();
        }

    }

    // Display menu
    public static void displayMenu() {

        System.out.println("1.Butterfly Pattern");

        System.out.println("2.Diamond Pattern");

        System.out.println("3.Palindrome Pattern");

        System.out.println("4.Solid Rhombus");

        System.out.println("5.Triangle");

        System.out.println("6.Exit");

        System.out.println("Choose an option between 1-6");

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how big pattern you want to print");
        int a = sc.nextInt();

        Patterns PA = new Patterns();
         int choice;

         do{

            PA.displayMenu();
            choice = sc.nextInt();

            switch(choice){

             case 1 : 
                    PA.butterflyPattern(a);
                    break;

             case 2 : 
                    PA.diamondPattern(a); 
                    break;    
                    
             case 3 :
                    PA.palindromePattern(a);
                    break;
                    
             case 4 :
                    PA.solidRhombus(a); 
                    break;   
                    
             case 5 :
                    PA.triangle(a);   
                    break;
                    
             case 6 :
                    System.out.println("Exiting the  program.\nThankyou");
                    break;

             default : 
                    System.out.println("Invalid choice . Please  choose valid option");       

                    
            }

        }   

       
            while(choice!=6);

            sc.close();

    }   
}