package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Functional {
    public static Scanner input = new Scanner(System.in);
    private Connection connection;
    private Statement statement;

    public Functional() throws Exception
    {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:42333/?user=root&password=root");
        statement = connection.createStatement();
    }

    public void insert(String name) throws Exception
    {
        statement.executeUpdate("INSERT INTO beYad.person (userNAME) VALUES ('"+name+"')");
    }

    public void delete(String name) throws Exception
    {
        statement.executeUpdate("DELETE FROM beYad.person WHERE userName='"+name+"'");
    }

    public void print() throws Exception
    {
        ResultSet result = statement.executeQuery("SELECT * FROM beYad.person");
        while (result.next())
        {
            System.out.println(result.getString("userName"));
            System.out.println(result.getString("id"));
        }
    }

    public void close() throws Exception
    {
        statement.close();
        connection.close();
    }

    public static void main(String[] args)throws Exception {
        Functional obj = new Functional();
        String name;
        name = input.nextLine();

        obj.insert(name);
        {
            int in;
            System.out.println("1.Insert 2.Delete 3.print");
            in = input.nextInt();
            switch (in)
            {
                case 1:
                    System.out.println("Enter name for insert : ");
                    name = input.nextLine();
                    obj.insert(name);
                    break;
                case 2:
                    System.out.println("Enter name for delete : ");
                    name = input.nextLine();
                    obj.delete(name);
                    break;
                case 3:
                    obj.print();

            }
        }
    }
}
