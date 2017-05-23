package modelos;

public class Aluno {
	private String nome;
	private String cpf;
	private int rm;
	private Endereco endereco;
	private Telefone fone;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String cpf, int rm, Endereco endereco, Telefone fone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rm = rm;
		this.endereco = endereco;
		this.fone = fone;
	}



	public Telefone getFone() {
		return fone;
	}

	public void setFone(Telefone fone) {
		this.fone = fone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setAll
		(String n, String c, int r, 
		Endereco e, Telefone f){
		nome=n;
		cpf=c;
		rm=r;
		endereco=e;
		fone=f;
	}

	public String getAll(){
		return nome + "\n"+ cpf 
				+ "\n"+ rm + "\n" + 
				endereco.getAll() + "\n" +
				fone.getAll();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}


}
