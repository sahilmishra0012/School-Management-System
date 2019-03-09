package school.management.system;
import java.util.List;

public class School
{
	private List<Teacher> teachers;
	private List<Student> students;
	private int totalMoneyEarned;
	private int totalMoneySpent;
	
	public School(List<Teacher> teachers, List<Student> students)
	{
		this.teachers = teachers;
		this.students = students;
	}
	
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	public void setTotalMoneyEarned(int totalMoneyEarned) {
		this.totalMoneyEarned = totalMoneyEarned;
	}
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	public void setTotalMoneySpent(int totalMoneySpent) {
		this.totalMoneySpent = totalMoneySpent;
	}
}
