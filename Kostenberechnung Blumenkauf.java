import java.util.Scanner;

/**
 * Dateiname: Kostenberechnung Blumenkauf.java 
 * Beschreibung: Berechnet die Kosten für Blumen.
 *
 * @author Nacer5
 * @version 1.0, 04/2021
 */
public class KostenBlumenkauf {

    /**
     * Ein Programm zur Berechnung von Kosten für Blumen. Es gibt 3 Arten von Blumen, hier soll der User eine Anzahl angeben. 
	 * Die Anzahl wird mit dem Preis addiert und der Einzelpreis pro Blumen sowie der Gesamtpreis für alle Blumen ausgegeben.
     */
    public static void main(String[] args) {
		
		
		Scanner tastatur;
		tastatur = new Scanner(System.in, "UTF-8");
		tastatur.useDelimiter(System.lineSeparator());
		
		/** 
		* Vorgegebene Preise für die einzelnen Blumensorten
		*/
		double preis_rosen = 2.49;
		double preis_tulpen = 1.66;
		double preis_nelken = 0.99;
		
		System.out.println("Wieviele Rosen moechten Sie? Bitte geben Sie eine Anzahl ein.");
		int anzahl_rosen = tastatur.nextInt();
		
		System.out.println("Wieviele Tulpen moechten Sie? Bitte geben Sie eine Anzahl ein.");
		int anzahl_tulpen = tastatur.nextInt();
		
		System.out.println("Wieviele Nelken moechten Sie? Bitte geben Sie eine Anzahl ein.");
		int anzahl_nelken = tastatur.nextInt();
		
		/**
		* Berechnung der Kosten pro Sorte.
		*/
		double kosten_rosen = anzahl_rosen * preis_rosen;
		double kosten_tulpen = anzahl_tulpen * preis_tulpen;
		double kosten_nelken = anzahl_nelken * preis_nelken;
		
		/**
		*Berechnung des Gesamtpreises und Umwandlung in einen Betrag mit zwei Nachkommastellen.
		*/
		double gesamtpreis = kosten_rosen + kosten_tulpen + kosten_nelken;
		gesamtpreis = gesamtpreis*100;
		gesamtpreis = (int) gesamtpreis;
		gesamtpreis = gesamtpreis / 100;
		
		System.out.println("Der Preis fuer die Rosen betraegt " + kosten_rosen);
		System.out.println("Der Preis fuer die Tulpen betraegt " + kosten_tulpen);
		System.out.println("Der Preis fuer die Nelken betraegt " + kosten_nelken);
		
		System.out.println("Der Gesamtpreis fuer die Blumen betraegt " + gesamtpreis);
       
    } // Ende main-Methode.

} // Ende KostenBlumenkauf.