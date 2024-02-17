import java.util.Scanner;

class SolidRhombus{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of sides of rhombus");
        int a=sc.nextInt();

        for(int i = 1 ; i <= a ; i++){

            for (int j = 1 ; j <= a-i ; j++){

                System.out.print("  ");

            }

            for (int k = 1 ; k <= a ; k++){

            System.out.print("* ");

            }

            System.out.println();

        }

        

    }

}