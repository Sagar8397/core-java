package array_learning;

public class arrayUserDefined {

	public static void main(String args[])
	{
		Student students[] = new Student[5];
		
		for(int i=0;i<5;i++)
		{
			students[i] = new Student();
			students[i].rollnumber = 100+i;
			students[i].name = "name" +i;
			students[i].address = "address" +i;
			students[i].email = "email" +i;
			students[i].mobile = "mobile" +i;
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Roll number is : " +students[i].rollnumber + "name is : " +students[i].name);
		}
	}
}
