package principal;

import modelo.Elevador;

public class Teste {

	public static void main(String[] args) {
		Elevador objeto = new Elevador();
		objeto.entrar();
		objeto.sair();
		objeto.sair();
		System.out.println(objeto.getQtdePessoas());
		

	}

}
