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
				inteiro("Digite o C�digo"),
				flt("Digite o Valor"), 
				texto("Digite a Descri��o"),
				new Fornecedor(
						texto("Digite a Raz�o Social"),
						texto("Digite o CNPJ"),
						new Telefone(
								texto("Digite o n�mero"),
								inteiro("Digite o DDD"),
								inteiro("Digite o Ramal")
								)
						)
				);
		System.out.println("Codigo:" + prod.getCodigo());
		System.out.println("Descri��o:" + prod.getDescricao());
		System.out.println("Valor:" + prod.getValor());
		System.out.println(prod.atualizar(inteiro("Digite a porcentagem")));
	}

}
