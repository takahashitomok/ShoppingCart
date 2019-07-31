public class Order {

	private int itemId;
	private int num;
	//private BigDecimal purchasePrice;

	public Order(int itemId) {
		this(itemId, 1);
	}

	public Order(int itemId, int num) {
		this.itemId = itemId;
		this.num = num;
	}

	public void increase(int num) {
		this.num += num;
	}
/*
	public boolean countain(Item item) {
		return this.itemId.equals(item);

	}
*/
	public int itemId() {
		return itemId;
	}

	public int num() {
		return num;
	}
/*
	public BigDecimal purchasePrice() {
		return this.purchasePrice;
	}

	@Override
	public boolean equals(Object obj) {
		Order order =  (Order)obj;
		return this.orderItem().getProductCd().equals(order.orderItem().getProductCd());

	}

	@Override
	public int hashCode() {
		return this.orderItem().getProductCd().hashoCode();
	}
	*/
}
