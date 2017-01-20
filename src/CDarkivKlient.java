
public class CDarkivKlient {

	public static void main(String[] args) {
		
		CDArkivADT cda = new CDArkiv(20);  //skl konvertere automatisk fra obj-ref til interfce-ref 
		
		TekstMeny meny = new TekstMeny(cda);
		meny.Start();
		
		
		

	}

}
