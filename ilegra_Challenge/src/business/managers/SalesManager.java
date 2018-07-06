package business.managers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import business.Sale;
import persistence.Reader;

public class SalesManager {
	private List<Sale> sales = new ArrayList<Sale>();

	public void getSalesFromList() {
		for (String sale : Reader.getArcFormated()) {
			if (sale.startsWith("003ç")) {
				String aux[] = sale.split("ç");
				sales.add(new Sale(aux[1], getSalesPrice(aux[2]), aux[3]));
			}
		}
	}

	public int amoutOfSales() {
		return sales.size();
	}

	public List<Sale> getSales() {
		return sales;
	}

	public double getSalesPrice(String sale) {
		double price = 0;
		String splitincoma[] = sale.split(",");
		for (int i = 0; i < splitincoma.length; i++) {
			String splitinindent[] = splitincoma[i].split("-");
			price = price + Double.parseDouble(splitinindent[1].replace("[", ""))
					* Double.parseDouble(splitinindent[2].replace("]", ""));
		}
		return price;
	}

	public String getIdOfTheMostExpensiveSale() {
		sales.sort(Comparator.comparing(Sale::getSalePrice).reversed());
		return sales.get(0).getSaleId();
	}

	public String getWorstSalesmanEver() {
		sales.sort(Comparator.comparing(Sale::getSalePrice));
		return sales.get(0).getSalesman();
	}
}