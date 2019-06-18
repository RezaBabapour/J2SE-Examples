package DB;

import java.sql.*;

public class ExecuteQuery {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:42333/?user=root&password=root");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM beYad.person");
        while(result.next()) {
            System.out.println(result.getString("username"));
        }
        statement.close();
        connection.close();

    }
}
