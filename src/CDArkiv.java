
public class CDArkiv implements CDArkivADT {
	
	 //Instansvariable
	
	 private CD[] cdTabell;
	 private int antall;
	 
	 
	 public CDArkiv(int antall){
		 this.antall=antall;
		 cdTabell = new CD[antall];
	 }

	 
	@Override
	public CD[] hentCdTabell() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void leggTilCd(CD nyCd) {
		
		for(int i = 0; i < cdTabell.length; i++){
			if(cdTabell[i] == null){
				cdTabell[i] = nyCd;
			}
		}
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
			if(cdTabell[i].getTittel().contains(delstreng)){
				tittelSamsvar[antallSamsvar] = cdTabell[i];
				antallSamsvar++;
			}
		}
		
		CD[] nyTab = new CD[antallSamsvar];
		
		for(int i = 0; i < nyTab.length; i++){
			nyTab[i]= tittelSamsvar[i];
		}
	return nyTab;
	}

	
	@Override
	public CD[] sokArtist(String delstreng) {
		
		CD[] artistSamsvar = new CD[antall];
		int antallSamsvar = 0;
		
		
		
		for(int i=0; i<antall; i++){
			if(cdTabell[i].getArtist().contains(delstreng)){
				artistSamsvar[antallSamsvar] = cdTabell[i];
				antallSamsvar++;
			}
		}
		
		CD[] nyTab = new CD[antallSamsvar];
		for(int i = 0; i < artistSamsvar.length; i++){
			nyTab[i] = artistSamsvar[i];
		}
		return nyTab;
	}

	
	@Override
	public int hentAntall() {
		return antall;
	}

	
	@Override
	public int hentAntallSjanger(Sjanger sjanger) {
		int sum = 0;
		
		for(int i = 0; i < antall; i++){
			if(cdTabell[i].getSjanger() == sjanger){
				sum++;
			}
		}
		return sum;
	}

}
