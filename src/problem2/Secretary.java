package problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
private double overtimeHours;

public Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
	super(name, salary, hireDate);
	this.overtimeHours = overtimeHours;
}

public double getOvertimeHours() {
	return overtimeHours;
}

public void setOvertimeHours(double overtimeHours) {
	this.overtimeHours = overtimeHours;
}

@Override
public double computeSalary() {
	
	return (salary + (12*overtimeHours));
}

@Override
public String toString() {
	return "Secretary [Name=" + name + ", Salary=" + salary + ", HireDate=" + hireDate + ", OvertimeHours=" + overtimeHours + "]";
}

}
