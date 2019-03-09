package school.management.system;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		boolean x=true;
		Scanner sc=new Scanner(System.in);
		while(x)
		{
			System.out.println("1-> Teacher\n2->Student");
			int ch=sc.nextInt();
			List<Teacher> teachers=new ArrayList<>();
			List<Student> students=new ArrayList<>();
			switch(ch)
			{
				case 1:
					System.out.println("Enter teacher's ID, Name and Salary");
					int tid=sc.nextInt();
					String tname=sc.nextLine();
					int salary=sc.nextInt();
					teachers.add(new Teacher(tid,tname,salary));
				break;
				case 2:
					System.out.println("Enter Student's ID, Name and Grade");
					int sid=sc.nextInt();
					String sname=sc.nextLine();
					int grade=sc.nextInt();
					students.add(new Student(sid,sname,grade));
			}
		}
		System.out.println("Students and Teachers entered. Create School");
		sc.close();
	}
}