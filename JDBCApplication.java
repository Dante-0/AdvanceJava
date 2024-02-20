package org.example;

import java.sql.*;


public class JDBCApplication {
    public static void main(String[] args) {

    String url = "jdbc:mysql://127.0.0.1:3306/spark";
    String username = "root";
    String password = "Root@1234";

    try{
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        System.out.println("Successful connection");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from students");
        System.out.println("*******************STUDENTS DETAILS***********************");
        while (rs.next())
        {

            System.out.println("Your Id: "+rs.getInt("st_id"));
            System.out.println("Your Name: "+rs.getString("name"));
            System.out.println("Your Email: "+rs.getString("email"));
            System.out.println("Your PhoneNumber: "+rs.getString("phoneNumber"));
            System.out.println("----------------------------------------------------------");

        }

    }

    //

    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
}
