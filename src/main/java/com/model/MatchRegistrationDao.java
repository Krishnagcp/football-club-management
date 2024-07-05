package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MatchRegistrationDao {

    private Connection con;
    private PreparedStatement pst;

    public MatchRegistrationDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsbdb", "root", "root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    
    public void storeData(MatchRegistration registration) {
        String sql = "INSERT INTO match_registrations (name, `match`) VALUES (?, ?)";
        try {
            System.out.println("Connecting to the database...");
            pst = con.prepareStatement(sql);
            pst.setString(1, registration.getName());
            pst.setString(2, registration.getMatch());
            System.out.println("Executing update...");
            pst.executeUpdate();
            System.out.println("Data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

