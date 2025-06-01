/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistent;

/**
 *
 * @author dutaa
 */
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    @Override
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //Membuat koneksi, nama db, user,password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pbo?useSSL=false&serverTimezone=UTC",
            "root", 
            ""
        );
        //kerjakan Mysql Query
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
    }
}
