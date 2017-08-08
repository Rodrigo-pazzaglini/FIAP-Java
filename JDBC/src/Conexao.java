import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
	public static void main (String[] args) throws Exception{
		Connection con = null;
		con = DriverManager.getConnection
				("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL"
						,"RM74378"
						,"161296");
		System.out.println("Abriu conexão");
		Statement estrutura = null;
		estrutura = con.createStatement();
		ResultSet resultado = null;
		resultado = estrutura.executeQuery("SELECT * FROM TB_TAP_CLIENTE");
		while(resultado.next()){
			System.out.println(resultado.getString("NM_CLIENTE"));
		}
		
		con.close();
		
	}
}
