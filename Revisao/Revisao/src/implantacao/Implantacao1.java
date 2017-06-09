package implantacao;

import javax.swing.JOptionPane;

import modelo.Formacao;

public class Implantacao1 {
	
	public static void main (String [] args){
	Formacao objeto = new Formacao("asdffgdaa",1,1,1);
	//Input
	//objeto.setDescricao
	//(JOptionPane.showInputDialog("Digite a descrição"));
	
	//objeto.setAll("desc", -1, -500, 1);
	//Output
	System.out.println(objeto.getDescricao());
	System.out.println(objeto.getDescricaoReduzida());
	System.out.println(objeto.getMetodo(5));
	
	
	}

}
