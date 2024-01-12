/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Literarium;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author priscillaabigail
 */
public class databaseConnection {

    /**
     * @param args the command line arguments
     */
    // Method to establish a database connection and return a Connection object
    public static Connection mycon() {
        // Initializing a Connection object to null
        Connection con = null;
        
        try {
            // Loading the MySQL JDBC driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establishing a connection to the MySQL database named 'finalproject'
            // The URL format is "jdbc:mysql://hostname/databasename", and here localhost is used as the hostname
            // Replace "root" and "" with the actual username and password for the MySQL database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3303/Literarium_2?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");            
        } catch (Exception e) {
            // Handling any exceptions that might occur during the process
            System.out.println(e);
        }
        
        // Returning the established Connection object (can be null if an exception occurs)
        return con;
    }
    }


