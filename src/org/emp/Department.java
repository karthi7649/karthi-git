package org.emp;

public class Department extends Employee {

	@Override
	public void employeeDesignation() {

		System.out.println("Employee Designation:BE MECH");
	}

	@Override
	public void employeeName() {
		System.out.println("Employee Name:karthi");
	}

	public static void main(String[] args) {
		Department d = new Department();
		d.employeeName();
		d.employeeDesignation();
	}
}
