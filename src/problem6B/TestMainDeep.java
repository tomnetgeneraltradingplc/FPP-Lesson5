package problem6B;

public class TestMainDeep {

public static void main(String[] args) throws CloneNotSupportedException { // TODO Auto-generated method stub

Computer com1 = new Computer("acer", "Intel Core I5", 8, 512, 2.30); Person p1 = new Person("Gloria", com1);

System.out.println(p1);

System.out.println(); 
System.out.println("CLONE() P1"); 
Person p3 = (Person) p1.clone(); 
System.out.println("Copy : " + p3);

System.out.println("CHANGE MANUFACTURER IN P1"); 
p1.computer.setManufacturer("Apple");
 
System.out.println();

System.out.println("Original : " + p1);

System.out.println("Copy : " + p3);

}

}
/*Output
 * Person [Name=Gloria, Computer= Manufacturer=acer, Processor=Intel Core I5, RamSize=8, DiskSize=512, ProcessorSpeed=2.3, ComputePower=18.4]]

CLONE() P1
Copy : Person [Name=Gloria, Computer= Manufacturer=acer, Processor=Intel Core I5, RamSize=8, DiskSize=512, ProcessorSpeed=2.3, ComputePower=18.4]]
CHANGE MANUFACTURER IN P1

Original : Person [Name=Gloria, Computer= Manufacturer=Apple, Processor=Intel Core I5, RamSize=8, DiskSize=512, ProcessorSpeed=2.3, ComputePower=18.4]]
Copy : Person [Name=Gloria, Computer= Manufacturer=Apple, Processor=Intel Core I5, RamSize=8, DiskSize=512, ProcessorSpeed=2.3, ComputePower=18.4]]
*/
