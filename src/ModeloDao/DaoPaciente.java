/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansPaciente;
import modeloConection.conexaoBD;


public class DaoPaciente {
    BeansPaciente pac= new BeansPaciente();
    conexaoBD conex = new conexaoBD();
    conexaoBD conexBairro=new conexaoBD();
    String nomeBairro;
    int codBai;
    
    
    
    
    public void Salvar(BeansPaciente pac){
        
        buscaBaiCod(pac.getNomeBairro());
        conex.getConnection();
        try {
            PreparedStatement pst= conex.con.prepareStatement("insert into pacientes (paci_nome,paci_bi,paci_telefone,paci_rua,paci_cap,paci_distrito,paci_baicodigo,paci_nascimento)values(?,?,?,?,?,?,?,?)");
            pst.setString(1,pac.getNomePac());
            pst.setString(2,pac.getBi());
            pst.setString(3,pac.getTelefone());
            pst.setString(4,pac.getRua());
            pst.setString(5,pac.getCap());
            pst.setString(6,pac.getDestrito());
            pst.setInt(7,codBai);
            pst.setString(8,pac.getNas());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Paciente Inserido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar Paciente"+ ex);
        }
        
        conex.desconecta();
        
        
    }
    
    public void Alterar (BeansPaciente pac){
        
        buscaBaiCod(pac.getNomeBairro());
        conex.getConnection();
        try {
            PreparedStatement pst= conex.con.prepareStatement("update pacientes set paci_nome=?,paci_bi=?,paci_telefone=?,paci_rua=?,paci_cap=?,paci_distrito=?,paci_baicodigo=?,paci_nascimento=? where paci_codigo=?");
            pst.setString(1,pac.getNomePac());
            pst.setString(2,pac.getBi());
            pst.setString(3,pac.getTelefone());
            pst.setString(4,pac.getRua());
            pst.setString(5,pac.getCap());
            pst.setString(6,pac.getDestrito());
            pst.setInt(7,codBai);
            pst.setString(8,pac.getNas());
            pst.setInt(9,pac.getCodPac());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Paciente Alterado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar Paciente"+ ex);
        }
        
        conex.desconecta();
        
        
    }
   
    
    
    public void buscaBaiCod(String nome){
        conex.getConnection();
        conex.executeSql("select *from bairro where bainome='"+nome+"'");
        try {
            conex.rs.first();
            codBai=conex.rs.getInt("baicodigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Bairro"+ ex);
        }
        
        
        conex.desconecta();
    }
        
    
    public BeansPaciente buscaPaciente(BeansPaciente pac){
      conex.getConnection();
    
        try {
              conex.executeSql("select *from pacientes where paci_nome like'%"+pac.getPesquisa()+"%'");
          
            conex.rs.first();
            buscaNomeBairro(conex.rs.getInt("paci_baicodigo"));
            pac.setNomePac(conex.rs.getString("paci_nome"));
            pac.setCap(conex.rs.getString("paci_cap"));
            pac.setCodPac(conex.rs.getInt("paci_codigo"));
            pac.setDestrito(conex.rs.getString("paci_distrito"));
            pac.setNas(conex.rs.getString("paci_nascimento"));
            pac.setBi(conex.rs.getString("paci_bi"));
            pac.setTelefone(conex.rs.getString("paci_telefone"));
            pac.setRua(conex.rs.getString("paci_rua"));
            pac.setNomeBairro(nomeBairro);
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao buscar nome do Bairro"+ ex);
        }
        conex.desconecta();
        return pac; 
    }

public void buscaNomeBairro(int cod){
    conexBairro.getConnection();
   
        try {
            conexBairro.executeSql("select *from bairro where baicodigo="+cod);
            conexBairro.rs.first();
           nomeBairro=conexBairro.rs.getString("bainome");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao buscar nome do Bairro"+ ex);
        }
    conexBairro.desconecta();
}  
public void Excluir(BeansPaciente pac){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from pacientes where paci_codigo=?");
            pst.setInt(1, pac.getCodPac());
            pst.execute();
            JOptionPane.showMessageDialog(null,"paciente excluido com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar paciente"+ ex);
        }
        
        conex.desconecta();
}



}
