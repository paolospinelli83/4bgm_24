package struttura;

import java.util.ArrayList;

import giocatori.Mostro;

public class Stanza {
	
	protected ArrayList<Stanza> porte;
	protected int numero;
	protected Mostro avversario;
	
	public Stanza(ArrayList<Stanza> porte, int numero, Mostro avversario) {
		super();
		this.porte = porte;
		this.numero = numero;
		this.avversario = avversario;
	}

	public ArrayList<Stanza> getPorte() {
		return porte;
	}

	public void setPorte(ArrayList<Stanza> porte) {
		this.porte = porte;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Mostro getAvversario() {
		return avversario;
	}

	public void setAvversario(Mostro avversario) {
		this.avversario = avversario;
	}
	
	
	

}
