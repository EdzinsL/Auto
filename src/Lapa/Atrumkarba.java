package Lapa;

public class Atrumkarba {
	String veids;
	int parnesumi;
	

	public Atrumkarba(String veids, int parnesumi) {
		this.veids = veids;
		this.parnesumi = parnesumi;
	}

	public String toString() {
		return veids + ", " + parnesumi + " pārnesumi";
	}
}
