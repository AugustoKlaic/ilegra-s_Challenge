package business;

public class Sale {
	private String saleid;
	private double saleprice;
	private String salesman;

	public Sale(String saleid, double saleprice, String saleman) {
		this.saleid = saleid;
		this.saleprice = saleprice;
		this.salesman = saleman;
	}

	public double getSalePrice() {
		return saleprice;
	}

	public String getSalesman() {
		return salesman;
	}

	public String getSaleId() {
		return saleid;
	}

}