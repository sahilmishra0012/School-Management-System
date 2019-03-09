package school.management.system;

public class Student
{
	private int id;
	private String name;
	private int grade;
	private int feePaid;
	private int feetotal;
	
	public Student(int id,String name,int grade)
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.feetotal=0;
		this.feePaid=619000;
	}

	public void setgrade(int grade)
	{
		this.grade=grade;
	}
	
	public void updatefeepaid(int fee)
	{
		this.feePaid+=fee;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeePaid() {
		return feePaid;
	}

	public int getFeetotal() {
		return feetotal;
	}
	
}
