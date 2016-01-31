import java.sql.*;
import java.io.*;
class Con{
    public static void main(String[] args) throws Exception {
    	    Class.forName("org.postgresql.Driver");
    	    Connection connection=null;
    	    connection=DriverManager.getConnection("jdbc:postgresql://saktimayi:5432/u4cse13503",
	    "u4cse13503",
	    "u4cse13503");
    	    connection.close();
	    Statement stmt=connection.createStatement();
	    String query = "select name,id from student";
	    ResultSet rs=stmt.executeQuery(query);
	    while(rs.next()) {
		    String stu_name=rs.getString("student12_name");
		    int stu_id=rs.getInt("student12_id");
		    System.out.println(stu_name+"\t"+stu_id);
	    }
    }
}
