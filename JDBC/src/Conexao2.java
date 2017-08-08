import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexao2 {
	public static void main (String[] args) throws Exception{
		Connection con = null;
		con = DriverManager.getConnection
				("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL"
						,"RM74378"
						,"161296");
		System.out.println("Abriu conexão");
		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement("SELECT * FROM TB_TAP_CLIENTE");
		ResultSet resultado = null;
		resultado = estrutura.executeQuery();
		while(resultado.next()){
			System.out.println(resultado.getString("NM_CLIENTE"));
		}
		
		con.close();
		
	}
}
