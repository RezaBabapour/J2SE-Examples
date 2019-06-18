package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdate {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:42333/?user=root&password=root");
        Statement statement = con.createStatement();
        statement.executeUpdate("INSERT INTO `beYad`.`person` (`userName`) VALUES ('ali')");
        statement.executeUpdate("INSERT INTO `beYad`.`person` (`userName`) VALUES ('ali')");
        int i1 = statement.executeUpdate("DELETE FROM beYad.person WHERE userName='ali'");
        System.out.println(i1);
        statement.close();
        con.close();

    }
}