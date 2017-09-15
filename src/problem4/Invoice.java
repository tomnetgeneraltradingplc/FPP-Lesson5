package problem4;

public class Invoice implements Payable {
	private String partNumber;

	private String partDesription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber, String partDesription, int quantity, double pricePerItem) {
		super();

		this.partNumber = partNumber;
		this.partDesription = partDesription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	@Override

	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();

	}

	public String getPartNumber() {
		return partNumber;

	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;

	}

	public String getPartDesription() {
		return partDesription;

	}

	public void setPartDesription(String partDesription) {
		this.partDesription = partDesription;

	}

	public int getQuantity() {
		return quantity;

	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;

	}

	public double getPricePerItem() {
		return pricePerItem;

	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;

	}

	@Override

	public String toString() {

		return "Invoice [partNumber=" + partNumber + ", partDesription=" + partDesription + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + "]";

	}

}
