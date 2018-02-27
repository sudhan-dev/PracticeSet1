
//Write a program to calculate Salary for an employee using interface.
import java.io.IOException;
import java.util.Scanner;

interface Employee {
	public void Salary(String name, double sal);

	void display();
}

class Practice9 implements Employee {
	String emp_name;
	double basic_salary;

	public void Salary(String name, double sal) {
		emp_name = name;
		basic_salary = sal;
	}

	public void display() {
		double da = basic_salary * 15 / 100;
		double hra = basic_salary * 10 / 100;
		double gross_sal = basic_salary + da + hra;
		System.out.println("Emplyee Name= " + emp_name);
		System.out.println("Gross Salary= " + gross_sal);
	}

	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String name = in.nextLine();
		System.out.println("Enter Basic Salary");
		double sal = in.nextDouble();
		Practice9 e = new Practice9();
		e.Salary(name, sal);
		e.display();

		in.close();
	}
}
