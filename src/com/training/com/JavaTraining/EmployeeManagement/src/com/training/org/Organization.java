package com.training.org;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Organization {

	
	public static void main(String[] args) {
		
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Scanner input=new Scanner(System.in);
		char ch = 0;
		int flag=0,flag1=0;
		
		do {
			
			System.out.println("1: Add Record \n2: Display Record \n3: Delete Record \n4: Update Record \nEnter your choice");
			int choice=input.nextInt();
			switch(choice) {
			case 1:
			System.out.println("Enter EmpId: ");
			int id=input.nextInt();
			System.out.println("Enter Employee Name: ");
			String name =input.next();
			System.out.println("Enter Employee Salary: ");
			double sal=input.nextDouble();
			
			empList.add(new Employee(id,name,sal));
			System.out.println("record added......... ");
			break;
			
			case 2:
				System.out.println("-------- Records -------");
				for(Employee e: empList) {
					System.out.println(e);
				}
				System.out.println("---------------");

				break;
				
			case 3:
				System.out.println("enter name to delete:");
				String nm=input.next();
				
				for(int i=0;i<empList.size();i++) {
					if(empList.get(i).getEmpName().equalsIgnoreCase(nm)) {
						empList.remove(i);
						System.out.println("Record deleted....");
						flag=1;
						break;
					}
				}if(flag==0) {
					System.out.println("Record not available....");

				}break;
				
			case 4:
				System.out.println(" 1: Update Name \n 2: Update Salary");
				int choice1=input.nextInt();
				
				switch(choice1) {
				case 1:
					System.out.println("Enter name to be replaced:");
					String n1=input.next();
					for(int i=0;i<empList.size();i++) {
						if(empList.get(i).getEmpName().equalsIgnoreCase(n1)) {
							System.out.println("Enter new name: ");
							String newNm=input.next();
							empList.get(i).setEmpName(newNm);
							System.out.println("Updated Successfully....");
							flag1=1;
						}break;
					}
					
				if(flag1==0) {
					System.out.println("Record not available....");
				}break;
				case 2: 
					System.out.println("Provide yearly increment for employee with condition");
					System.out.println("Enter the Salary for Condition..");
					int checksal=input.nextInt();
					System.out.println("Enter increment percentage");
					double inc=input.nextDouble();
					
					for(int i=0;i<empList.size();i++) {
						if(empList.get(i).getSalary()<checksal) {
							empList.get(i).setSalary(empList.get(i).getSalary()*(inc/100+1));
						}
					}

				}break;	
			default:
				System.out.println("Invalid choice");
				break;	
				
			}
			System.out.println("do you want to continue....");
			ch=input.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		

	}
}
