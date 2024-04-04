package assingnments;

import java.time.LocalDate;
import java.util.Scanner;

public class CreditORDebit implements Payment{


@Override
public void paymentPrice( double price) {
	/*
	 * LocalDate currentDate = LocalDate.now();

        // Define the formatter for month and year
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");

        // Format the current date
        String formattedDate = currentDate.format(formatter);

        // Print the formatted date
        System.out.println("Formatted Date: " + formattedDate);
	 * 
	 */
	
	
	Scanner sc=new Scanner(System.in);
	
	int day=21;
	
	
	
		System.out.println("1.using credit card");
		System.out.println("2.using debit card");
		System.out.println();
		System.out.println("choose any options here-");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Thank you for choosing credit card");
			System.out.println("Enter your card Details ");
			
			System.out.println("Enter your card no= ");
			long number=sc.nextLong();
			System.out.println("Enter your FullName= ");
			String name=sc.next();
			System.out.println("Enter the  ExpireDate= ");
			System.out.println("Enter the  Expire year = ");
			int year=sc.nextInt();
			System.out.println("Enter the  Expire month = ");
			int month=sc.nextInt();
			
			LocalDate date=LocalDate.of(year,month,day);
			
			double finalPrice=price-(price*0.2);
			System.out.println("Due to Discount ,the final price is ="+finalPrice);
			System.out.println("Please check once all details above ...>");
			System.out.println("order is placed ");
			break;
		case 2:
			System.out.println("Thank you for choosing debit card");
			System.out.println("Enter your card Details ");
			
			System.out.println("Enter your card no= ");
			long number1=sc.nextLong();
			System.out.println("Enter your FullName= ");
			String name1=sc.next();
			System.out.println("Enter the  ExpireDate= ");
			System.out.println("Enter the  Expire year  = ");
			int year1=sc.nextInt();
			System.out.println("Enter the  Expire month = ");
			int month1=sc.nextInt();
			LocalDate date1=LocalDate.of(year1,month1,day);
			
			System.out.println("Thank you for choosing debit card");
			System.out.println("The  price is = "+price);
			System.out.println("Please check once all details above ...>");
			System.out.println("order is placed ");
			
			break;
		
		default:
			System.out.println("please Enter the mode of payment creditCard or debitCard only --");
	}
		
	
	
	
	
//System.out.println("payment is sucsessful--->");
		
		
	
		
	
}

}
