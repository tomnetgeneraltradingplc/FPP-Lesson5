package problem2;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.Scanner;

public class TestDeptEmployee {
public static void main(String[] args) {
	DeptEmployee[] department= new DeptEmployee[5];
	department[0]=new Professor("Thomas Tibebu",105000, LocalDate.of(2010, 6, 20),20);
	department[1]=new Professor("Jone Smith",85000, LocalDate.of(2015, 10, 22),10);
	department[2]=new Professor("Anne Jakson",60000, LocalDate.of(2016, 10, 30),5);
	department[3]=new Secretary("Ami Mekaile", 65000, LocalDate.of(2015, 5, 10), 80);
	department[4]=new Secretary("Danile Frank",70000,LocalDate.of(2005, 2, 19),60);
	
	for (DeptEmployee EmpList : department) {
		System.out.println(EmpList);
	}
	Scanner scanner=new Scanner(System.in);
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println("Do you wish to see the sum of all salaries in the department ? Y/N");
	String answer= scanner.next();
	if(answer.equalsIgnoreCase("Y")){

		System.out.println("All the Salaries in the Department is : " + getTotalDepartmentSalary(department));
	}
	else {
		System.out.println("Good Bye, You are not intersted to see the sum of all the salaries!!!!"); 
		System.exit(0);
	}
	}

	public static double getTotalDepartmentSalary(DeptEmployee[] department){
		double DepartmentTotal=0.0;
		for (DeptEmployee DepList : department) {
			DepartmentTotal +=DepList.computeSalary();
		}
		return DepartmentTotal;
}
}
/*Output
Professor [Name=Thomas Tibebu, Salary=105000.0, HireDate=2010-06-20, NumberOfPublication=20]
Professor [Name=Jone Smith, Salary=85000.0, HireDate=2015-10-22, NumberOfPublication=10]
Professor [Name=Anne Jakson, Salary=60000.0, HireDate=2016-10-30, NumberOfPublication=5]
Secretary [Name=Ami Mekaile, Salary=65000.0, HireDate=2015-05-10, OvertimeHours=80.0]
Secretary [Name=Danile Frank, Salary=70000.0, HireDate=2005-02-19, OvertimeHours=60.0]
---------------------------------------------------------------------------------
---------------------------------------------------------------------------------
Do you wish to see the sum of all salaries in the department ? Y/N
y
All the Salaries in the Department is : 386680.0
*/