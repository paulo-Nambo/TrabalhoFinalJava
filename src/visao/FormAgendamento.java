
package visao;

import ModeloDao.DaoAgenda;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansAgenda;
import modeloBeans.ModeloTabela;
import modeloConection.conexaoBD;


public class FormAgendamento extends javax.swing.JFrame {

    conexaoBD conex = new conexaoBD();
    BeansAgenda agend= new BeansAgenda();
    
    
    public FormAgendamento() {
        initComponents();
        preencherMedicos();
    }

    public void preencherMedicos(){
    conex.getConnection();
    
    conex.executeSql("select *from medicos order by nome_medico");
        try {
            conex.rs.first();
            jComboBoxMedico.removeAllItems();
            do{
            
            jComboBoxMedico.addItem(conex.rs.getString("nome_medico"));
           
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao preencher Medico "+ex);
        }
   
    //conex.desconecta();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPaciente = new javax.swing.JTextField();
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        jTextFieldMotivo = new javax.swing.JTextField();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        jButtonFinaAge = new javax.swing.JButton();
        jButtonCancelarAge = new javax.swing.JButton();
        jDateChooserAgenda = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Paciente:");

        jLabel3.setText("Medico:");

        jLabel4.setText("Turno:");

        jLabel5.setText("Data:");

        jLabel6.setText("Motivo:");

        jTextFieldPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPacienteActionPerformed(evt);
            }
        });

        jComboBoxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarde", "Manha ", "Noite" }));
        jComboBoxTurno.setEnabled(false);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePaciente);

        jTextFieldMotivo.setEnabled(false);
        jTextFieldMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMotivoActionPerformed(evt);
            }
        });

        jComboBoxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMedico.setEnabled(false);
        jComboBoxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMedicoActionPerformed(evt);
            }
        });

        jButtonFinaAge.setText("Finalizar Agendamento");
        jButtonFinaAge.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonFinaAge.setEnabled(false);
        jButtonFinaAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinaAgeActionPerformed(evt);
            }
        });

        jButtonCancelarAge.setText("Cancelar Agendamento");
        jButtonCancelarAge.setEnabled(false);
        jButtonCancelarAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAgeActionPerformed(evt);
            }
        });

        jDateChooserAgenda.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooserAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButtonFinaAge, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelarAge, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jDateChooserAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFinaAge)
                    .addComponent(jButtonCancelarAge))
                .addGap(24, 24, 24))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Agendamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(646, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        preencherTabela("select paci_codigo,paci_nome,paci_telefone,paci_bi,bainome from pacientes inner join bairro on paci_baicodigo=baicodigo where paci_nome like'%"+jTextFieldPaciente.getText()+"%'");
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTablePacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacienteMouseClicked
        
          String paci_nome=""+jTablePaciente.getValueAt(jTablePaciente.getSelectedRow(),1);
        conex.getConnection();
        conex.executeSql("select *from pacientes where paci_nome='"+paci_nome+"'");
        try {
            conex.rs.first();
          
            jTextFieldPaciente.setText(conex.rs.getString("paci_nome"));
          
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar o Paciente"+ex);
        }
        conex.desconecta();
        jComboBoxTurno.setEnabled(true);
        jComboBoxMedico.setEnabled(true);
        jDateChooserAgenda.setEnabled(true);
        jTextFieldMotivo.setEnabled(true);
        jButtonFinaAge.setEnabled(true);
        jButtonCancelarAge.setEnabled(true);
        
        
    }//GEN-LAST:event_jTablePacienteMouseClicked

    private void jButtonFinaAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinaAgeActionPerformed
      
       agend.setNomePaciente(jTextFieldPaciente.getText());
       agend.setNomeMedico((String) jComboBoxMedico.getSelectedItem());
       agend.setTurno((String) jComboBoxTurno.getSelectedItem());
       agend.setMotivo(jTextFieldMotivo.getText());
       agend.setData(jDateChooserAgenda.getDate());
       agend.setEstado("Aberto");
       DaoAgenda dao =new DaoAgenda();
       dao.Salvar(agend);
       
       dispose();
       jTextFieldPaciente.setText("");
       jDateChooserAgenda.setDate(null);
       jTextFieldMotivo.setText("");
       
        jComboBoxTurno.setEnabled(!true); //alem de ele limpar eu quero que bloquei os campos por isso do sinal (!)
        jComboBoxMedico.setEnabled(!true);
        jDateChooserAgenda.setEnabled(!true);
        jTextFieldMotivo.setEnabled(!true);
        jButtonFinaAge.setEnabled(!true);
        jButtonCancelarAge.setEnabled(!true);
        
       
        
    }//GEN-LAST:event_jButtonFinaAgeActionPerformed

    private void jButtonCancelarAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAgeActionPerformed
        jDateChooserAgenda.setDate(null); 
        jTextFieldPaciente.setText("");
        jTextFieldMotivo.setText("");
        
        jComboBoxTurno.setEnabled(!true);
        jComboBoxMedico.setEnabled(!true);
        jDateChooserAgenda.setEnabled(!true);
        jTextFieldMotivo.setEnabled(!true);
        jButtonFinaAge.setEnabled(!true);
        jButtonCancelarAge.setEnabled(!true);
    }//GEN-LAST:event_jButtonCancelarAgeActionPerformed

    private void jTextFieldPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPacienteActionPerformed

    private void jTextFieldMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMotivoActionPerformed

    private void jComboBoxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMedicoActionPerformed
   
    @SuppressWarnings("unchecked")
      public final void preencherTabela(String Sql){
       ArrayList dados=new ArrayList();
      String [] colunas= new String[]{"ID","Nome","Telefone","BI","Bairro"};       
    conex.getConnection();
    conex.executeSql(Sql);
    
    try{
       conex.rs.first();
       do{
    dados.add(new Object[]{conex.rs.getInt("paci_codigo"),conex.rs.getString("paci_nome"),conex.rs.getString("paci_telefone"),conex.rs.getString("paci_bi"),conex.rs.getString("bainome")});
       }while (conex.rs.next()); //quando tiver dados ele fica percorendo nossa ArrayList
       
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher ArrayList");
    }
    ModeloTabela modelo = new ModeloTabela(dados, colunas);
    jTablePaciente.setModel(modelo);
    jTablePaciente.getColumnModel().getColumn(0).setPreferredWidth(40);// tamanho da tabela
    jTablePaciente.getColumnModel().getColumn(0).setResizable(false);// faz com que o  usuario nao alter o tamanho da coluna com o mause 
    jTablePaciente.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTablePaciente.getColumnModel().getColumn(1).setResizable(false);
    jTablePaciente.getColumnModel().getColumn(2).setPreferredWidth(90);
    jTablePaciente.getColumnModel().getColumn(2).setResizable(false);
    jTablePaciente.getColumnModel().getColumn(3).setPreferredWidth(100);
    jTablePaciente.getColumnModel().getColumn(3).setResizable(false);
    jTablePaciente.getColumnModel().getColumn(4).setPreferredWidth(130);
    jTablePaciente.getColumnModel().getColumn(4).setResizable(false);
    jTablePaciente.getTableHeader().setReorderingAllowed(false);// o Usuaro nao podera altera o cabecalho
    jTablePaciente.setAutoResizeMode(jTablePaciente.AUTO_RESIZE_OFF);// para nao redemecionar a tabela
    jTablePaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// usuario podera seleconar somente um dado na tabela
    
    conex.desconecta();
}
    
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
            java.util.logging.Logger.getLogger(FormAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelarAge;
    private javax.swing.JButton jButtonFinaAge;
    private javax.swing.JComboBox<String> jComboBoxMedico;
    private javax.swing.JComboBox<String> jComboBoxTurno;
    private com.toedter.calendar.JDateChooser jDateChooserAgenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JTextField jTextFieldMotivo;
    private javax.swing.JTextField jTextFieldPaciente;
    // End of variables declaration//GEN-END:variables

    
}
