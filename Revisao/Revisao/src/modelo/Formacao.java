package modelo;

public class Formacao {
	
	private String descricao;
	private int periodo;
	private double mensalidade;
	private int duracao;
	
	public void definirDuracao(){
	
		if(this instanceof Medio){
			duracao=36;
		} else if (this instanceof Tecnologo){
			duracao=24;
		} else{
			duracao=60;
		}
	
	}
	
	public double exibirMedia(double ps1, double ps2){
		return (ps1+ps2) / 2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2){
		return ((ps1+ps2)*0.8) + ((nac1+nac2)*0.2)/2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2){
		return ((ps1+ps2)*0.5+(am1+am2)*0.3 + (nac1+nac2)*0.2)/2;
	}
	
	
	public String getAll(){
		
		return descricao+"\n"+
				periodo+"\n"+
				mensalidade+"\n"+
				duracao;
	}
	
	public String getDescricaoReduzida(){
		if(descricao.indexOf(" ")> 0){
			return descricao.substring(0,descricao.indexOf(" "));
		
		//Retorna uma descrição reduzida do 0 até o " " , deixa o espaço fora da contagem.
	}else{
		return descricao;
		 }
	}
	
	public String getMetodo(int v){
		
		if(descricao.length()>=v){
			
		return descricao.substring(0, v);
		
		}else 	{
			return descricao;
			 	}
		
	}
	
	public Formacao() {
		super();
	}

	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		setDescricao (descricao);
		setPeriodo (periodo);
		setMensalidade (mensalidade);
		setDuracao (duracao);
	}

	public void setAll(String d, int p, double m, int du){
		setDescricao(d);
		setPeriodo(p);
		setDuracao(du);
		setMensalidade(m);
		
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		
		if (descricao.length()>=8 && descricao.length()<=50){
		this.descricao = descricao.toUpperCase();
		}else {
			
			this.descricao="DESCRIÇÃO VAZIA";
		}
		//else{ throw new RuntimeException();} - Derruba aplicação caso nao for dado certo.
		//toUpperCase -> Convertido para letra Maiúscula ( Caixa Alta)
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}
