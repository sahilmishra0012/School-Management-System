package school.management.system;
import java.util.*;
public class Main
{
	private static List<Teacher> teachers;
	private static List<Student> students;

	public static void main(String[] args)
	{
		boolean x=true;
		Scanner sc=new Scanner(System.in);
		while(x)
		{
			System.out.println("1-> Teacher\n2->Student\n3->Exit");
			int ch=sc.nextInt();
			List<Teacher> teachers=new ArrayList<>();
			List<Student> students=new ArrayList<>();
			switch(ch)
			{
				case 1:
					System.out.println("Enter teacher's ID, Name and Salary");
					int tid=sc.nextInt();
					sc.nextLine();
					String tname=sc.nextLine();
					int salary=sc.nextInt();
					teachers.add(new Teacher(tid,tname,salary));
				break;
				case 2:
					System.out.println("Enter Stude1nt's ID, Name and Grade");
					int sid=sc.nextInt();
					sc.nextLine();
					String sname=sc.nextLine();
					int grade=sc.nextInt();
					students.add(new Student(sid,sname,grade));
				break;
				case 3:
					x=false;
			}
		}
		System.out.println("Students and Teachers entered. Create School");
		School lpc=new School(teachers,students);
		sc.close();
	}
}