package agenziaviaggi;
import java.util.*;

public class Pacchetto {
	
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector<Prenotazione> Prenotazioni;
	
	public Pacchetto(String codice, String descrizione, int postiTotali) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.postiTotali = postiTotali;
		this.Prenotazioni = new Vector <Prenotazione>();
	}
	
	public String getDescrizione(){
		return descrizione;
	}
	
	public String getCodice(){
		return codice;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public int getPostiDisponibili() {
		int posti= this.Prenotazioni.size();
		for(int i=0; i<this.Prenotazioni.size(); i++){
			posti=posti-this.Prenotazioni.get(i).getPostiRichiesti();
		}
		return posti;

	}

	public Vector<Prenotazione> getPrenotazioni() {
		return Prenotazioni;
	}
	
	public void addPrenotazione(Prenotazione p){
		
		if(getPostiDisponibili() <= p.getPostiRichiesti()){
			throw new IllegalArgumentException("Posti finiti");
		}
		else{
			Prenotazioni.addElement(p);
		}
		
	}

}
