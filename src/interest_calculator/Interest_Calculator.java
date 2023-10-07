package interest_calculator;
import java.util.Scanner;

public class Interest_Calculator {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter principal ammount : ");
		int principal = sc.nextInt();
		
		System.out.println("enter rate of interest : ");
		float rate = sc.nextFloat();
		
		System.out.println("enter time in year : ");
		int time = sc.nextInt();
		sc.close();
		
		double interest = principal * rate * time/100;
		System.out.println("interest is " + interest);
	}
}
