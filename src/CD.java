
public class CD {
	
	private int cdNummer;
	private String tittel;
	private String artist;
	private int lanseringsaar;
	private Sjanger sjanger;
	private String plateselskap;
	
	
	public CD(){
		cdNummer = 0;
		tittel = "";
		artist = "";
		lanseringsaar = 0;
		sjanger = null;
		plateselskap = "";
	}
	
	public CD(int cdNummer,  String tittel, String artist, int lanseringsaar, Sjanger sjanger, String plateselskap){
		this.cdNummer=cdNummer;
		this.tittel=tittel;
		this.artist=artist;
		this.lanseringsaar=lanseringsaar;
		this.sjanger=sjanger;
		this.plateselskap=plateselskap;
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

	
	
	 public Sjanger getSjanger() {
		 return sjanger;
		 }

	

}
