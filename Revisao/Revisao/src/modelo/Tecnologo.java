package modelo;

public class Tecnologo extends Formacao{

	private boolean planoEstendido;
	
	public Tecnologo() {
		super();
	}

	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	public String getAll(){
		
		return super.getAll()+"\n" + planoEstendido;
	}
	
	public void setAll(String d, int p, double m, int du, boolean pe){
		//this.setDescricao(d);
		super.setAll(d,p,m,du);
		setPlanoEstendido(pe);
		
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	
}
