package funcionario;

public class Funcionario {
	private String nome;
	private double valorHora;
	private String cargo;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, double valorHora, String cargo) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getAll(){
		return "Nome:" + nome +"\nValor Hora:" + valorHora + "\nCargo:" + cargo;
	}
	public double calSalBru(int qtdHoras){
		return valorHora * qtdHoras;
	}
	public double calIR(int qtdHoras, double porc){
		return (valorHora * qtdHoras)*(porc/100);
	}
}
