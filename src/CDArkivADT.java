

//ADT- uttrykket hva som skal gj�res, uavhengig av implementasjonen

public interface CDArkivADT {
	 // kommentarlinjer som her
	// Returnere en tabell av CD-er
	 CD[] hentCdTabell();
	 
	// Legger til en ny CD
	 void leggTilCd(CD nyCd);
	 
	// Sletter en CD hvis den fins
	 boolean slettCd(int cdNr);
	 
	 // S�ker og henter CD-er med en gitt delstreng
	 CD[] sokTittel(String delstreng);
	 
	 // S�ker og henter artister med en gitt delstreng
	 CD[] sokArtist(String delstreng);
	 
	 // Henter antall CD-er
	 int hentAntall();
	 
	 // Henter antall CD-er for en gitt sjanger
	 int hentAntall(Sjanger sjanger);

}
