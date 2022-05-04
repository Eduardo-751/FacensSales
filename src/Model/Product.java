package Model;

public class Product {
	
	private int idProduct;
	private String description;
	private double saleValue;
	private double buyValue;
	private String group;
	
	public Product(String description, double saleValue, double buyValue, String group) {
		this.description = description;
		this.saleValue = saleValue;
		this.buyValue = buyValue;
		this.group = group;
	}
	
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getSaleValue() {
		return saleValue;
	}
	public void setSaleValue(double saleValue) {
		this.saleValue = saleValue;
	}
	public double getBuyValue() {
		return buyValue;
	}
	public void setBuyValue(double buyValue) {
		this.buyValue = buyValue;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
}
