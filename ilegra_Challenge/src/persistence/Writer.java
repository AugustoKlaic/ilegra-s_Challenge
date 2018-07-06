package persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import business.managers.CustomerManager;
import business.managers.SalesManager;
import business.managers.SalesmanManager;

public class Writer {
	private CustomerManager customermanager = new CustomerManager();
	private SalesManager salesmanager = new SalesManager();
	private SalesmanManager salesmanmanager = new SalesmanManager();

	public Writer() {
		this.customermanager.getCustomersOnTheList();
		this.salesmanager.getSalesFromList();
		this.salesmanmanager.getSalesmansOnTheList();
	}

	public void createFileWithResult() {
		FileWriter arquivo;
		try {
			arquivo = new FileWriter(new File("C:\\Projects_Java\\Desafio_ilegra\\data\\out\\OutputFile.done.dat"));
			arquivo.write("Amount of clients in the input file: " + customermanager.amountOfClients() + "\r\n"
					+ "Amount of salesman in the input file: " + salesmanmanager.amountOfSalesman() + "\r\n"
					+ "Id of the most expensive sale: " + salesmanager.getIdOfTheMostExpensiveSale() + "\r\n"
					+ "Worst salesman ever: " + salesmanager.getWorstSalesmanEver());
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}