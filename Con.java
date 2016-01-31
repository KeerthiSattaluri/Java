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
    }
}
