package funciona;

import javax.swing.JOptionPane;

import beans.Computador;
import beans.Funcionario;
import beans.Monitor;

public class Main {
	
	static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	static double inteiro(String msg){
		return Double.parseDouble((JOptionPane.showInputDialog(msg)));
	}

	public static void main(String[] args) {
		Computador pc = new Computador(
				texto("Digite o fornecedor"),
				inteiro("Digite o valor"),
				texto("Digite o apelido"),
				new Monitor (
						texto("Digite a marca"),
						inteiro("Digite o tamanho"),
						inteiro("Digite o valor"),
						texto("Digite o Apelido")
						),
				new Funcionario (
						texto("Digite a letra do sexo do fera"),
						inteiro("Digite o RM daquele fera")
						)
				);
		System.out.println(pc.getAll());
	}

}
