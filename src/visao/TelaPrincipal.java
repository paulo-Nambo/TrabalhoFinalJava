/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.conexaoBD;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Paulo Baltazar
 */
public class TelaPrincipal extends javax.swing.JFrame {
    FormMedico tela = new FormMedico();
    FormPaciente telaPaciente= new FormPaciente();
    FormAgendamento telaAgenda =new FormAgendamento();
    FormUsuario telaUsu= new FormUsuario();
    FromAgenda telaAgDiaria= new FromAgenda();
    FromAgendaMedico telaAgendaMedico= new FromAgendaMedico();

    conexaoBD conecta = new conexaoBD();
    private Connection con;
    public TelaPrincipal(String nome) {
        initComponents();
        jLabelNome.setText(nome);
        conecta.getConnection();
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameTelaBemvindo = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jPanelFundo = new javax.swing.JPanel();
        jButtonCadMedico = new javax.swing.JButton();
        jButtonPaciente = new javax.swing.JButton();
        jButtonAgenda = new javax.swing.JButton();
        jButtonCadEnfermeira = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelFundoTelaprincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemMedicos = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuItemEnfermeiro = new javax.swing.JMenuItem();
        jMenuItemPaciente = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemRelMedico = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBemvindo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAgendaDiaria = new javax.swing.JMenuItem();
        jMenuItemAgendaMedico = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameTelaBemvindo.setTitle("Bem Vindo");
        jInternalFrameTelaBemvindo.setVisible(true);
        jInternalFrameTelaBemvindo.getContentPane().setLayout(null);

        jLabel1.setText("Gerrenciamento de :");
        jInternalFrameTelaBemvindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 130, 20);

        jPanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFundo.setLayout(null);

        jButtonCadMedico.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/People-Doctor-Male-icon.png"))); // NOI18N
        jButtonCadMedico.setToolTipText("Medicos");
        jButtonCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedicoActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonCadMedico);
        jButtonCadMedico.setBounds(20, 30, 73, 80);

        jButtonPaciente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Actions-user-group-new-icon (1).png"))); // NOI18N
        jButtonPaciente.setToolTipText("Paciente");
        jButtonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPacienteActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonPaciente);
        jButtonPaciente.setBounds(210, 30, 80, 80);

        jButtonAgenda.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda1.2.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Agenda");
        jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonAgenda);
        jButtonAgenda.setBounds(310, 30, 70, 80);

        jButtonCadEnfermeira.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadEnfermeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nurse_person_woman_people_1697.png"))); // NOI18N
        jButtonCadEnfermeira.setToolTipText("Enfermeira");
        jButtonCadEnfermeira.setEnabled(false);
        jButtonCadEnfermeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEnfermeiraActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonCadEnfermeira);
        jButtonCadEnfermeira.setBounds(110, 30, 80, 80);

        jLabel2.setText("Cadastros");
        jPanelFundo.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 14);

        jInternalFrameTelaBemvindo.getContentPane().add(jPanelFundo);
        jPanelFundo.setBounds(0, 30, 570, 220);

        jButtonExit.setBackground(new java.awt.Color(255, 255, 255));
        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit1.png"))); // NOI18N
        jButtonExit.setToolTipText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jInternalFrameTelaBemvindo.getContentPane().add(jButtonExit);
        jButtonExit.setBounds(520, 0, 20, 20);

        getContentPane().add(jInternalFrameTelaBemvindo);
        jInternalFrameTelaBemvindo.setBounds(80, 70, 580, 280);

        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 520, 50, 14);

        jLabelNome.setText("jLabel4");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(80, 520, 140, 14);

        jLabelFundoTelaprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/19366.jpg"))); // NOI18N
        jLabelFundoTelaprincipal.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().add(jLabelFundoTelaprincipal);
        jLabelFundoTelaprincipal.setBounds(5, 1, 840, 560);

        jMenuCadastro.setText("Cadastro");

        jMenuItemMedicos.setText("Medicos");
        jMenuItemMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMedicosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemMedicos);

        jMenuItemUsuario.setText("Usuarios");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuario);

        jMenuItemEnfermeiro.setText("Enfermeiro/a");
        jMenuCadastro.add(jMenuItemEnfermeiro);

        jMenuItemPaciente.setText("Paciente");
        jMenuItemPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPacienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemPaciente);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatorio.setText("Relatorios");

        jMenuItemRelMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemRelMedico.setText("Mediscos");
        jMenuItemRelMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelMedicoActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelMedico);

        jMenuBar1.add(jMenuRelatorio);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBemvindo.setText("Tela bem-Vindo");
        jMenuItemTelaBemvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemvindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBemvindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenu1.setText("Agenda");

        jMenuItemAgendaDiaria.setText("Agenda Diaria");
        jMenuItemAgendaDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendaDiariaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAgendaDiaria);

        jMenuItemAgendaMedico.setText("Agenda Medico");
        jMenuItemAgendaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendaMedicoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAgendaMedico);

        jMenuBar1.add(jMenu1);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(864, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPacienteActionPerformed
        
        
        
    }//GEN-LAST:event_jMenuItemPacienteActionPerformed

    private void jButtonCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedicoActionPerformed
        conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
        try {
                 conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
     conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
           if(tela==null){
                 tela= new FormMedico();
                 tela.setVisible(true);
                 tela.setResizable(false);
             }  else{
                 tela.setVisible(true);
                 tela.setResizable(false);
             }

       
            }else{
                JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso"+ex);
        }
       
    }//GEN-LAST:event_jButtonCadMedicoActionPerformed

    private void jButtonCadEnfermeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEnfermeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadEnfermeiraActionPerformed

    private void jButtonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPacienteActionPerformed
conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
        try {
              conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
           if(telaPaciente==null){
                 telaPaciente= new FormPaciente();
                 telaPaciente.setVisible(true);
                 telaPaciente.setResizable(false);
             }  else{
                 telaPaciente.setVisible(true);
                 telaPaciente.setResizable(false);
             }


            }else
             if(conecta.rs.getString("usu_tipo").equals("Recepcionista")){
           if(telaPaciente==null){
                 telaPaciente= new FormPaciente();
                 telaPaciente.setVisible(true);
                 telaPaciente.setResizable(false);
             }  else{
                 telaPaciente.setVisible(true);
                 telaPaciente.setResizable(false);
             }


            }else
            {
                JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso");
        }      
    }//GEN-LAST:event_jButtonPacienteActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
       jInternalFrameTelaBemvindo.dispose();//para fechar a tela bem vindo
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
    conecta.desconecta();
        System.exit(0); // fechar tela principal por completo
    
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemTelaBemvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemvindoActionPerformed
       jInternalFrameTelaBemvindo.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemTelaBemvindoActionPerformed

    private void jMenuItemMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMedicosActionPerformed
       
        try {
              conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
            conecta.rs.first();
            
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
             if(tela==null){
                 tela= new FormMedico();
                 tela.setVisible(true);
                 tela.setResizable(false);
             }  else{
                 tela.setVisible(true);
                 tela.setResizable(false);
             }

       // FormMedico tela = new FormMedico();
       //tela.setVisible(true); 
            }else{
                JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso"+ex);
        }
       
        
    }//GEN-LAST:event_jMenuItemMedicosActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
       System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
          try {
              conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
            conecta.rs.first();
            
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
          if(telaUsu==null){
                 telaUsu= new FormUsuario();
                 telaUsu.setVisible(true);
                 telaUsu.setResizable(false);
             }  else{
                 telaUsu.setVisible(true);
                 telaUsu.setResizable(false);
             }

       // FormMedico tela = new FormMedico();
       //tela.setVisible(true); 
            }else{
                JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso"+ex);
        }
       
        
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

    private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaActionPerformed
  conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
        try {
                 conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
     conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
           if(telaAgenda==null){
                 telaAgenda= new FormAgendamento();
                 telaAgenda.setVisible(true);
                 telaAgenda.setResizable(false);
             }  else{
                 telaAgenda.setVisible(true);
                 telaAgenda.setResizable(false);
             }

       
            }else if(conecta.rs.getString("usu_tipo").equals("Recepcionista")){
           if(telaAgenda==null){
                 telaAgenda= new FormAgendamento();
                 telaAgenda.setVisible(true);
                 telaAgenda.setResizable(false);
             }  else{
                 telaAgenda.setVisible(true);
                 telaAgenda.setResizable(false);
             }


            }
            
            else
            
            {
                JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso"+ex);
        }       
    }//GEN-LAST:event_jButtonAgendaActionPerformed

    private void jMenuItemAgendaDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendaDiariaActionPerformed
     
         try {
              conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
            conecta.rs.first();
            
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
          if(telaAgDiaria==null){
                 telaAgDiaria= new FromAgenda();
                 telaAgDiaria.setVisible(true);
                 telaAgDiaria.setResizable(false);
             }  else{
                 telaAgDiaria.setVisible(true);
                 telaAgDiaria.setResizable(false);
             }
 
            }else
            if(conecta.rs.getString("usu_tipo").equals("Recepcionista")){
          if(telaAgDiaria==null){
                 telaAgDiaria= new FromAgenda();
                 telaAgDiaria.setVisible(true);
                 telaAgDiaria.setResizable(false);
             }  else{
                 telaAgDiaria.setVisible(true);
                 telaAgDiaria.setResizable(false);
             }
 
            }else
                
            {
                JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso"+ex);
        }
       
        
    }//GEN-LAST:event_jMenuItemAgendaDiariaActionPerformed

    private void jMenuItemAgendaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendaMedicoActionPerformed
      try {
              conecta.executeSql("select *from usuarios where usu_nome='"+jLabelNome.getText()+"'");
            conecta.rs.first();
            
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
          if(telaAgendaMedico==null){
                 telaAgendaMedico= new FromAgendaMedico();
                 telaAgendaMedico.setVisible(true);
                 telaAgendaMedico.setResizable(false);
             }  else{
                 telaAgendaMedico.setVisible(true);
                 telaAgendaMedico.setResizable(false);
             }
 
            }else
            if(conecta.rs.getString("usu_tipo").equals("Medico")){
          if(telaAgendaMedico==null){
                 telaAgendaMedico= new FromAgendaMedico();
                 telaAgendaMedico.setVisible(true);
                 telaAgendaMedico.setResizable(false);
             }  else{
                 telaAgendaMedico.setVisible(true);
                 telaAgendaMedico.setResizable(false);
             }
 
            }else
                
            {
                JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Voce nao tem permicao de acesso"+ex);
        }
       
    }//GEN-LAST:event_jMenuItemAgendaMedicoActionPerformed

    private void jMenuItemRelMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelMedicoActionPerformed
         Connection con =conexaoBD.getConnection();
        // esse metodo chama o nosso relatorio de pacientes
        
        // esse metodo pergunta se a pessoa quer imprimir o relatorio
        
        int confirma = JOptionPane.showConfirmDialog(null, "Confirme a Inpresao do Relatorio?","Atecao",JOptionPane.YES_NO_OPTION );
        if(confirma==JOptionPane.YES_OPTION){
            //Imprimindo o Relatorio
            String src = "E:/ProJClinica/ProjectoClinica/src/MyReports/Relatorio de Medico.jrxml";// tenho que resolver este caminho para o relatorio
            JasperPrint jasperPrint= null;
            try{
               
                jasperPrint= JasperFillManager.fillReport(src,null, con );
            }catch(JRException ex){
                JOptionPane.showMessageDialog(rootPane,"Erro ao gerar relatorio\n"+ex);
            }
            JasperViewer view = new JasperViewer(jasperPrint,false);
            view.setVisible(true);
            
        }
            
        
    }//GEN-LAST:event_jMenuItemRelMedicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadEnfermeira;
    private javax.swing.JButton jButtonCadMedico;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonPaciente;
    private javax.swing.JInternalFrame jInternalFrameTelaBemvindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFundoTelaprincipal;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemAgendaDiaria;
    private javax.swing.JMenuItem jMenuItemAgendaMedico;
    private javax.swing.JMenuItem jMenuItemEnfermeiro;
    private javax.swing.JMenuItem jMenuItemMedicos;
    private javax.swing.JMenuItem jMenuItemPaciente;
    private javax.swing.JMenuItem jMenuItemRelMedico;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBemvindo;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelFundo;
    // End of variables declaration//GEN-END:variables

    private JasperViewer JasperViewer(JasperPrint jasperPrint, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
