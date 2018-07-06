package business.managers;

import java.util.ArrayList;
import java.util.List;
import business.Salesman;
import persistence.Reader;

public class SalesmanManager {
	private List<Salesman> salesmans = new ArrayList<Salesman>();

	public void getSalesmansOnTheList() {
		for (String salesman : Reader.getArcFormated()) {
			if (salesman.startsWith("001ç")) {
				String aux[] = salesman.split("ç");
				salesmans.add(new Salesman(aux[1], aux[2], Double.parseDouble(aux[3])));
			}

		}
	}

	public int amountOfSalesman() {
		return salesmans.size();
	}

	public List<Salesman> getSalesmans() {
		return salesmans;
	}
}