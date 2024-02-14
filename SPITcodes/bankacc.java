import java.util.Scanner;

	public class bankacc{

			double balance;
			double interest;

	public bankacc(double initialbalance,double initialinterest){
				
				balance=initialbalance;
				interest=initialinterest;
				}
			public void deposit(int amount) {
				
				balance=balance+amount;

				System.out.println("Deposit of rupees "+amount+" done successfully!");
 				}	

 			public void withdrawal(int withdrawamount) {

 					

 					if(withdrawamount<=balance){

 						balance=balance-withdrawamount;
 						System.out.println("Withdrawal of rupees "+withdrawamount+" is successful!");

 					}
 					else{
 							System.out.println("Insufficient funds in your account.");
 					}
				}

 			public void compoundint(int years) {

 					double compint=balance*(Math.pow(1+(interest/100),years));
 					System.out.println("Your amount after "+years+" is "+compint);
				}				


			public void getbal(){
			
					System.out.println("Your balance is "+balance);
			}	

}

		public static void main(String[] args)
		{
			Scanner mayur=new Scanner(System.in);
			System.out.println("Enter initial balance");
			double initialbal=mayur.nextDouble();
			double initialint=mayur.nextDouble();
			bankacc  BA=new bankacc(initialbal,initialint);
			int choice;
			do{
				BA.display();
				choice=mayur.nextInt();
				switch(choice)
				{
				
				case 1:
				System.out.println("Enter the amount to be deposit");
				double amount=mayur.nextDouble();
				BA.deposit(amount);
				break;
				
				case 2:
				System.out.println("Enter the amount to be withdraw");
				double withdrawamt=mayur.nextDouble();
				BA.withdraw(withdrawamt);
				break;
				
				case 3:
				System.out.println("Enter the number of years");
				int years=mayur.nextInt();
				BA.interest(years);
				break;
				
				case 4:
				BA.getbalance();
				break;
				
				case 5:
				System.out.println("Exiting the program.Thankyou");
				break;
				
				default:
				System.out.println("Invalid choice.Please choose a valid option");
				}
			}
			while(choice!=5);
			
			mayur.close();
			}