package data;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Linkedlist list = new Linkedlist();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Data");
		 int choice;
		 list.create_emp_list();
		 do
		 {
			 System.out.println("\n1.Insert left\n2.Delete left\n3.insert right\n4.delete right\n5.search\n6.print\n7.delete id\n8.Gender\n0.Exit\n");
			 choice = sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 System.out.println("Enter datanto insert left");
				 Employee e1 = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
				 list.Add_left_Emp(e1);
				 break;
				 
			 case 2:
				 list.delete_left_emp();
				 break;
				 
			 case 3:
				 System.out.println("Enter data to insert right");
				 Employee e2 = new Employee (sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
				 list.Add_Right_Emp(e2);
				 break;
				 
			 case 5:
				 System.out.println("Enter id to search");
				 int id = sc.nextInt();
				 list.search_emp_list(id);
				 break;
				 
				 
			 case 6:
				 list.print_emp_list();
				 break;
				 
			 case 7:
				 System.out.println("Enter id to delete");
				 int Id = sc.nextInt();
				 list.delete_emp(Id);
				 break;
				 
			 case 8:
				 System.out.println("Enter gender to search");
				 String gender = sc.next();
				 list.gender(gender);
				 break;
			 }
			 
		 }
		 while(choice!=0);
				 

	}

}
