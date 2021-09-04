import java.util.Scanner;
 public class Student{
	int roll_no;
	String name;
	float marks;
	
	public void input()
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter Roll No. of Student: ");
		roll_no = in.nextInt();
		in.nextLine();
		System.out.print("Enter Name of Student: ");
		name = in.nextLine();
		System.out.print("Enter Marks of student: ");
		marks = in.nextFloat();
		
	}
	
	public void display()
	{
		

		System.out.println("Roll_No. of Student : " +roll_no);
		System.out.println("Name of Student : " +name);
		System.out.println("Marks of Student : " +marks);
	}
	
	public static void main(String args[])
	{
		Student obj = new Student();
		obj.input();
		obj.display();
	}
}