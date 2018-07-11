package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import business.managers.SalesmanManager;
import persistence.Reader;

public class SalesmanManagerTest {

	private SalesmanManager salesmanmanager;
	private String test = "001�1234567891234�Diego�50000";
	private String test2 = "001�3245678865434�Renato�40000.99";
	private String test3 = "002�2345675433444345�Eduardo Pereira�Rural";

	@Before
	public void setup() {
		salesmanmanager = new SalesmanManager();
	}

	@Test
	public void testIfCustomerWasAddedToList() {
		Reader.getArcFormated().add(test);
		Reader.getArcFormated().add(test2);
		salesmanmanager.getSalesmansOnTheList();
		assertEquals(2, salesmanmanager.amountOfSalesman());
	}

	@Test
	public void testIfCanGetTheList() {
		assertNotNull(salesmanmanager.getSalesmans());
	}

	@Test
	public void testIfAddTheCorrectlyString() {
		Reader.getArcFormated().add(test3);
		salesmanmanager.getSalesmansOnTheList();
		assertEquals(2, salesmanmanager.amountOfSalesman());
	}
}
