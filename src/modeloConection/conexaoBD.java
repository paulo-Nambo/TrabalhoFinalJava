
package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class conexaoBD {
    public Statement stm; //Utilidado para faser a pesquisa no banco de dados
    public ResultSet rs;// respossavel por guardar o resultado da nossa pesquisa
    public static Connection con;//Responsavel pela conexao com a base de dados
    
    private static final String driver = "org.postgresql.Driver"; // respossavel por identificar o nosso servico na base de dado
    private static final String caminho = "jdbc:postgresql://localhost:5432/projetoclinica";// o caminho onde se encontra a  base de dados 
    private static final String usuario = "postgres";// usuario da BD
    private static final String senha = "849442329";// senha da base de dado
   
    
    public static Connection getConnection(){//respossavel pela conexao com a base de dados
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            con= DriverManager.getConnection(caminho, usuario,senha );
           // JOptionPane.showMessageDialog(null, "Conexao efetuada com sucesso ");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro de conexao a base de dado:\n"+ex.getMessage());
        }
        return con;
    }
      
    public void executeSql(String Sql){// Metodo para pesquisa na BD
        
        try {
            stm=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs=stm.executeQuery(Sql);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ExcutaSql:\n"+ex.getMessage());
        }
    }
    
    public void desconecta(){// respossavel pela desconexao com a base de dados 
        try {
            con.close();
           // JOptionPane.showConfirmDialog(null, "BD desconexao com sucesso");
        } catch (SQLException ex) {
           JOptionPane.showConfirmDialog(null, "erro na desconexao:\n"+ex.getMessage());
        }
    }
    
}