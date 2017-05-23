package principal;
import javax.swing.JOptionPane;

import modelos.Aluno;
import modelos.Endereco;
import modelos.Telefone;

public class Principal {

	public static void main(String[] args) {
		Aluno objAluno = new Aluno();
		objAluno.setNome
			(JOptionPane.showInputDialog
			("Digite o nome"));
		objAluno.setCpf("123456789");
		objAluno.setRm
			(Integer.parseInt(JOptionPane.showInputDialog
			("Digite o RM")));
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		objAluno.setFone(objTelefone);
		objAluno.setEndereco(objEndereco);
		System.out.println(objAluno.getAll());
		
		Aluno a = new Aluno();
		Endereco e = new Endereco();
		e.setAll("Rua X", "11", "12345000");
		Telefone f = new Telefone();
		f.setAll(11, "123456", "Morta");
		a.setAll("ANA", "000", 77000, e, f);
		System.out.println(a.getAll());
		
	}

}
