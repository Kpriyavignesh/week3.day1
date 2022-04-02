package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student Name");
	}
	
	public void studentDept() {
		System.out.println("Student Department Name");
	}
	
	public void studentId() {
		System.out.println("Student ID");
	}
	

	public static void main(String[] args) {

		System.out.println("Student Details are:");
		Student stu = new Student ();
		stu.studentDept();
		stu.studentId();
		stu.studentDept();
		
		System.out.println("Department Details are:");
		Department dep = new Department ();
		dep.deptName();
		
		System.out.println("College Details are:");
		College col = new College ();
		col.collegeName();
		col.collegeCode();
		col.collegeRank();

		// TODO Auto-generated method stub
//Methods   :studentName(),studentDept(),studentId()
		//Description:
	//	create above 3 class and call all your class methods into the Student using multilevel inheritance.
//
	}

}
