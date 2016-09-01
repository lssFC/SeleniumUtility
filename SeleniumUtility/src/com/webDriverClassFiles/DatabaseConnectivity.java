package webDriverClassFiles;

import java.sql.*;

public class DatabaseConnectivity {

	public static void main(String[] args) throws SQLException {

		String dbURL = "jdbc:mysql://localhost:3306/compucrack";
		String username = "root";
		String password = "";
		String dr = "com.mysql.jdbc.Driver";
		Connection connect = null;
		
		try{
			
			Class.forName(dr).newInstance();// dr will be registered
			
			connect = DriverManager.getConnection(dbURL,username,password);// Database connection will nbe estabished
			
			System.out.println("***********Statement************");
			
			Statement st = connect.createStatement();
			String query = "select * from countries";
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				
				System.out.println(rs.getString(1)+"   "+rs.getString("countries_name"));
			}
			
			System.out.println("***********Prepared Statement************");

			
			PreparedStatement pst = connect.prepareStatement("select * from countries where countries_id=? or countries_name=?");
			pst.setString(1, "15");
			pst.setString(2, "India");
			rs = pst.executeQuery();
			
			while(rs.next()){
				
				System.out.println(rs.getString(1)+"   "+rs.getString("countries_name"));
			}
			
		}catch(Throwable t){
			
			System.out.println(t.getMessage());
		}finally{
			
			connect.close();
		}
		
	}

}
