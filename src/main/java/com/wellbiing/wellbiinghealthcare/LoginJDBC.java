package com.wellbiing.wellbiinghealthcare;

import java.sql.*;

public class LoginJDBC {

    public void showRecords(){
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");
            String query="Select * from authentication";

            PreparedStatement ps=con.prepareStatement(query);

            ResultSet rs=ps.executeQuery();
            while(rs.next())
                System.out.println(rs.getInt(1)+" "
                        +rs.getString(2)+" "+rs.getString(3));
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public boolean checkPassword(String username, String candidate){
        boolean result = false;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");
            String query="Select password from authentication where username= ?";

            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs=ps.executeQuery();

            String hash = null;
            String Candidate;

            if (rs.next()) {
                hash = rs.getString(1);
            }

            Credentials c = new Credentials();
            result = c.checkHash(candidate, hash);

            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }


    }
