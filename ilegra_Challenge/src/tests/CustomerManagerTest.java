package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import business.managers.CustomerManager;
import persistence.Reader;

public class CustomerManagerTest {

	private CustomerManager customerManager;
	private String test = "002ç2345675434544345çJose da SilvaçRural";
	private String test2 = "002ç4785675221544366çAntonioçUrbano";
	private String test3 = "001ç3245678865434çRenatoç40000.99";

	@Before
	public void setup() {
		customerManager = new CustomerManager();
	}

	@Test
	public void testIfCustomerWasAddedToList() {
		Reader.getArcFormated().add(test);
		Reader.getArcFormated().add(test2);
		customerManager.getCustomersOnTheList();
		assertEquals(2, customerManager.amountOfClients());
	}

	@Test
	public void testIfCanGetTheList() {
		assertNotNull(customerManager.getCustomers());
	}

	@Test
	public void testIfAddTheCorrectlyString() {
		Reader.getArcFormated().add(test3);
		customerManager.getCustomersOnTheList();
		;
		assertEquals(2, customerManager.amountOfClients());
	}
}
