package data;

public class Linkedlist {
Employee root;

void create_emp_list()
{
	root = null;
}
public void Add_left_Emp(Employee emp)
{
	if(root == null)
	{
		root = emp;
	}
	else
	{
		emp.next = root;
		root = emp;
	}
	System.out.println(emp+ "new Left_Emp Insrted");
}
void delete_left_emp()
{
	if(root == null)
	{
		System.out.println("Empty List");
	
	}
	else
	{
		Employee temp = root;
		root = root.next;
		System.out.println(temp.e_id+"deleted");
		
	}
}
void Add_Right_Emp(Employee emp)
{
	if(root == null)
	{
		root = emp;
		
	}
	else
	{
	Employee temp = root;
	while(temp.next != null)
	{
		temp = temp.next;
	}
	temp.next=emp;
	
   }
 System.out.println(emp+ "New Right_Emp Inserted");
}
void delete_right_emp()
{
	if(root == null)
	{
		System.out.println("Empty List");
	}
	else
	{
		Employee temp = root;
		Employee temp2 = temp;
		while(temp.next != null)
		{
			temp2 = temp;
			temp = temp.next;
		}
		if(temp == root)
		{
			root = null;
		}
		else
		{
			temp2.next=null;
		}
		System.out.println(temp.e_name+"deleted");
	}
}
void print_emp_list()
{
	if(root == null)
	{
		System.out.println("Empty List");
	}
	else
	{
		Employee temp = root;
		while(temp != null) 
		{
		System.out.println(temp.e_name);
	    temp = temp.next;
	     }   
	}
}
void search_emp_list(int key)
{
	if(root == null)
	{
		System.out.println("Empty List");
	}
	else
	{
		Employee temp = root;
		while(temp != null)
		{
			if(temp.e_id == key)
			{
				System.out.println("Employee Found");
				System.out.println("Employee ID :"+temp.e_id);
				System.out.println("Employee Name:"+temp.e_name);
				return;
			}
			temp = temp.next;
			
		}
		System.out.println("Employee not Found");
	}
}

void delete_emp(int key)
{
	if(root == null)
	{
		System.out.println("Empty List");
	}
	else
	{
		Employee temp = root;
		Employee temp2 = temp;
		while(temp.next != null)
		{
				if(temp.e_id == key)
				{
					break;
				}
				temp2 = temp;
				temp = temp.next;
				
			}
			if(temp == null)
			{
				System.out.println("Not Found");
			}
			else
			{
				if(temp == root)
				{
					root = temp.next;
				}
				else if(temp.next == null)
				{
					temp2.next = null;
				}
				else
				{
					temp2.next = temp.next;
				}
				System.out.println("Employee deleted");
			}
		}
}
void gender(String gen)
{
	if(root == null)
	{
		System.out.println("Empty List");
		
	}
	else
	{
		Employee temp =  root;
		boolean found = false;
		while(temp != null)
		{
			if(temp.e_gender.equals(gen))
			{
				System.out.println(temp);
				found = true;
			}
			temp = temp.next;
		}
		if(!found)
		{
			System.out.println("Gernder not found");
		}
	}
}
}
