/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancodeDados;
/*
 Esta classe possui os métodos e atributos principais para acesso ao banco de dados.
 Neste programa, toda a classe que quiser representar um objeto no banco, deverá herdar
 características desta classe.
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ConexaoBanco 
{
     String drive = "com.mysql.jdbc.Driver";
     String url = "jdbc:mysql://localhost:3306/CaixaAcustica";
     String user = "root";
     String pass = "root";
     public Connection con = null;
     Statement stm = null;
     ResultSet tabelaRetornada;
     
    public void criarConexaoBanco() //  Define a conexão com o driver do banco
    {
                try
                {
                    Class.forName(drive);
                    System.out.println("Procurando Classe... conectado ao driver");
                }
                   catch (ClassNotFoundException ex)
                    {
                      System.err.println("ERRO: Classe não encontrada");
                    }
    }
       
    public void executasql (String sql)
    {
        
    }
     public void conectaBanco() // Utiliza as propriedades (url, senha, usuario) para conexão com o banco
    {
       criarConexaoBanco();  
         try
         {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Criando conexão com o Banco de Dados...\n\n");
         }
         catch(SQLException e)
         {
            System.out.println("ERRO: "+e.getSQLState());
         }
    }
    
     public void desconectaBanco() // Fecha a conexão
     {
        try {
                con.close();
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
     }
    
}



    

