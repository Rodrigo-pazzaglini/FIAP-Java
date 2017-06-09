package teste;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		String estado= new String();
		estado=JOptionPane.showInputDialog("UF").toUpperCase();
		if (estado.equals("SP")){
				System.out.println("S�o Paulo");
		}
		if(estado.length()==2){
			System.out.println("Estado � v�lido");
		}
		//  equals() -> permite comparar duas String�s
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
			System.out.println("Email v�lido");
			System.out.println("Usu�rio: " 
					+ email.substring(0,email.indexOf("@")));
			System.out.println("Servidor: " 
					+ email.substring(email.indexOf("@")+1));			
		}
		// indexOf() -> retorna a posi��o de um caracter e/ou
		// substring que estiver dentro da String, caso n�o
		// encontre o valor retornado ser� -1
		
		//substring() -> retorna uma parte da String atrav�s
		// de dois n�meros inteiros, onde o primeiro representa
		// o inicio e o outro o final do intervalo desejado.
		// caso voc� omita o segundo valor, o Java ir� 
		// interpretar o final como o �ltimo caracter.
		
		
		
	}

}
