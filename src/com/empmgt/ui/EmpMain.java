package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmpMain {

	public static void main(String[] args) {
		EmpMain obj = new EmpMain();
		obj.go();

	}

	private void go() {
		Employee employees[] = new Employee[4];
		Department department1 = new Department("Dept1", "Development");
		Department department2 = new Department("Dept2", "Testing");
		Developer developer1 = new Developer(111, "Arya", department1, "React");
		Developer developer2 = new Developer(112, "Mithi", department1, "Angular");
		Tester tester1 = new Tester(113, "Hrithik", department2, "JUnit");
		Tester tester2 = new Tester(114, "Radha", department2, "TestNG");
		employees[0] = developer1;
		employees[1] = developer2;
		employees[2] = tester1;
		employees[3] = tester2;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] instanceof Developer) {
				Developer developer = (Developer) employees[i];
				dispEmployee(developer);
			} else {
				Tester tester = (Tester) employees[i];
				displayEmployee(tester);
			}

		}

	}

	private void dispMainEmployee(Employee employee) {
		System.out.println(" The employee id is " + employee.getId());
		System.out.println(" The employee name is " + employee.getName());
		Department department = employee.getDepartment();
		System.out.println("The employee department id is " + department.getDeptId());
		System.out.println("The employee department name is " + department.getDeptName());

	}

	private void dispEmployee(Developer employee) {
		dispMainEmployee(employee);
		System.out.println(" The language used by Developer is " + employee.getLanguage());

	}

	private void displayEmployee(Tester employee) {
		dispMainEmployee(employee);
		System.out.println("The tools used by Tester is " + employee.getTools());

	}

}
