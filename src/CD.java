
public class CD {
	
	private int cdNummer;
	private String artist;
	private String tittel;
	private int lanseringsaar;
	private Sjanger sjanger;
	private String plateselskap;
	
	
	public CD(){
		cdNummer = 0;
		artist = "";
		tittel = "";
		lanseringsaar = 0;
		sjanger = null;
		plateselskap = "";
	}
	
	@Override
	public String toString(){
		String s = "";
		
		s = s.concat(cdNummer + Fil.K);
		s = s.concat(tittel + Fil.K);
		s = s.concat(artist + Fil.K);
		s = s.concat(lanseringsaar + Fil.K);
		s = s.concat(sjanger + Fil.K);
		s = s.concat(plateselskap + Fil.K);
		
		return s;
	}
	
	public int getCdNummer() {
		return cdNummer;
	}

	public void setCdNummer(int cdNummer) {
		this.cdNummer = cdNummer;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getLanseringsaar() {
		return lanseringsaar;
	}

	public void setLanseringsaar(int lanseringsaar) {
		this.lanseringsaar = lanseringsaar;
	}

	public String getPlateselskap() {
		return plateselskap;
	}

	public void setPlateselskap(String plateselskap) {
		this.plateselskap = plateselskap;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public CD(int cdNummer, String artist, String tittel, int lanseringsaar, Sjanger sjanger, String plateselskap){
		this.cdNummer=cdNummer;
		this.artist=artist;
		this.tittel=tittel;
		this.lanseringsaar=lanseringsaar;
		this.sjanger=sjanger;
		this.plateselskap=plateselskap;
	}
	
	
	 public Sjanger getSjanger() {
		 return sjanger;
		 }

	

}
