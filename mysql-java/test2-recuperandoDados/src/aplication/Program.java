package aplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
    
    public static void main(String[] args) {
        
        Connection conection = null; //conectar ao banco
        Statement statement = null;  //preparar uma consulta sql
        ResultSet resultSet = null; //resultado da consulta vai ser guardado aqui

        try {
            conection = DB.getConnection();

            statement = conection.createStatement(); //a partir de um conexão vc criar um statement para possibilitar a montagem de um comando sql

            resultSet = statement.executeQuery("select * from department"); //criado o statement e aplicado um comando vc guarda esse retorno do db em um ResultSet -> tem forma de tabela

            while(resultSet.next()) {  //resulSet inicia na posição 0 -> sem dados. e retorna false quando não há next
                System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
