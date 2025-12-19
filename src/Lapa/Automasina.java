package Lapa;

public class Automasina {
	String marka;
	Motors motors;
	Ritenis ritenis;
	Atrumkarba atrumkarba;
	Sture sture;
	int atrums = 0;

	public Automasina(String marka, Motors m, Ritenis r, Atrumkarba a, Sture s) {
		this.marka = marka;
		motors = m;
		ritenis = r;
		atrumkarba = a;
		sture = s;
	}

	public void spiestGazi() {
		atrums += 10;
	}

	public String toString() {
		return "Marka: " + marka + "\nMotors: " + motors + "\nRiteņi: " + ritenis + "\nĀtrumkārba: " + atrumkarba + "\nStūre: " + sture + "\nĀtrums: " + atrums + " km/h\n";
	}
}
