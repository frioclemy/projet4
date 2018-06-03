package projet4;

import java.util.Scanner;

public class TP1 {

    /**
	 * @param args 
	 */
	public static void main(String[] args) {
		/**
		 * Methode main
		 */
		Scanner sc = new Scanner(System.in);
		int choixConversion;
		int temperature;
		double tempC;
		double tempF;
		String blabla;
		char again = 'O';
		int choixNok = 0;
		
		do {
			temperature = 0;
			blabla = "";
			tempC = 0;
			tempF = 0;
			do {
				System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
				System.out.println("-------------------------------------------------");
				System.out.println("Choisissez le mode de conversion");
				System.out.println("1 - Convertisseur Celsius >> Fahrenheit");
				System.out.println("2 - Convertisseur Fahrenheit >> Celsius");
				choixConversion = sc.nextInt();
				if (choixConversion < 1 || choixConversion > 2) 
				{
					System.out.println("Erreur de saisie : Saisir 1 ou 2\n");
				} else choixNok = 1;
			} while (choixNok == 0); 
				
			System.out.println("\nTemperature a convertir : ");
			temperature = sc.nextInt();
			
			switch (choixConversion) {
				case 1 : tempC = temperature;						 tempF = (9*tempC)/5+32;
						 blabla = tempC + " °C correspond a " + tempF + "°F";
						 break;
				case 2 : tempF = temperature;
				 		 tempC = (tempF-32)*5/9;
				 		 blabla = tempF + " °F correspond a " + tempC + "°C";
				 		 break;					
			}
			sc.nextLine();
			System.out.println(blabla);
			
			do {
				System.out.println("Souhaitez-vous convertir une autre temperature ? (O/N)");
				again = sc.nextLine().charAt(0);
				if (again != 'O' || again != 'N') {
					choixNok = 0;
				} else choixNok = 1;
				if (again == 'N') {
					choixNok = 2;
					System.out.println("Merci pour votre visite, au revoir...");
				}
			} while(choixNok == 1);
		} while (choixNok == 0);
	}
}
