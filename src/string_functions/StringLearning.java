package string_functions;

import java.util.Scanner;

public class StringLearning {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name : ");
		
		String name = sc.nextLine();
		
		if(name=="Sagar")
		{
			System.out.println("name entered is Sagar ");
		}
		else
			System.out.println("name entered is not Sagar ");
	}
}
