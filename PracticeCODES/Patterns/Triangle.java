import java.util.Scanner;

public class Triangle {

    public static void main (String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of triangle");
    int a = sc.nextInt();

    for (int i = 1 ; i <= a ; i++){

        for (int j = 1 ; j <= a-i ; j++){

            System.out.print(" ");

        }

            for (int k = 1 ; k <= i ; k++){

                 System.out.print(i + " ");
            }
       
        System.out.println();
    }
    
}
}