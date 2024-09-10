package aplication;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {
    
    public static void main(String[] args) {
        
        Connection connection = null;
        Statement st = null;

        try {
            connection = DB.getConnection();

            connection.setAutoCommit(false); //não é pra confirmar as operações automaticamente, elas vão ficar
            //pendente de uma confirmação explicita do programador(false)

            st = connection.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 4000 WHERE DepartmentId = 1");

            /*int x = 1;
            if(x < 2) {
                throw new SQLException("FAKE ERROR");
            }*/

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit();//confirmação explicita do programador

            System.out.println("rows1 " + rows1);
            System.out.println("rows2 " + rows2);
        }
        catch(SQLException e) {
            try {
                connection.rollback();//voltar ao estado inicial do banco
                throw new DbException("transaction rolled back! caused by : " + e.getMessage());
            } catch (SQLException e1) {
                //aqui é uma situação complicado pois primeiro atualizei a salario do departmentId 1
                //porém antes de atualizar o de id 2 houve um erro. por isso  o setautocommit(false)
                //entra no rollback para voltar ao estado inicial do banco de dados
                //se der erro no rollback cai aqui, mas o id = 1 vai ficar atualizado?
                throw new DbException("Error trying to rollback! caused by : " + e1.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
