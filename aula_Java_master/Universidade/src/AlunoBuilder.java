
public class AlunoBuilder 
{
	private String nome;
	private String cpf;
	private int rm;
	
	public AlunoBuilder setNome(String nome) 
	{
		this.nome = nome;
		return this;
	}

	public AlunoBuilder setCpf(String cpf) 
	{
		this.cpf = cpf;
		return this;
	}

	public AlunoBuilder setRm(int rm) 
	{
		this.rm = rm;
		return this;
	}
	
	public Aluno Build()
	{
		return new Aluno(this.nome, this.cpf, this.rm);
	}
	
}
