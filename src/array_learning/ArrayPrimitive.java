package array_learning;

public class ArrayPrimitive {

	public static void main(String args[])
	{
		int[] rollNumber = new int[10];
		
		for(int i=0;i<5;i++)
		{
			rollNumber[i] = i+100;
		}
		
		String name[] = new String[5];
		name[0] = "a";
		name[1] = "b";
		name[2] = "c";
		name[3] = "d";
		name[4] = "e";
		
		String address[] = new String[5];
		address[0] = "aaaaa";
		address[1] = "bbbbb";
		address[2] = "ccccc";
		address[3] = "ddddd";
		address[4] = "eeeee";
		
		for(int i=0;i<5;i++)
		System.out.println("roll number is : " +rollNumber[i] + " name is " +name[i] + " address is : " +address[i]);
	}
}