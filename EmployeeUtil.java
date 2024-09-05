package com.mbi.javacollection.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.mbi.javacollection.model.Employee;

public class EmployeeUtil {

	// Instance variable

	public static List<Employee> createListOfEmployees() {

		List<Employee> employeeList = new ArrayList<>();

		Employee employee = new Employee("emp:1", "Jack Sparrow");
		Employee employee2 = new Employee("emp:1", "Arindam");
		Employee employee3 = new Employee("emp:1", "Bond 007");

		employeeList.add(employee);
		employeeList.add(employee2);
		employeeList.add(employee3);

		return employeeList;

	}

	public static void printListOfEmployees(List<Employee> employeeListToBePrinted) {

		// System.out.println(employeeListToBePrinted);

		// Foreach with Lambda
		employeeListToBePrinted.forEach(emp -> System.out.println(emp));

	}

	public static Set<Employee> createSetOfEmployees() {

		Set<Employee> employeeSet = new TreeSet<>();

		Employee employee4 = new Employee("emp:3", "Bond 007");
		Employee employee = new Employee("emp:1", "Jack Sparrow");
		Employee employee2 = new Employee("zemp:2", "Arindam");
		Employee employee3 = new Employee("emp:3", "Bond 007");

		employeeSet.add(employee);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);

		return employeeSet;

	}

	public static void printSetOfEmployees(Set<Employee> employeeSetToBePrinted) {

		// System.out.println(employeeListToBePrinted);

		// Foreach with Lambda
		employeeSetToBePrinted.forEach(emp -> System.out.println(emp));

	}

}
