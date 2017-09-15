package problem5;

public class TestMain {

	public static void main(String[] args) {

		Computer com1 = new Computer("MacBook", "AirBook", 12, 1000, 2.70);
		Computer com2 = new Computer("Toshiba", "Core I7", 4, 500, 2.50);
		Computer com3 = new Computer("Dell", "Core I5", 8, 500, 2.30);
		System.out.println(com1);

		System.out.println(com2);

		System.out.println(com3);

		System.out.println();

		System.out.println("=============================");
		System.out.println("hascode com1: " + com1.hashCode());
		System.out.println("hascode com2: " + com2.hashCode());
		System.out.println("hascode com3: " + com3.hashCode());
		System.out.println("=============================");
		System.out.println();
		System.out.println();

		System.out.println("com1 equals com2? : " + com1.equals(com2));
		System.out.println("com1 equals com3? : " + com1.equals(com3));
	}

}
/*Output
 * Computer [Manufacturer=MacBook, Processor=AirBook, RamSize=12, DiskSize=1000, ProcessorSpeed=2.7, ComputePower=32.400000000000006]
Computer [Manufacturer=Toshiba, Processor=Core I7, RamSize=4, DiskSize=500, ProcessorSpeed=2.5, ComputePower=10.0]
Computer [Manufacturer=Dell, Processor=Core I5, RamSize=8, DiskSize=500, ProcessorSpeed=2.3, ComputePower=18.4]

=============================
hascode com1: 1057884727
hascode com2: -1842760636
hascode com3: 1756828583
=============================


com1 equals com2? : false
com1 equals com3? : false*/
