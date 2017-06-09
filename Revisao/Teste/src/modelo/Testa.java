package modelo;

import javax.swing.JOptionPane;

import funcionario.Funcionario;

public class Testa {

	public static void main(String[] args) {
		Funcionario objeto = new Funcionario();
		objeto.setCargo(JOptionPane.showInputDialog("Digite o Cargo:"));
		objeto.setNome(JOptionPane.showInputDialog("Digite o Nome:"));
		objeto.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Hora:")));
		System.out.println(objeto.getAll() + "\nSalario bruto:" + objeto.calSalBru(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"))));
		System.out.println("IR:" + objeto.calIR(200, Integer.parseInt(JOptionPane.showInputDialog("Digite a porcentagem a ser cobrada"))));
	}

}
