package beans;

public class Computador {
	private String fornecedor;
	private double valor;
	private String apelido;
	private Monitor monitor;
	private Funcionario funcionario;
	
	public Computador() {
		super();
	}

	public Computador(String fornecedor, double valor, String apelido, Monitor monitor, Funcionario funcionario) {
		super();
		this.fornecedor = fornecedor;
		this.valor = valor;
		this.apelido = apelido;
		this.monitor = monitor;
		this.funcionario = funcionario;
	}

	public String getAll() {
		return "\nFornecedor:" + fornecedor + "\nValor:" + valor + "\nApelido:" + apelido + "\nMonitor:" + monitor.getAll() + funcionario.getAll(); 
	}
	
	public void setAll(String fornecedor, double valor, String apelido, Monitor monitor, Funcionario funcionario) {
		this.fornecedor = fornecedor;
		this.valor = valor;
		this.apelido = apelido;
		this.monitor = monitor;
		this.funcionario = funcionario;
	}
	
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
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
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
