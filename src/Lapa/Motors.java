package Lapa;

public class Motors {
	String veids;
	int jauda;
	double paterins;

	public Motors(String veids, int jauda, double paterins) {
		this.veids = veids;
		this.jauda = jauda;
		this.paterins = paterins;
	}

	public String toString() {
		return veids + ", " + jauda + "ZS, " + paterins +"L uz 100km";
	}
}

