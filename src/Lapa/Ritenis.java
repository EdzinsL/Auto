package Lapa;

public class Ritenis {
	int diametrs;
	String krasa;
	String veids;

	public Ritenis(int diametrs, String krasa, String veids) {
		this.diametrs = diametrs;
		this.krasa = krasa;
		this.veids = veids;
	}

	public String toString() {
		return veids + ", riepa, "+ diametrs + " diametrs, ar" + krasa + "krāsu";
	}
}
