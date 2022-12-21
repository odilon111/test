
public class Spieler_in {
	int playernummern;
	String vorname;
    String nachname;
    int alter;
    int transferbetrag=0;

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getTransferbetrag() {
		return transferbetrag;
	}

	public void setTransferbetrag(int transferbetrag) {
		this.transferbetrag = transferbetrag;
	}

	public String getVerein() {
		return verein;
	}

	public void setVerein(String verein) {
		this.verein = verein;
	}

	public Spieler_in(String vorname, String nachname, int alter, int transferbetrag, String verein, int playernummern) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.transferbetrag = transferbetrag;
		this.verein = verein;
		this.playernummern=playernummern=1;
	}

	private String verein=null;

	public Spieler_in() {
		
	}
// metho f�r die teste ob spieler ist tranferiebar oder nicht
	public String isTranferierbar() {
		if(transferbetrag>0) {
			return verein;	
		}
		else {
	return "vereinLos";
	}}
		public String transfert() {
			if(transferbetrag>0)
				//notwendigbeitrag f�r die autorisierung ein Transfer
			
			{
				return "neue  verein";	
			}
			else {
		return verein;
			
		}}
		
	public void spieler_inAusgeben() {
		Spieler_in spiler1 = new Spieler_in("suiss","odilon",22,25,"maldrid",1);
		System.out.println("spieler_in1:  "+ spiler1.playernummern+'\t'+ " "+spiler1.vorname +'\t'+ spiler1.nachname
				+'\t'+ spiler1.alter+ '\t'+ spiler1.verein+ '\t'+ spiler1.transferbetrag+" euro");
	}
	
	public static void main(String[]arg) {
		Spieler_in spiler1 = new Spieler_in();
		spiler1.spieler_inAusgeben();
	}
		

}
