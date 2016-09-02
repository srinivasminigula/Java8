package com.j8.collectors;

public class Person {

	public static double PASS_THRESHOLD = 3.5;
	private double salary;
	private double grade;
	private String name;
	private String firstName;
	private String lastName;
	private String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public enum PASS_CODES {
		PASS_THRESHOLD
	}

	Person(String name, String department, double grade, double salary) {
		this.name = name;
		this.department = department;
		this.grade = grade;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Builder [name=" + name + ", salary=" + salary + ", grade="
				+ grade + ", department=" + department + "]";
	}
	public static class Builder {
		private String name;
		private double salary;
		private double grade;
		private String department;

		public Builder setUsername(String firstName, String lastName) {
			this.name = (firstName != null && lastName != null) ? firstName + " " + lastName : lastName;
			return this;
		}

		public Builder setSalary(Double salary) {
			this.salary = salary;
			return this;
		}

		public Builder setGrade(Double salary) {
			this.salary = salary;
			return this;
		}

		public Builder setDepartment(String department) {
			this.department = department;
			return this;
		}

		public Person build() {
			return new Person(name, department, grade, salary);
		}

	}
}
