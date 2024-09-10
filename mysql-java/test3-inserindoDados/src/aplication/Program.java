package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Statement;
import java.sql.ResultSet;


import db.DB;

public class Program {
    
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
                "INSERT INTO seller "
                + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                + "VALUES "
                + "(?, ?, ?, ?, ?)", 
                Statement.RETURN_GENERATED_KEYS); // ? placeholder
            
            preparedStatement.setString(1, "Carl Purple"); //vou trocar meu primeiro ?, placeholder (1) pelo valor "carl purple"
            preparedStatement.setString(2, "carl@gmail.com");
            preparedStatement.setDate(3, new java.sql.Date(sdf.parse("05/09/2024").getTime()));
            // cuidado para não confudir com o java.util.Date no sql vc tem que usar java.sql.Date
            //aqui o código intancia uma data no formato desejado, logo após transforma essa data em tempo
            //a partir desse tempo ele instancia uma data no sql.s
            preparedStatement.setDouble(4, 3000.0);
            preparedStatement.setInt(5, 4);

            int rowsaffected = preparedStatement.executeUpdate(); //RESULTADO DESSA OPERAÇÃO É UM NÚMERO INTEIRO INDICANDO QUANTAS LINHAS FORAM ALTERADAS

            if(rowsaffected > 0) {
                ResultSet rs = preparedStatement.getGeneratedKeys();
                while(rs.next()) {
                    int id = rs.getInt(1); //pois só vai ter uma coluna
                    System.out.println("Done! Id = " + id);
                }
            }
            else {
                System.out.println("No rown affected");
            }

            /*preparedStatement = connection.prepareStatement(
                "INSERT INTO department "
                + "(Name) "
                + "VALUES "
                + "('LUCAS'),('MELO')",
                Statement.RETURN_GENERATED_KEYS
            );


            int rowsaffected = preparedStatement.executeUpdate(); //RESULTADO DESSA OPERAÇÃO É UM NÚMERO INTEIRO INDICANDO QUANTAS LINHAS FORAM ALTERADAS

            if(rowsaffected > 0) {
                ResultSet rs = preparedStatement.getGeneratedKeys();
                while(rs.next()) {
                    int id = rs.getInt(1); //pois só vai ter uma coluna
                    System.out.println("Done! Id = " + id);
                }
            }
            else {
                System.out.println("No rown affected");
            }*/
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        catch(ParseException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection(); //SEMPRE FECHAR CONEXÃO POR ÚLTIMO.
        }
    }
}
