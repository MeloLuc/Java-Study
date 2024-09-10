package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegratyException;

public class Program {
    
    public static void main(String[] args) {
        
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = DB.getConnection();
            ps = connection.prepareStatement(
                "DELETE FROM department "
                + "WHERE "
                + "Id = ?");

            ps.setInt(1, 5); //parameterIndex é o index do ?

            int rowsAffected = ps.executeUpdate();

            System.out.println("Done! rows affected: " + rowsAffected);
            
        }
        catch(SQLException e) {
            throw new DbIntegratyException(e.getMessage());
        }
        finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}
