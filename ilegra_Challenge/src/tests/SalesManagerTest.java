package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import business.managers.SalesManager;
import persistence.Reader;

public class SalesManagerTest {

	private SalesManager salesmanager;
	private String test = "003�10�[1-10-100,2-30-2.50,3-40-3.10]�Diego";
	private String test2 = "003�08�[1-1-10,2-0-1.50,3-0-0.10]�Renato";
	private String test3 = "002�2345675433444345�Eduardo Pereira�Rural";

	@Before
	public void setup() {
		salesmanager = new SalesManager();
	}

	@Test
	public void testIfCustomerWasAddedToList() {
		Reader.getArcFormated().add(test);
		Reader.getArcFormated().add(test2);
		salesmanager.getSalesFromList();
		assertEquals(2, salesmanager.amoutOfSales());
	}

	@Test
	public void testIfCanGetTheList() {
		assertNotNull(salesmanager.getSales());
	}

	@Test
	public void testIfAddTheCorrectlyString() {
		Reader.getArcFormated().add(test3);
		salesmanager.getSalesFromList();
		assertEquals(2, salesmanager.amoutOfSales());
	}

	@Test
	public void testTheWorstSalesManEver() {
		salesmanager.getSalesFromList();
		assertEquals("Renato", salesmanager.getWorstSalesmanEver());
	}

	@Test
	public void testTheIdOfTheMostExpensiveSale() {
		salesmanager.getSalesFromList();
		assertEquals("10", salesmanager.getIdOfTheMostExpensiveSale());
	}

}
