package testes;

import java.sql.Connection;

import conexao.ConexaoFactory;

public class TesteConexao {

	public static void main(String[] args) {
		Connection c = null;
		try{
			c = new ConexaoFactory().conectar();
			System.out.println("TELA NAO AZUL");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("TELA AZUL");
		}
		finally{
			try{
				c.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
