
public class SimCard {
	int phoneNumber;
	double credit;
	Call[] calls = new Call[5];

	public SimCard(int phoneNum) {
		this.phoneNumber = phoneNum;
		this.credit = 0;
//		this.calls = new Call[] {};
		this.calls = null;

	}

	void printSimCard() {
		if (this.calls == null) {
			System.out.println("Ecco i dati di questa SimCard: \n\n" + "Numero Telefonico: " + this.phoneNumber
					+ "\nCredito: " + this.credit + " €" + "\nLista ultime chiamate: non ci sono chiamate recenti");
		} else {
			System.out.println("Ecco i dati di questa SimCard: \n\n" + "Numero Telefonico: " + this.phoneNumber
					+ "\nCredito: " + this.credit + " €" + "\nLista ultime chiamate: " + this.calls);
		}
	}
}
