package org.employee;

import org.company.Company;

public class Employee extends Company {
	
	public void employeeName() {
		System.out.println("vijay");
	}

	public void employeeID() {
		System.out.println("895566");
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.employeeID();
		e.employeeName();
		e.companyId();
		e.companyName();
		

	}

	
}
