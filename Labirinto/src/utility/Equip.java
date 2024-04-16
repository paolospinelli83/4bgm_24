package utility;

import java.util.ArrayList;

public class Equip{
	
	ArrayList<Arma> armi;
	ArrayList<Difesa> difese;
	ArrayList<Pozione> pozioni;
	
	
	
	
	public Equip(ArrayList<Arma> armi, ArrayList<Difesa> difese, ArrayList<Pozione> pozioni) {
		super();
		this.armi = armi;
		this.difese = difese;
		this.pozioni = pozioni;
	}
	public ArrayList<Arma> getArmi() {
		return armi;
	}
	public void setArmi(ArrayList<Arma> armi) {
		this.armi = armi;
	}
	public ArrayList<Difesa> getDifese() {
		return difese;
	}
	public void setDifese(ArrayList<Difesa> difese) {
		this.difese = difese;
	}
	public ArrayList<Pozione> getPozioni() {
		return pozioni;
	}
	public void setPozioni(ArrayList<Pozione> pozioni) {
		this.pozioni = pozioni;
	}
	
	
	
}
	