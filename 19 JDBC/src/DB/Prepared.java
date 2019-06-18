package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prepared {
    private Connection con;
    private PreparedStatement statement;
    public Prepared() throws Exception
    {
        con = DriverManager.getConnection("jdbc:mysql://localhost:42333/?user=root&password=root");

    }

    public void insert(String name) throws Exception
    {
        statement = con.prepareStatement("INSERT INTO beYad.person (userName) VALUES (?)");
        statement.setString(1,name);
        statement.executeUpdate();
    }

    public void print() throws Exception
    {
        statement = con.prepareStatement("SELECT * FROM beYad.person");
        ResultSet result = statement.executeQuery();
        while (result.next())
        {
            System.out.println(result.getString("userName"));
        }
    }

    public void close() throws Exception
    {
        statement.close();
        con.close();
    }

    public static void main(String[] args)throws Exception {
        Prepared obj = new Prepared();
        obj.insert("ef");
        obj.print();
        obj.close();

    }
}
