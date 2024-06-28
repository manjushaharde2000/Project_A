package data;

public class Employee {
	int e_id;
	String e_name;
	String e_gender;
	int e_salary;
	
	Employee next;
	public Employee(int e_id, String e_name, String e_gender, int e_salary)
	{
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_gender = e_gender;
		this.e_salary = e_salary;
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_gender=" + e_gender + ", e_salary=" + e_salary
				+ "]";
	}
	
	

}
