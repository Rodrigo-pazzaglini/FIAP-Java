package teste;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		String estado= new String();
		estado=JOptionPane.showInputDialog("UF").toUpperCase();
		if (estado.equals("SP")){
				System.out.println("São Paulo");
		}
		if(estado.length()==2){
			System.out.println("Estado é válido");
		}
		//  equals() -> permite comparar duas String´s
		// diferenciando letras maiusculas de minusculas
		// toUpperCase() -> converte toda String para caixa
		// alta (maiusculas), toLowerCase() faz o inverso.
		// length() => retorna qtde de caracteres dentro
		// de uma String
		
		char genero = JOptionPane.showInputDialog
				("Digite M ou F").toUpperCase().charAt(0);
		if (genero=='M'){
			System.out.println("Masculino");
		}else if(genero=='F'){
			System.out.println("Feminino");
		}else{
			System.out.println("Outro");
		}
		
		String email="xpto@fiap.com.br";
		if (email.indexOf("@")>0){
			System.out.println("Email válido");
			System.out.println("Usuário: " 
					+ email.substring(0,email.indexOf("@")));
			System.out.println("Servidor: " 
					+ email.substring(email.indexOf("@")+1));			
		}
		// indexOf() -> retorna a posição de um caracter e/ou
		// substring que estiver dentro da String, caso não
		// encontre o valor retornado será -1
		
		//substring() -> retorna uma parte da String através
		// de dois números inteiros, onde o primeiro representa
		// o inicio e o outro o final do intervalo desejado.
		// caso você omita o segundo valor, o Java irá 
		// interpretar o final como o último caracter.
		
		
		
	}

}
