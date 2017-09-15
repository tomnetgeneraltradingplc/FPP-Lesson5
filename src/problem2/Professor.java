package problem2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
private int numberOfPublication;

public Professor(String name, double salary, LocalDate hireDate, int numberOfPublication) {
	super(name, salary, hireDate);
	this.numberOfPublication = numberOfPublication;
}

public int getNumberOfPublication() {
	return numberOfPublication;
}

public void setNumberOfPublication(int numberOfPublication) {
	this.numberOfPublication = numberOfPublication;
}

@Override
public String toString() {
	return "Professor [Name=" + name + ", Salary=" + salary + ", HireDate=" + hireDate + ", NumberOfPublication=" + numberOfPublication + "]";
}

}
