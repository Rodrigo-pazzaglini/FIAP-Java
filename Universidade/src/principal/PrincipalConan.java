package principal;

import javax.swing.JOptionPane;

import modelos.Aluno;
import modelos.Endereco;
import modelos.Telefone;

public class PrincipalConan {
	static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	static int inteiro(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static void main(String[] args) {
		Aluno a = new Aluno(
				texto("Digite o nome"), 
				texto("Digite o cpf"), 
				inteiro("RM"), 
				new Endereco(
						texto("Log"),
						texto("Número"),
						texto("CEP")
						), 
				new Telefone(
						inteiro("DDD"),
						texto("Fone"),
						texto("Operadora")
						)
				);
		System.out.println(a.getAll());

	}

}
