package modelos;
public class Endereco {
	private String logradouro;
	private String numero;
	private String cep;
	
	
	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String numero, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
	}

	public void setAll(String l, String n, String c) {
		logradouro = l;
		numero=n;
		cep=c;
	}

	public String getAll() {
		return logradouro + "\n" + 
				numero + "\n" + 
				cep;
	}

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
