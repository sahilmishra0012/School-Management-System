package school.management.system;

public class Teacher
{
	private int id;
	private String name;
	private int salary;
	
	public Student(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void setgrade(int grade)
	{
		this.grade=grade;
	}
	public void updatefeepaid(int fee)
	{
		this.feePaid=fee;
	}
}
