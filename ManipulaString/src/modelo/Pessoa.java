package modelo;

public class Pessoa {
	private String nome = new String();
	private String cpf = new String();
	private String email = new String();
	public Pessoa(String nome, String cpf, String email) {
		super();
		setNome(nome);
		setCpf(cpf);
		setEmail(email);
	}
	public Pessoa() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()>2){
			this.nome = nome.toUpperCase();
		}else{
			this.nome= "Obra do Juninho";
		}
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (cpf.length()==11){
			this.cpf = cpf;
		}else{
			this.cpf="11111111111";
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.indexOf("@")>0){
			this.email = email;
		}
	}

}
