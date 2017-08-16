package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import conexao.ConexaoFactory;

public class ClienteDAO {
	private Connection con;
	
	public ClienteDAO()throws Exception{
		con = new ConexaoFactory().conectar();
	}
	
	public String fechar()throws Exception{
		con.close();
		return "Fechado com sucesso, partiu casa";
	}
	
	public String gravar() throws Exception{
		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement("INSERT INTO TB_DDD_CLIENTE"
				+ "(NR_CLIENTE, NM_CLIENTE, QT_ESTRELAS) VALUES"
				+ "(?,?,?)");
		estrutura.setInt(1, );
		return "Gravado com sucesso";
	}
}
