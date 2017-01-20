import java.util.Scanner;
public class TekstMeny{
	
	CDArkivADT cda;
	Tekstgrensesnitt tekstgrensesnitt;
	private Scanner tast;
	private int valg;
	private CD nyCD;
	private String delstreng;

	public TekstMeny(CDArkivADT cda){
		this.cda=cda;
		tekstgrensesnitt = new Tekstgrensesnitt();
	}
	
	public void Start(){
		System.out.println("Hei og velkommen til CD-arkiv-oppgaven i DAT102!");
		tast = new Scanner(System.in);
		hovedmeny();
		tast.close();
	}
	
	
	public void hovedmeny() {
		// opprette ett nytt arkiv
		
		// åpne arkiv fra fil
		String meny = "\n1 - Opprette nytt arkiv" + "\n2 - Les fra eksisterende arkiv" + "\n3 - Avslutt" + "\nValg: ";
		
		do {
			System.out.print(meny);
			valg = tast.nextInt();
			switch (valg) {
			case 1:
				// opprette nytt arkiv
				oppretteNyttArkiv();
				break;
			case 2: 
				// Eksisterende arkiv
				eksisterendeArkiv();
				break;
			case 3: 
				break;
			default: 
					System.out.println("Ukjent mneyvalg");
			}
		} while (valg != 3);
		
	}
	
	public void undermeny() {
		// alle valg
		String meny = "\n1 - Hent CD-tabell" + "\n2 - Legg til CD" + "\n3 - Slett CD" + "\n4 - Søk etter CD ved tittel" + "\n5 - Søk etter CD ved artist" + "\n6 - Hent antall CD-er" + "\n7 - Hent antall innenfor sjanger" + "\nValg: ";
		do {
			System.out.print(meny);
			valg = tast.nextInt();
			
			switch (valg) {
			case 1:
				// hent CD-tabell
				cda.hentCdTabell();
				break;
			case 2: 
				// Legg til CD
				cda.leggTilCd(tekstgrensesnitt.lesCD());
				break;
			case 3: 
				//Slett CD
				System.out.print("Skriv inn CD-nummeret til den CD-en du vil slette: ");
				valg = tast.nextInt();
				cda.slettCd(valg);
				break;
			case 4:
				//Søk etter CD med tittel
				System.out.print("Søk etter tittel: ");
				delstreng = tast.nextLine();
				System.out.print(cda.sokTittel(delstreng));
				break;
			case 5:
				//Søk etter CD med artist
				System.out.print("Søk etter artist: ");
				delstreng = tast.nextLine();
				System.out.print(cda.sokArtist(delstreng));
				break;
			case 6:
				//Hent antall CD-er
				System.out.print("Hvor mange CD-er det er i arkivet: " + cda.hentAntall());
				break;
				
			case 7:
				
				System.out.print(cda.hentAntall(Sjanger.finnSjanger(valg)));
				
				break;
			default: 
					System.out.println("Ukjent menyvalg. ");
			}
		} while (valg != 7);
	}
	
	public void oppretteNyttArkiv() {
		
		undermeny();
	}
	
	public void eksisterendeArkiv() {
		undermeny();
	}

	
	
	
}
