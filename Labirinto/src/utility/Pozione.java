package utility;

public class Pozione {
	
	protected String nome;
	protected String tipo;
	protected int bonus;
	
	
	
	
	public Pozione(String nome, String tipo, int bonus) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.bonus = bonus;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

}
