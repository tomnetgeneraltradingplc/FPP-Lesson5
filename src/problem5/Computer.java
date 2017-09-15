package problem5;

public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;

	private double processorSpeed;

	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		super();

		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;

		this.processorSpeed = processorSpeed;

	}

	public int getRamSize() {
		return ramSize;

	}

	public int getDiskSize() {
		return diskSize;

	}

	public double getProcessorSpeed() {
		return processorSpeed;

	}

	public double computePower() {

		double res = this.getRamSize() * this.getProcessorSpeed();
		return res;

	}

	@Override

	public String toString() {

		return "Computer [Manufacturer=" + manufacturer + ", Processor=" + processor + ", RamSize=" + ramSize

				+ ", DiskSize=" + diskSize + ", ProcessorSpeed=" + processorSpeed + ", ComputePower=" + computePower()

				+ "]";

	}

	@Override

	public int hashCode() {
		int hash = 5;

		int result = 1;

		result = hash * result + (manufacturer.hashCode() + processor.hashCode());
		result = hash * result + (ramSize + diskSize);

		long temp = Double.doubleToLongBits(processorSpeed);
		result = hash * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override

	public boolean equals(Object obj) {
		if (obj == null)

			return false;

		if (getClass() != obj.getClass())
			return false;

		Computer other = (Computer) obj;

		boolean isEqual = manufacturer.equals(other.manufacturer) && processor.equals(other.processor)

				&& (ramSize == other.ramSize) && (diskSize == other.diskSize) && processorSpeed == other.processorSpeed;
		return isEqual;

	}

}
