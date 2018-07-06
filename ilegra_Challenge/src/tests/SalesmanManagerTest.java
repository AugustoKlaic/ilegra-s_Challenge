package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import business.managers.SalesmanManager;
import persistence.Reader;

public class SalesmanManagerTest {

	private SalesmanManager salesmanmanager;
	private String test = "001ç1234567891234çDiegoç50000";
	private String test2 = "001ç3245678865434çRenatoç40000.99";
	private String test3 = "002ç2345675433444345çEduardo PereiraçRural";

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
