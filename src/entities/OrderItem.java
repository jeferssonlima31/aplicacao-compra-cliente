package entities;

public class OrderItem {
	
	private Double price;
	private Integer quantity;
	
	private Product product;

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.product = product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public Double Subtotal(double price) {
		return price = product.getPrice();
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return getProduct().getName() 
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", Quantity: " 
				+ quantity 
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}

}
