package teste;

import modelo.Pessoa;

public class StringModelo {

	public static void main(String[] args) {
		Pessoa obj = new Pessoa();
		obj.setNome("x");
		System.out.println(obj.getNome());
		System.out.println(obj.getCpf());
		System.out.println(obj.getEmail());
		
	}

}
