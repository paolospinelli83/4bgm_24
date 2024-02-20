package struttura;

import java.util.ArrayList;

public class Labirinto {
	
	private Stanza ingresso;
	private Stanza uscita;
	private int numeroStanze;
	
	
	public Labirinto(int numeroStanze) {

		Stanza stanza5=new Stanza(null,5,null);
		
		ArrayList<Stanza> porte4 = new ArrayList<Stanza>();
		porte4.add(stanza5);
		Stanza stanza4=new Stanza(porte4,4,null);
		
		ArrayList<Stanza> porte3 = new ArrayList<Stanza>();
		porte3.add(stanza4);
		Stanza stanza3=new Stanza(porte3,3,null);
		
		ArrayList<Stanza> porte2 = new ArrayList<Stanza>();
		porte2.add(stanza3);
		Stanza stanza2=new Stanza(porte2,2,null);
		
		ArrayList<Stanza> porte1 = new ArrayList<Stanza>();
		porte1.add(stanza2);
		Stanza stanza1=new Stanza(porte1,1,null);
		
		this.ingresso=stanza1;
		this.uscita=stanza5;		
		this.numeroStanze = numeroStanze;
	}


	public Stanza getIngresso() {
		return ingresso;
	}


	public void setIngresso(Stanza ingresso) {
		this.ingresso = ingresso;
	}


	public Stanza getUscita() {
		return uscita;
	}


	public void setUscita(Stanza uscita) {
		this.uscita = uscita;
	}


	public int getNumeroStanze() {
		return numeroStanze;
	}


	public void setNumeroStanze(int numeroStanze) {
		this.numeroStanze = numeroStanze;
	}
	
	
	
	
	

}
