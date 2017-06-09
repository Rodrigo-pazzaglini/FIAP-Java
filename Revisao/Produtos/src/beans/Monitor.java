package beans;

public class Monitor {
	private String marca;
	private double tamanho;
	private double valor;
	private String apelido;
	
	public Monitor() {
		super();
	}

	public Monitor(String marca, double tamanho, double valor, String apelido) {
		super();
		this.marca = marca;
		this.tamanho = tamanho;
		this.valor = valor;
		this.apelido = apelido;
	}

	public void setAll(String marca, double tamanho, double valor, String apelido){
		this.marca = marca;
		this.tamanho = tamanho;
		this.valor = valor;
		this.apelido = apelido;
	}
	
	public String getAll() {
		return "\nMarca:" + marca + "\nTamanho:" + tamanho + "\nValor:" + valor + "\nApelido:" + apelido;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

}
