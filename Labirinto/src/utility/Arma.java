package utility;

public class Arma {
	
	protected String nome;
	protected int danno;
	protected String tipo;
	
	
	
	public Arma(String nome, int danno, String tipo) {
		super();
		this.nome = nome;
		this.danno = danno;
		this.tipo = tipo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDanno() {
		return danno;
	}
	public void setDanno(int danno) {
		this.danno = danno;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
