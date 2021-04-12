
package modeloBeans;

import java.util.Date;

public class BeansAgenda {
   private int agendaCod;
   private String nomeMedico;
   private String nomePaciente;
   private String turno;
   private Date data;
   private String estado;
   private String motivo;
   private String PacienteNasc;

    public String getPacienteNasc() {
        return PacienteNasc;
    }

    public void setPacienteNasc(String PacienteNasc) {
        this.PacienteNasc = PacienteNasc;
    }

    public int getAgendaCod() {
        return agendaCod;
    }

    public void setAgendaCod(int agendaCod) {
        this.agendaCod = agendaCod;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    

   
   
}
