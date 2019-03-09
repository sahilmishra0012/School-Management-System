package school.management.system;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1-> Teacher\n2->Student");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter teacher's ID, Name and Salary");
				int tid=sc.nextInt();
				String tname=sc.nextLine();
				int salary=sc.nextInt();
				Teacher name=new Teacher;
			break;
			case 2:
				System.out.println("Enter Student's ID, Name and Grade");
				int sid=sc.nextInt();
				String sname=sc.nextLine();
				int grade=sc.nextInt();
				Teacher name=new Teacher
		}
		
		
		sc.close();
	}
}
