
public enum Sjanger {
	
	ROCK(0), POP(1), OPERA(2), CLASSIC(3);
	private int nr;
	
	//konstruktÝr
	private Sjanger(int n) {
		nr = n;
	}
	
	 public int getNr() { 
	       return nr;
    }
	
	public static Sjanger finnSjanger(int n){
		Sjanger sjang = null;
		
		for(Sjanger sj : Sjanger.values()){
			if(sj.nr == n){
				sjang = sj;
				break;
			}
		}
		return sjang;
	}
	
	public static Sjanger finnSjanger(String navn){
		Sjanger sjang = null;
		
		for(Sjanger sj : Sjanger.values()){
			if(sj.toString().equals(navn.toUpperCase())){
				sjang = sj;
				break;
			}
		}
		return sjang;
		
	}

}
