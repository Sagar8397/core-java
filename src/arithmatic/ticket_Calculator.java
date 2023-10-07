package arithmatic;
import java.util.Scanner;

public class ticket_Calculator {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter passanger name : ");
		String name = sc.nextLine();
		
		System.out.println("enter passanger age : ");
		int age = sc.nextInt();
		
		String ticketPrice;
		
		if (age >= 0 && age <= 10)
		{
			ticketPrice = "no ticket";
		}
		else if(age >= 11 && age <= 20)
		{
			ticketPrice = "half ticket";
		}
		else if(age >= 21 && age <= 50) 
		{
			ticketPrice = "full ticket";
		}
		else {
			ticketPrice = "half ticket";
		}
		sc.close();
		
		System.out.println("name is : " +name);
		System.out.println("age is : " +age);
		System.out.println("ticket price is : " +ticketPrice);
	}
}
