package utility;

public class Difesa {
	
	protected String nome;
	protected String tipo;
	protected int resistenza;
	
	
	
	public Difesa(String nome, String tipo, int resistenza) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.resistenza = resistenza;
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
	public int getResistenza() {
		return resistenza;
	}
	public void setResistenza(int resistenza) {
		this.resistenza = resistenza;
	}

	
	
	
}
