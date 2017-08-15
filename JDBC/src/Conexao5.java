import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Conexao5 {
	public static void main (String[] args) throws Exception{
		Connection con = null;
		con = DriverManager.getConnection
				("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL"
						,"RM74378"
						,"161296");
		System.out.println("Abriu conexão");
		String strNome = JOptionPane.showInputDialog("Digite o nome: ");
		int  intNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement("SELECT * FROM TB_TAP_CLIENTE WHERE NR_CLIENTE = ? AND NM_CLIENTE = ?");
		estrutura.setInt(1, intNumero);
		estrutura.setString(2, strNome);
		ResultSet resultado = null;
		resultado = estrutura.executeQuery();
		if(resultado.next()){
			System.out.println("Logado com sucesso");
		}
		else {
			System.out.println("Sem autorização ");
		}
		
		con.close();
		
	}
}
