import java.util.Scanner;

public class PalindromePattern {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want palindrome pattern");
        int a = sc.nextInt();

        for (int i = 1 ; i <= a ; i++){

            for (int j = 1 ; j <= a - i ; j++){

                System.out.print("  ");

            }

            for (int j = i ; j >= 1 ; j--){

                System.out.print(j+" ");

            }

            for (int j = 1 ; j < i ; j++){

                System.out.print(j+1+" ");

            }

            System.out.println();

        }

    }
    
}
