package principal;

import modelos.Aluno;
import modelos.Endereco;
import modelos.Telefone;

public class PrincipalMedio {

	public static void main(String[] args) {
		Telefone t = new Telefone(
				11, 
				"1234-1324", 
				"TOM"
				);
		Endereco e = new Endereco(
				"Av. Lins ", 
				"1222", 
				"12345-000"
				);
		Aluno a = new Aluno(
				"ABC", 
				"12345784512", 
				77777, 
				e, 
				t
				);
		System.out.println(a.getAll());

	}

}
