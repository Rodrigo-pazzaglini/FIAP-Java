package modelo;

public class Medio extends Formacao {
	
	private String tipo;
	
	public Medio() {
		super();
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public String getAll(){
		
		return super.getAll()+"\n"+ tipo;
	}
	
	public void setAll(String d, int p, double m, int du, String t){
		super.setAll(d,p,m,du);
		setTipo(t);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
}
