package business.managers;

import java.util.ArrayList;
import java.util.List;
import business.Customer;
import persistence.Reader;

public class CustomerManager {
	private List<Customer> customers = new ArrayList<Customer>();

	public void getCustomersOnTheList() {
		for (String customer : Reader.getArcFormated()) {
			if (customer.startsWith("002ç")) {
				String aux[] = customer.split("ç");
				customers.add(new Customer(aux[1], aux[2], aux[3]));
			}
		}
	}

	public int amountOfClients() {
		return customers.size();
	}

	public List<Customer> getCustomers() {
		return customers;
	}
}
