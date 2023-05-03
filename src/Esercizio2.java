
public class Esercizio2 {

	public static void main(String[] args) {
		SimCard simCard = new SimCard(321456789);
		simCard.credit = 12.5;
//		simCard.calls = [];
		System.out.println("############################################\n");
		simCard.printSimCard();
	}
}
