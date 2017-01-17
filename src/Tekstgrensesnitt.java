import easyIO.*;


public class Tekstgrensesnitt {

	In tast = new In();
	
	
	// lese opplysningene om en CD fra tastatur
	 public CD lesCD(){
		 System.out.println("Strekkoden: ");
		 int cdNummer = tast.inInt();
		 System.out.println("Artistnavn: ");
		 String artist = tast.inLine();
		 System.out.println("Albumnavn:  ");
		 String tittel = tast.inLine();
		 System.out.println("Utgivelsesår: ");
		 int utgivelsesaar = tast.inInt();
		 System.out.println("Sjanger: ");
		 String sjanger1 = tast.inLine();
		 Sjanger sjanger = Sjanger.valueOf(sjanger1);
		 System.out.println("Plateselskap: ");
		 String plateselskap = tast.inLine();
		 
		 //Oppdretter nytt CD-objekt
		 CD nyCD = new CD(cdNummer, tittel, artist, utgivelsesaar, sjanger, plateselskap);
		 
		 return nyCD;
		 
	 }
	 
	 
	// vise en CD med alle opplysninger på skjerm (husk tekst for sjanger)
	 public void visCD(CD cd){
		 
		 System.out.println("--------------------------------------");
		 System.out.println("CD-nummer: " + cd.getCdNummer()  );
		 System.out.println("Tittel: " + cd.getTittel());
		 System.out.println("Artist: " + cd.getArtist());
		 System.out.println("Utgivelsesaar: " + cd.getCdNummer());
		 System.out.println("Sjanger: " + cd.getSjanger());
		 System.out.println("Plateselskap: " + cd.getPlateselskap());
		 System.out.println("--------------------------------------");
		 
	 }
	 
	// Skrive ut alle CD-er med en spesiell delstreng i tittelen
	 public void skrivUtCdDelstrengITittel(CDArkivADT cda, String delstreng){
		 
		 CD[] cdSamsvarer = cda.sokTittel(delstreng);
		 
		 System.out.println("CD-er med " + delstreng + "i tittelen: ");
		 	for(int i = 0; i < cdSamsvarer.length; i++){
		 		System.out.println(cdSamsvarer[i].getTittel());
				}
			}
		 
	 
	// Skriver ut alle CD-er av en artist / en gruppe
	 public void skrivUtCdArtist(CDArkivADT cda) {
		 
		
		 String artist = "";
		 
		 CD[] cdSamsvarer = cda.sokArtist(artist);
		 
		 System.out.println("CD-er av" + artist + ":" );
		 for(int i = 0; i < cdSamsvarer.length; i++){
			 System.out.println(cdSamsvarer[i].getArtist());
		 }
		 
	 }
	 
	// Skrive ut en enkel statistikk som inneholder antall CD-er totalt
	// og hvor mange det er i hver sjanger
	 public void skrivUtStatistikk(CDArkivADT cda){
		 
		 int sum = cda.hentAntall();
		 
		 System.out.println("Antall CD-er: " + sum);
		 
		 for(Sjanger s : Sjanger.values()){
			 System.out.println(s);
			 System.out.printf("%-15s", s);
		 }
		 
		 for(Sjanger s : Sjanger.values()){
			 System.out.println(cda.hentAntallSjanger(s));
			 System.out.printf("%-15s", cda.hentAntallSjanger(s));
		 }

		 System.out.println();
		 
		 
			
	 }
	//… Ev. andre metoder

}
