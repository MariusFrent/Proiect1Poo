public class LivrareMobila {
	private String numeDestinatar, prenumeDestinatar, tipMobila, adresa;
	private int pretMobila,nrClient;
	
	public LivrareMobila (String numeDestinatar, String prenumeDestinatar, int nrClient, String tipMobila, String adresa, int pretMobila) {
		this.numeDestinatar=numeDestinatar;
		this.prenumeDestinatar=prenumeDestinatar;
		this.nrClient=nrClient;
		this.tipMobila=tipMobila;
		this.adresa=adresa;
		this.pretMobila=pretMobila;
	}

	public LivrareMobila (LivrareMobila lm) {
		numeDestinatar=lm.numeDestinatar;
		prenumeDestinatar=lm.prenumeDestinatar;
		nrClient=lm.nrClient;
		tipMobila=lm.tipMobila;
		adresa=lm.adresa;
		pretMobila=lm.pretMobila;
	}

	public int getNrClient() {
		return nrClient;
	}

	public int getPretMobila() {
		return pretMobila;
	}

	public void setNrClient(int nrClient) {
		this.nrClient=nrClient;
	}
	
	public void setPretMobila(int pretMobila) {
		this.pretMobila=pretMobila;
	}
	
	public String toString() {
		return "Datele clientului " + nrClient + 
				"\nNume :" + numeDestinatar +
				"\nPrenume: " + prenumeDestinatar +
				"\nMobila cumparata: " + tipMobila +
				"\nAdresa: " + adresa +
				"\nPretul comandei: " + pretMobila;

	}
}