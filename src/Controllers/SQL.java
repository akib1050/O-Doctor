/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL {
    
    static DBConnector dbc;
    static ResultSet answer;
    
    SQL() throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        dbc = new DBConnector("root","","userdb","localhost:3306");
        dbc.connect();
        System.out.println("Success");
    }
    
    SQL(String dbname) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        dbc = new DBConnector("root","",dbname,"localhost:3306");
        dbc.connect();
        System.out.println("Success");
    }
    
    
    
    static ResultSet readDB(String command) throws SQLException
    {
        Statement query = (Statement) dbc.dbcon.createStatement();
//        answer = query.executeQuery("select * from users");
        answer = query.executeQuery(command);
        
//        while(answer.next())
//        {
//            System.out.println(answer.getString("Username")+" " + answer.getString("Password"));
//        }
        return answer;
    }
    
    static void writeDB(String command) throws SQLException
    {
        Statement query = (Statement) dbc.dbcon.createStatement();
        query.execute(command);
    }
    
    static void Query(String command) throws SQLException
    {
        Statement query = (Statement) dbc.dbcon.createStatement();
        answer = query.executeQuery(command);
    }
    
}

class DBConnector{
    public String username, password, dbName, serverAddress;
    public Connection dbcon;

    public DBConnector(String username, String password, String dbName, String serverAddress) {
        this.username = username;
        this.password = password;
        this.dbName = dbName;
        this.serverAddress = serverAddress;
    }
    void connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        this.dbcon = (Connection) DriverManager.getConnection("jdbc:mysql://"+this.serverAddress+"/"+this.dbName, username, password);
    }
    
    
}
