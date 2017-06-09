package modelo;

public class Elevador {
	private int totalAndares;
	private int capacidadePessoas;
	private int andarAtual;
	private int qtdePessoas;
	
	public void subir(){
		if (andarAtual<totalAndares){
			andarAtual++;
		}
	}
	public void descer(){
		andarAtual--;
	}
	
	public void entrar(){
		qtdePessoas++;
		//qtdePessoas = qtdePessoas +1;
	}
	public void entrar(int x){
		qtdePessoas+=x;
	}
	
	public void sair(){
		if (qtdePessoas>0){
			qtdePessoas--;
		}
	}
	
	public void inicializar(int t, int c){
		totalAndares=t;
		capacidadePessoas=c;
	}

	public Elevador() {
		super();
	}
	public Elevador(int totalAndares, int capacidadePessoas, int andarAtual, int qtdePessoas) {
		super();
		this.totalAndares = totalAndares;
		this.capacidadePessoas = capacidadePessoas;
		this.andarAtual = andarAtual;
		this.qtdePessoas = qtdePessoas;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}
	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getQtdePessoas() {
		return qtdePessoas;
	}
	public void setQtdePessoas(int qtdePessoas) {
		this.qtdePessoas = qtdePessoas;
	}

}
