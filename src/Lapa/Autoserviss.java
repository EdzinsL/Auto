package Lapa;

import java.util.Random;

import javax.swing.JOptionPane;

public class Autoserviss {
	String marka, motors, atrumkarba, ipasnieks, krasa;
	int vecums, nobraukums, atrums, degviela;
	char tips;
	Random rand = new Random();
	
	public Autoserviss(String marka, String motors, String atrumkarba, String ipasnieks, String krasa,int razGads, int vecums, int nobraukums, int atrums, int degviela, char tips) {
		this.marka = marka;
		this.motors = motors;
		this.atrumkarba = atrumkarba;
		this.ipasnieks = ipasnieks;
		this.krasa = krasa;
		this.tips = tips;
		vecums = java.time.Year.now().getValue() - razGads;
		nobraukums = 0;
		atrums = 0;
		degviela = DegLim();
	}
	
	public int DegLim() {
		return rand.nextInt(41) + 20;
	}
	
	void spiestGazi() {
		if(degviela > 0) {
			atrums += 10;
			degviela--;
			JOptionPane.showMessageDialog(null, marka + " paātrināss līdz " + atrums + "km/h", "Paziņojums!", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Nav degvielas!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	String uzpildit(String degv) {
		if(degviela < 60) {
			JOptionPane.showMessageDialog(null, "Uzzpildīta " + degv, "Informācija", JOptionPane.INFORMATION_MESSAGE);
			degviela = 60;	
			return "Mašīna ir pilna ar degvielu!!";
		}else
			JOptionPane.showMessageDialog(null, "Twertne jau ir pilna!", "Brīdinājums!", JOptionPane.WARNING_MESSAGE);
		return degv;
	}
	
	String info() {
		if(tips == 'e')
			return marka + " ir " + vecums + "gadus vecs elektroauto ar " +krasa+" krāsu.\n"
					+ "Motors: " + motors + "\n"
					+ "Atrumkarba" + atrumkarba + "\n"
					+ "Īpašnieks" + ipasnieks + "\n"
					+ "Nobraukums" + nobraukums + "\n";
		else
			return marka + " ir " + vecums + "gadus veca automašīna ar " +krasa+" krāsu."
			+ "Motors: " + motors + "\n"
			+ "Atrumkarba" + atrumkarba + "\n"
			+ "Īpašnieks" + ipasnieks + "\n"
			+ "Nobraukums" + nobraukums + "\n";
	}
	
	void parkoties() {
		JOptionPane.showMessageDialog(null, "Nav norādīta stāvvieta!", "Brīdinājums", JOptionPane.INFORMATION_MESSAGE);
	}
	int palielinatNobraukumu() {
		if(nobraukums < 500000) {
			nobraukums += rand.nextInt(100) +1;
		}else
			JOptionPane.showMessageDialog(null, "Lapas kungs saka, ka sasniegts maksimālais nosaukums!", "Bīstami turpināt!", JOptionPane.WARNING_MESSAGE);
		return nobraukums;
	}
	
	void avarija() {
		if(rand.nextInt(6) == 0) {
			JOptionPane.showMessageDialog(null, "Notikusi avārija!", "Lapa saka ka jūs bijāt neveiksmīgs", JOptionPane.ERROR_MESSAGE);
			atrums = 0;
		}else
			JOptionPane.showMessageDialog(null, "Braucies veiksmīgs", "Veiksme", JOptionPane.ERROR_MESSAGE);
	}
}
