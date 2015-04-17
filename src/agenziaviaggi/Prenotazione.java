package agenziaviaggi;

public class Prenotazione {
	
	private String codice;
	private int postiRichiesti;
	private Cliente cliente;
	private Filiale filiale;
	private Pacchetto pacchetto;
	
	public Prenotazione(String codice, int postiRichiesti, Cliente cliente,
			Filiale filiale, Pacchetto pacchetto) {
		this.codice = codice;
		this.postiRichiesti = postiRichiesti;
		this.cliente = cliente;
		this.filiale = filiale;
		this.pacchetto = pacchetto;
	}
	
	public void setPacchetto(Pacchetto pacchetto) {
		this.pacchetto = pacchetto;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public int getPostiRichiesti() {
		return postiRichiesti;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Filiale getFiliale() {
		return filiale;
	}
	
	@Override
	public String toString() {
		return "Prenotazione [codice=" + codice + ", postiRichiesti="
				+ postiRichiesti + ", cliente=" + cliente + ", filiale="
				+ filiale + ", pacchetto=" + pacchetto + "]";
	}
	
	

	

}
