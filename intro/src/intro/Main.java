package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		String internetSubeButonu = "Internet Subesi";
		double dolarDun = 8.18;
		double dolarBugun = 8.80;
		int vade = 36;
		boolean dustumu = false;
		
		
		
		
		
		System.out.println(internetSubeButonu);
		
		
		if (dolarBugun < dolarDun) {
			System.out.println("Kucuk");			
		}else if (dolarBugun == dolarDun) {
			System.out.println("Esit");
		}else {
			System.out.println("Buyuk");
		}
		
		String [] krediler = {
				"Hizli Kredi",
				"Ogrenci Kredi",
				"Ogretmen Kredi",
				"Polis Kredi",
				"Emekli Kredi",
				"Evlilik Kredi"
		};
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for (int i=0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
	}

}
