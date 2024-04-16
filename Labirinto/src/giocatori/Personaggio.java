package giocatori;

import risultati.Statistiche;
import utility.Equip;

public abstract class Personaggio {
	protected String nome;
	protected Statistiche statistiche;
	protected Equip equipaggiamento;
	
	public Personaggio(String nome, Statistiche statistiche, Equip equipaggiamento) {
		super();
		this.nome = nome;
		this.statistiche = statistiche;
		this.equipaggiamento = equipaggiamento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Statistiche getStatistiche() {
		return statistiche;
	}
	public void setStatistiche(Statistiche statistiche) {
		this.statistiche = statistiche;
	}
	public Equip getEquipaggiamento() {
		return equipaggiamento;
	}
	public void setEquipaggiamento(Equip equipaggiamento) {
		this.equipaggiamento = equipaggiamento;
	}

	public int usaArma(int indiceArma) {
		return equipaggiamento.getArmi().get(indiceArma).getDanno();		
	}
	
	public int usaDifesa(int indiceDifesa) {
		return equipaggiamento.getDifese().get(indiceDifesa).getResistenza();
		
	}
	
	
}
