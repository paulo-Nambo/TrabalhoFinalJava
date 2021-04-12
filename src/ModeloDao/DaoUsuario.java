/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;
import modeloConection.conexaoBD;


public class DaoUsuario {
    conexaoBD conex = new conexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void Salvar (BeansUsuario mod){
        conex.getConnection();
        try { 
          PreparedStatement pst = conex.con.prepareStatement("insert into usuarios(usu_nome,usu_senha,usu_tipo) values (?,?,?)"); // inserindo dados na nossa BD
          pst.setString(1, mod.getUsuNome());
          pst.setString(2,mod.getUsuSenha());
          pst.setString(3, mod.getUsuTipo());
          pst.execute(); // para excutar depois de inserir os dados
            JOptionPane.showMessageDialog(null, "Usuario inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuario "+ex);
        }
        
        conex.desconecta();
        
    }
    
      public BeansUsuario buscaUsuario(BeansUsuario mod){
        conex.getConnection();
        conex.executeSql("select *from usuarios where usu_nome like '%"+mod.getUsuPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("usu_cod"));
            mod.setUsuNome(conex.rs.getString("usu_nome"));
            mod.setUsuSenha(conex.rs.getString("usu_senha"));
            mod.setUsuTipo(conex.rs.getString("usu_tipo"));
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "usuario  nao encotrado");
        }
        
        conex.desconecta();
        return mod;
        
    }
      public void Alterar(BeansUsuario mod){
      conex.getConnection();
      
        try {
            PreparedStatement pst= conex.con.prepareCall("update usuarios set usu_nome=?,usu_senha=?,usu_tipo=? where usu_cod=?");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.setInt(4,mod.getUsuCod());
            pst.execute();
        JOptionPane.showMessageDialog(null, "Usuario Alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar  Usuario"+ex);
        }
      
      conex.desconecta();
    }
      public void Apagar(BeansUsuario mod){
          conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where usu_cod=? ");
            pst.setInt(1,mod.getUsuCod());
            pst.execute();
            
                JOptionPane.showMessageDialog(null, "Usuario Excluido com sucesso");
                
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao excluir Usuario"+ex);
        }
          
          
          
          conex.getConnection();
      }
    
}
