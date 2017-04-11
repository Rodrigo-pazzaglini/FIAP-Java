package principal;

import javax.swing.JOptionPane;

public class Principal {
	static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	static int inteiro(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	public static void main(String[] args) {
		

	}

}
