package aplication;

import java.sql.Connection;

import db.DB;

public class Program {
    
    public static void main(String[] args) {
        
        Connection conection = DB.getConnection();
        DB.closeConnection();
    }
}
