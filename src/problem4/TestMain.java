package problem4;

public class TestMain {

	public static void main(String[] args) {

		Payable em1 = new CommissionEmployee("Hanna", "Smith", "011-526-658", 10000, 2);
		Payable em2 = new HourlyEmployee("Mariya", "John", "011-888-400", 45, 80.5);
		Payable em3 = new SalariedEmployee("Thomas", "Tibebu", "000-321-258", 9000);

		Payable em4 = new BasePlusCommissionEmployee("Mark", "Antoni", "789-001-212", 57000, 0.2, 1);
		Payable em5 = new Invoice("5645", "Laptop", 5, 3000);

		Payable[] Pay = new Payable[5];
		Pay[0] = em1;

		Pay[1] = em2;
		Pay[2] = em3;
		Pay[3] = em4;
		Pay[4] = em5;
		double sum = 0;
		for (Payable payable : Pay) {
			System.out.println(payable);
			System.out.println("PaymentAmount= " + payable.getPaymentAmount());
			if (payable instanceof Employee)

				sum = sum + payable.getPaymentAmount();

		}

		System.out.println();
		System.out.println("Sum of all Employee:");
		System.out.println(sum);

	}

}
/*Output
CommissionEmployee [grossSales=10000.0, commissionRate=2.0, FirstName=Hanna, LastName=Smith, SocialSecurityNumber=011-526-658]
PaymentAmount= 20000.0
HourlyEmployee [wage=45.0, hours=80.5, FirstName=Mariya, LastName=John, SocialSecurityNumber=011-888-400]
PaymentAmount= 3622.5
SalariedEmployee [weeklySalary=9000.0, FirstName=Thomas,LastName=Tibebu, SocialSecurityNumber=000-321-258]
PaymentAmount= 9000.0
BasePlusCommissionEmployee [baseSalary=1.0, getGrossSales()=57000.0, CommissionRate=0.2, FirstName=Mark, LastName=Antoni, SocialSecurityNumber=789-001-212]
PaymentAmount= 11401.0
Invoice [partNumber=5645, partDesription=Laptop, quantity=5, pricePerItem=3000.0]
PaymentAmount= 15000.0

Sum of all Employee:
44023.5
*/