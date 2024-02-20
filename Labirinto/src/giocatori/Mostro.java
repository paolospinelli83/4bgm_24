package giocatori;

import risultati.Statistiche;
import utility.Equip;

public class Mostro extends Personaggio{
	private String descrizione;
	private String colore;
	private int altezza;
		
	
	public Mostro(String nome, Statistiche statistiche, Equip equipaggiamento, String descrizione, String colore,
			int altezza) {
		super(nome, statistiche, equipaggiamento);
		this.descrizione = descrizione;
		this.colore = colore;
		this.altezza = altezza;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	
}
