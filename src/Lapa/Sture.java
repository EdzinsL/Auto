package Lapa;

public class Sture {
	boolean pastiprinata;
	int izmers;
	String krasa;
	public Sture(boolean pastiprinata, int izmers, String krasa) {
		this.pastiprinata = pastiprinata;
		this.izmers = izmers;
		this.krasa = krasa;
	}

	public String toString() {
		return pastiprinata ? "Ar pastiprinātāju" : "Bez pastiprinātāja" + izmers + "cm, "+ krasa;
	}
}
