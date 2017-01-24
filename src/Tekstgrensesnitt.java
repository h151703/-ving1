import java.util.Scanner;


public class Tekstgrensesnitt {

	Scanner tast = new Scanner(System.in);

	
	
	// lese opplysningene om en CD fra tastatur
	 public CD lesCD(){
		 
		 System.out.println("---------------------------------------------------");
		 
		 System.out.println("Strekkoden: ");
		 int cdNummer = tast.nextInt();
		 
		 System.out.println("Tittel:  ");
		 String tittel = tast.next();
		 
		 System.out.println("Artistnavn: ");
		 String artist = tast.next();
		 
		 
		 System.out.println("Utgivelses�r: ");
		 int utgivelsesaar = tast.nextInt();
		 
		 System.out.println("Sjanger: ROCK, POP, OPERA, CLASSIC");
		 Sjanger sjanger = Sjanger.valueOf(tast.next().toUpperCase());
		
		 System.out.println("Plateselskap: ");
		 String plateselskap = tast.next();
		  System.out.println("------------------------------------------------------");
		  
		  
		 //Oppdretter nytt CD-objekt
		 CD nyCD = new CD(cdNummer, tittel, artist, utgivelsesaar, sjanger, plateselskap);
		 
		 return nyCD;
		 
		
		 
	 }
	 
	 
	// vise en CD med alle opplysninger p� skjerm (husk tekst for sjanger)
	 public void visCD(CD cd){
		 
		 System.out.println("--------------------------------------");
		 System.out.println("CD-nummer: " + cd.getCdNummer());
		 System.out.println("Tittel: " + cd.getTittel());
		 System.out.println("Artist: " + cd.getArtist());
		 System.out.println("Utgivelsesaar: " + cd.getLanseringsaar());
		 System.out.println("Sjanger: " + cd.getSjanger());
		 System.out.println("Plateselskap: " + cd.getPlateselskap());
		 System.out.println("--------------------------------------");
		 
	 }
	 
	// Skrive ut alle CD-er med en spesiell delstreng i tittelen
	 public void skrivUtCdDelstrengITittel(CDArkivADT cda, String delstreng){
		 
		 CD[] cdSamsvarer = cda.sokTittel(delstreng);
		 
		 System.out.println("CD-er med " + delstreng + " i tittelen: ");
		 	for(CD cd : cdSamsvarer){
		 		visCD(cd);
				}
		 	
		 	if(cdSamsvarer.length == 0){
				System.out.println("Det finnes ingen CD med denne tittelen.");
			}
		 	
			}
		 
	// Skriver ut alle CD-er av en artist / en gruppe
	 public void skrivUtCdArtist(CDArkivADT cda, String delstreng) {
		 
		 
		 CD[] cdSamsvarer = cda.sokArtist(delstreng);
		 
		 System.out.println("CD-er av " + delstreng + ":" );
		 for(CD cd : cdSamsvarer){
			 visCD(cd);
		 }
		 
		 if(cdSamsvarer.length == 0){
				System.out.println("Det finne ingen CD med denne artisten.");
			}
		 
	 }
	 
	// Skrive ut en enkel statistikk som inneholder antall CD-er totalt
	// og hvor mange det er i hver sjanger
	 public void skrivUtStatistikk(CDArkivADT cda){
		 
		 int sum = cda.hentAntall();
		 
		 System.out.println("Antall CD-er: " + sum);

		 for(Sjanger s : Sjanger.values()){
			 System.out.printf("%-15s", s);
		 }
		 
		 System.out.println();
		 
		 for(Sjanger s : Sjanger.values()){
			 System.out.printf("%-15s", cda.hentAntall(s));
		 }

		 
		 
			
	 }
	//� Ev. andre metoder

}
