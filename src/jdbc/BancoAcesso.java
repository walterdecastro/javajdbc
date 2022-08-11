package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class BancoAcesso {
	public static void main(String[] args) throws Exception {
		
		String sql = "select codigo, nome, sexo from PESSOA";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try (Connection conn = DriverManager.getConnection(url, "curso", "curso1234");
		PreparedStatement stm = conn.prepareStatement(sql);
		ResultSet rs = stm.executeQuery()) {
			
			while(rs.next()) {
				System.out.println(rs.getString("nome"));
			}
		}
		

	}

}
