
package ModeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansAgenda;
import modeloConection.conexaoBD;

/**
 *
 * @author Paulo Baltazar
 */
public class DaoAgenda {
    

    BeansAgenda agenda= new BeansAgenda();
    conexaoBD conex = new conexaoBD();
    conexaoBD conexPaciente= new conexaoBD();
    conexaoBD conexMedico= new conexaoBD();
    
    int codicoMedico;
    int codicoPaciente;
    
    public void Salvar (BeansAgenda agenda){
        BuscaMedico(agenda.getNomeMedico());
        BuscaPaciente(agenda.getNomePaciente());
        conex.getConnection();
        try {
            PreparedStatement pst =conex.con.prepareStatement("insert into agenda(agenda_codpac,agenda_codmedico,agenda_motivo,agenda_turno,agenda_data,agenda_estado)values(?,?,?,?,?,?)");
            pst.setInt(1, codicoPaciente);
            pst.setInt(2, codicoMedico);
            pst.setString(3,agenda.getMotivo());
            pst.setString(4,agenda.getTurno());
            pst.setDate(5, new java.sql.Date(agenda.getData().getTime()));
            pst.setString(6, agenda.getEstado());
            pst.execute();
            
        JOptionPane.showMessageDialog(null, " Agendamento salvo com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Salvar agendamento");
        }
        
        conex.desconecta();
    }
    
    public void BuscaMedico(String nomeMedico){
        conexMedico.getConnection();
        conexMedico.executeSql("select *from medicos where nome_medico ='"+nomeMedico+"'");
        try {
            conexMedico.rs.first();
            codicoMedico= conexMedico.rs.getInt("cod_medico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro nao encotrou Medico");
        }
    }
    
     public int BuscaCodMedico(String nomeMedico){
        conexMedico.getConnection();
        conexMedico.executeSql("select *from medicos where nome_medico ='"+nomeMedico+"'");
        try {
            conexMedico.rs.first();
            codicoMedico= conexMedico.rs.getInt("cod_medico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro nao encotrou Medico");
        }
        return codicoMedico;
    }
    
    public void BuscaPaciente(String nomePaciente){
     conexPaciente.getConnection();
        conexPaciente.executeSql("select *from pacientes where paci_nome='"+nomePaciente+"'");
        try {
            conexPaciente.rs.first();
            codicoPaciente= conexPaciente.rs.getInt("paci_codigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro nao encotrou paciente");
        }
        
    }
    public void Alterar(BeansAgenda agenda){
        conex.getConnection();
        try {
            PreparedStatement pst= conex.con.prepareStatement("update agenda set agenda_estado=? where agenda_cod=?");
            pst.setString(1,agenda.getEstado());
            pst.setInt(2,agenda.getAgendaCod());
           
            pst.execute();
            JOptionPane.showMessageDialog(null,"Agendamento em Atendimento");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro no Atendimento");
        }
        
        conex.desconecta();
        
    }
    public BeansAgenda buscaAgendaPorCodigo(int cod){
        BeansAgenda agen = new BeansAgenda();
        conex.getConnection();
        conex.executeSql("select *from agenda inner join pacientes on agenda_codpac=paci_codigo inner join medicos on agenda_codmedico=cod_medico where agenda_cod='"+cod+"'");
        
            try {
                conex.rs.first();
                  agen.setNomePaciente(conex.rs.getString("paci_nome"));
                  agen.setNomeMedico(conex.rs.getString("nome_medico"));
                  agen.setMotivo(conex.rs.getString("agenda_motivo"));
                  agen.setPacienteNasc(conex.rs.getString("paci_nascimento"));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar agendamento por codigo!"+ex);
            }
            return agen; 
        }
    
}

    

