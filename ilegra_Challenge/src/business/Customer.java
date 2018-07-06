package business;

public class Customer {
	private String cnpj;
	private String name;
	private String businessarea;

	public Customer(String cnpj, String name, String businessarea) {
		this.cnpj = cnpj;
		this.name = name;
		this.businessarea = businessarea;
	}

	public String getName() {
		return name;
	}

	public String getBusinessArea() {
		return businessarea;
	}

	public String getCNPJ() {
		return cnpj;
	}
}