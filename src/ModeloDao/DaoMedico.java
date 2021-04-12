
package ModeloDao;

import modeloConection.conexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;


public class DaoMedico {
    conexaoBD conex = new conexaoBD();
    BeansMedico mod = new BeansMedico();
    
    public void Salvar (BeansMedico mod){
        conex.getConnection();
        try { 
          PreparedStatement pst = conex.con.prepareStatement("insert into medicos(nome_medico,especialidade_medico,crm_medico) values (?,?,?)"); // inserindo dados na nossa BD
          pst.setString(1, mod.getNome());
          pst.setString(2,mod.getEspecialista());
          pst.setInt(3, mod.getCrm());
          pst.execute(); // para excutar depois de inserir os dados
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados"+ex);
        }
        
        conex.desconecta();
        
    }
    public void Editar(BeansMedico mod){
      conex.getConnection();
      
        try {
            PreparedStatement pst= conex.con.prepareCall("update medicos set nome_medico=?,especialidade_medico=?,crm_medico=? where 	cod_medico=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecialista());
            pst.setInt(3, mod.getCrm());
            pst.setInt(4,mod.getCodico());
            pst.execute();
        JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar os dados"+ex);
        }
      
      conex.desconecta();
    }
      public void Excluir(BeansMedico mod){
          conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from medicos where cod_medico=? ");
            pst.setInt(1,mod.getCodico());
            pst.execute();
            
                JOptionPane.showMessageDialog(null, "Medico Excluido com sucesso");
                
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao excluir medico"+ex);
        }
          
          
          
          conex.getConnection();
      }
    
    public BeansMedico buscaMedico(BeansMedico mod){
        conex.getConnection();
        conex.executeSql("select *from medicos where nome_medico like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodico(conex.rs.getInt("cod_medico"));
            mod.setNome(conex.rs.getString("nome_medico"));
            mod.setEspecialista(conex.rs.getString("especialidade_medico"));
            mod.setCrm(conex.rs.getInt("crm_medico"));
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Medico nao encotrado");
        }
        
        conex.desconecta();
        return mod;
        
    }
    
}
