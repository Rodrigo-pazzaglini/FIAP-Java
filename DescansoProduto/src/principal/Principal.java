package principal;

import javax.swing.JOptionPane;

import modelo.Fornecedor;
import modelo.Produto;
import modelo.Telefone;

public class Principal {
	static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	static double flt(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	static int inteiro(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	public static void main(String[] args) {
		Produto prod = new Produto(
				inteiro("Digite o Código"),
				flt("Digite o Valor"), 
				texto("Digite a Descrição"),
				new Fornecedor(
						texto("Digite a Razão Social"),
						texto("Digite o CNPJ"),
						new Telefone(
								texto("Digite o número"),
								inteiro("Digite o DDD"),
								inteiro("Digite o Ramal")
								)
						)
				);
		System.out.println("Codigo:" + prod.getCodigo());
		System.out.println("Descrição:" + prod.getDescricao());
		System.out.println("Valor:" + prod.getValor());
		System.out.println(prod.atualizar(inteiro("Digite a porcentagem")));
	}

}
