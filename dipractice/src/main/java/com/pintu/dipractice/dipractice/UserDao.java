package com.pintu.dipractice.dipractice;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;  
	  
	/*public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public JdbcTemplate getJdbcTemplate() {  
	    return jdbcTemplate;  
	}  */
	
	public  void printDatabasevalues(){  
		try{  
			/*Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/pintu","root","cvbnm");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from users");  
			while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  */
			//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			//DataSource dataSource = (DataSource) context.getBean("dataSource");
			//JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
			String sql = "select * from users";
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			for (Map row : rows) {
				System.out.print("User Name : " + row.get("username")+" ## ");
				System.out.print("Password :" + row.get("password")+" ## ");
				System.out.print("First Name : " + row.get("firstname")+" ## ");
				System.out.print("Last Name : " + row.get("lastname")+" ## ");
				System.out.print("Email : " + row.get("email")+" ## ");
				System.out.print("Address : " + row.get("address")+" ## ");
				System.out.println();
			}
			
		}catch(Exception e){ System.out.println(e);}  
	}  
		
}
