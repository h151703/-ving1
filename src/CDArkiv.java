
public class CDArkiv implements CDArkivADT {
	
	 //Instansvariable
	
	 private CD[] cdTabell;
	 private int antall;
	 
	 
	 public CDArkiv(int antall){
		 this.antall = 0;
		 cdTabell = new CD[antall];
	 }

	 
	@Override
	public CD[] hentCdTabell() {
		
		Tekstgrensesnitt tekst = new Tekstgrensesnitt();
		CD[] tabell = new CD[antall];
		
		for(int i = 0; i < cdTabell.length; i++){
			if(cdTabell[i] != null){
				tekst.visCD(cdTabell[i]);
			}
		}
		return tabell;
	}

	
	@Override
	public void leggTilCd(CD nyCd) {
			
			if(antall < cdTabell.length){
				cdTabell[antall] = nyCd;
				antall++;
			
		}	System.out.println("antall " + antall);
				System.out.println(cdTabell.length);
	}

	@Override
	public boolean slettCd(int cdNr) {
		for(int i = 0; i < cdTabell.length; i++){
			if(cdTabell[i].getCdNummer() == cdNr){
				cdTabell[i] = null;
				return true;
			}
		}
		return false;
	}

	@Override
	public CD[] sokTittel(String delstreng) {
		
		//Lager ny array
		CD[] tittelSamsvar = new CD[antall];
		int antallSamsvar = 0;
		
		for(int i = 0; i < antall; i++){
			if(cdTabell[i].getTittel().indexOf(delstreng) >= 0){
				tittelSamsvar[antallSamsvar] = cdTabell[i];
				antallSamsvar++;
				
			}
		}
		
		return tittelSamsvar;
		
		//får vekk null-objekter
//		CD[] nyTab = new CD[antallSamsvar];
//		
//		for(int i = 0; i < nyTab.length; i++){
//			nyTab[i] = tittelSamsvar[i];
//		}
//		
//	return tittelSamsvar;
//		
	}

	
	@Override
	public CD[] sokArtist(String delstreng) {
		
		CD[] artistSamsvar = new CD[antall];
		int antallSamsvar = 0;

		for(int i=0; i<antall; i++){
			if(cdTabell[i].getArtist().indexOf(delstreng) >= 0){
				artistSamsvar[antallSamsvar] = cdTabell[i];
				antallSamsvar++;
			}
		}
		
		return artistSamsvar;
		
	}
	

	
	@Override
	public int hentAntall() {
		
		int sum = 0;
		
		for(int i = 0; i < cdTabell.length; i++){
			if(cdTabell[i] != null){
				sum++;
			}
		}
		return sum;
	}

	
	@Override
	public int hentAntall(Sjanger sjanger) {
		int sum = 0;
		
		for(int i = 0; i < antall; i++){
			if(cdTabell[i].getSjanger() == sjanger){
				sum++;
			}
		}
		return sum;
	}

}
