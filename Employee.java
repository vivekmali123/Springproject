package com.mbi.javacollection.model;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private String employeeId;
	private String employeeName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Hashcode called");
		return Objects.hash(employeeId, employeeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		System.out.println("equals called");
		return Objects.equals(employeeId, other.employeeId) && Objects.equals(employeeName, other.employeeName);
	}

	@Override
	public int compareTo(Employee o) {
		System.out.println("comparable called!");
		return this.getEmployeeId().compareTo(o.getEmployeeId());
	}
	
	
}
