package Projects;

import java.util.Scanner;

class TicketBook{
	
	Scanner sc=new Scanner(System.in);
	
	  int total_seats=100;
	
	  void bookTicket() {
		  
		  System.out.println("******WELCOME TO BUS BOOKING*****");
		  
		  System.out.println("Enter Name");
		  String s=sc.nextLine();
		  
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  
		  System.out.println("Enter Starting Route");
		  String s1=sc.nextLine();
		  
		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  
		  
		  System.out.println("Enter Distination");
		  String s3=sc.nextLine();
		  
		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  
		  
		  
		  System.out.println("Enter No. Of Seats to Booked");
			int n1=sc.nextInt();
			
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			
			System.out.println("payement (per seats 50 rupees)");
			
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
		  System.out.println("Enter Payment Method");
			System.out.println("Press 1 for Phone pay  /t Press 2 for Debit Card");
			int a=sc.nextInt();
			
			switch (a){
			
			case 1:
				
				System.out.println("Enter UPI ID");
				int Number=sc.nextInt();
				
				int num=12345;
				
				if(num==Number) {
				
				System.out.println("Enter Number Match");
			
				System.out.println("Your Total Fare  "+(n1*50));
			
				System.out.println("Enter Amount");
				int amount=sc.nextInt();
				
				System.out.println("Payment Successful");
				
				}else {
					System.out.println("Debit No.Not Match");
				}
				
			
			break;
			
			case 2:
				
				System.out.println("Enter Debit Card No");
				int debit=sc.nextInt();
				
			int Num1=123456789;
				if(debit==Num1) {
				System.out.println("Enter Number Match");
				
				System.out.println("Your Total Fare  "+(n1*50));
			
				System.out.println("Enter Amount");
				int amount=sc.nextInt();
				
				System.out.println("Payment Successful");
				}
				else {
					System.out.println("Debit No.Not Match");
				}
			
			
			
			}
			
			System.out.println("wait we're booking you ticket");
			
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			
			
			System.out.println("*********Your Booking Details*********");
			
			System.out.println("Your Route  "+s1+" - "+s3);
			
			System.out.println("Total Seats Booked  "+n1);
			
			System.out.println("Your Total Fare  "+(n1*50));
			
			System.out.println("Thanks! your ticket has been successfully booked.");
			
		  
//		  if(total_seats>=n1) {
//			  
//			   System.out.println("Your seats has been successfully booked");
//			   total_seats=total_seats-n1;
//			   System.out.println("Total availabe seats: " +total_seats);
//			   
//			  
//		  }else {
//			  
//			  System.out.println("Sorry! seats are not availabel ");
//			  System.out.println("Total availabe seats: " +total_seats);  
//		  }  
	  }	
}

public class Bus_Booking extends Thread{

   static	TicketBook tb;
	
   @Override
  public void run() {
   
  	 tb.bookTicket();
  	 
   }	
	
	
	public static void main(String[] args) throws InterruptedException {
	   tb=new TicketBook();
	   
	   Bus_Booking t1=new Bus_Booking();
	   t1.start();
	   t1.join();
	   
	}

}
