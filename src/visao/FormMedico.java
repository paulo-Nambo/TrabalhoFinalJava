/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
import ModeloDao.DaoMedico;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansMedico;
import modeloBeans.ModeloTabela;
import modeloConection.conexaoBD;

/**
 *
 * @author Paulo Baltazar
 */
public class FormMedico extends javax.swing.JFrame {

    BeansMedico mod =new BeansMedico();
    DaoMedico controle= new DaoMedico();
    conexaoBD conex=new conexaoBD();
    int flag=0;
    
    public FormMedico() {
        initComponents();
        preencherTabela("select *from medicos order by nome_medico");
    }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldCrm = new javax.swing.JFormattedTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxEspecialista = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtCOD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jLabel3.setText("Crm:");

        jLabel4.setText("Especialista:");

        jFormattedTextFieldCrm.setEnabled(false);
        jFormattedTextFieldCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCrmActionPerformed(evt);
            }
        });

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jComboBoxEspecialista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pediatra", "Cardiologista", "Fisioterapeuta", "Nutroconista", "Geocologista", " ", " " }));
        jComboBoxEspecialista.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });

        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        jtCOD.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPesquisar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEspecialista, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEspecialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("   CADASTRO MEDICO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(713, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCrmActionPerformed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
      if(jTextFieldNome.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha o NOME para continuar");
          jTextFieldNome.requestFocus();
      }else if(jFormattedTextFieldCrm.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha o CRMpara continuar");
          jFormattedTextFieldCrm.requestFocus();
      }else
        if (flag==1){
        mod.setNome(jTextFieldNome.getText());
       mod.setEspecialista((String)jComboBoxEspecialista.getSelectedItem());
       mod.setCrm(Integer.parseInt(jFormattedTextFieldCrm.getText()));
       controle.Salvar(mod);
       
       jTextFieldNome.setText("");
       jFormattedTextFieldCrm.setText("");
       jTextFieldNome.setEnabled(false);
       jFormattedTextFieldCrm.setEnabled(false);
       jComboBoxEspecialista.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       preencherTabela("select *from medicos order by nome_medico");
      }else{
        mod.setCodico((Integer.parseInt(jtCOD.getText())));
        mod.setNome(jTextFieldNome.getText());
        mod.setEspecialista((String)jComboBoxEspecialista.getSelectedItem());
        mod.setCrm((Integer.parseInt(jFormattedTextFieldCrm.getText())));
        controle.Editar(mod);
        jtCOD.setText("");
       jTextFieldNome.setText("");
       jFormattedTextFieldCrm.setText("");
       jTextFieldPesquisar.setText("");
       jTextFieldNome.setEnabled(false);
       jFormattedTextFieldCrm.setEnabled(false);
       jComboBoxEspecialista.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonSalvar.setEnabled(true);
        preencherTabela("select *from medicos order by nome_medico");
      }
       
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag=1;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCrm.setEnabled(true);
        jComboBoxEspecialista.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jtCOD.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCrm.setText("");
        jTextFieldPesquisar.setText("");
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisar.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag=2;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCrm.setEnabled(true);
        jComboBoxEspecialista.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCrm.setEnabled(!true);
        jComboBoxEspecialista.setEnabled(!true);
        jtCOD.setText("");
       jTextFieldNome.setText("");
       jFormattedTextFieldCrm.setText("");
       jFormattedTextFieldCrm.setText("");
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisar.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
      int resposta =0;
      resposta=JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o medico");
      if(resposta== JOptionPane.YES_OPTION){
        mod.setCodico(Integer.parseInt(jtCOD.getText()));
        controle.Excluir(mod);
        jtCOD.setText("");
       jTextFieldNome.setText("");
       jFormattedTextFieldCrm.setText("");
       jFormattedTextFieldCrm.setText("");
       jTextFieldNome.setEnabled(false);
       jFormattedTextFieldCrm.setEnabled(false);
       jComboBoxEspecialista.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        preencherTabela("select *from medicos order by nome_medico");
      }
      
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicosMouseClicked
        String nome_medico=""+jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(),1);
        conex.getConnection();
        conex.executeSql("select *from medicos where nome_medico='"+nome_medico+"'");
        try {
            conex.rs.first();
            jtCOD.setText(String.valueOf(conex.rs.getInt("cod_medico")));
            jTextFieldNome.setText(conex.rs.getString("nome_medico"));
            jComboBoxEspecialista.setSelectedItem(conex.rs.getString("especialidade_medico"));
            jFormattedTextFieldCrm.setText(conex.rs.getString("crm_medico"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar os dados"+ex);
        }
        
        conex.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableMedicosMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisar.getText());
        BeansMedico model = controle.buscaMedico(mod);
        jtCOD.setText(String.valueOf(model.getCodico()));
        jTextFieldNome.setText(model.getNome());
        jFormattedTextFieldCrm.setText(String.valueOf(model.getCrm()));
        jComboBoxEspecialista.setSelectedItem(model.getEspecialista());

        

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed
    
    
    public final void preencherTabela(String Sql){
        ArrayList dados=new ArrayList();
      String [] colunas= new String[]{"ID","Nome","Especialidade","Crm"};       
    conex.getConnection();
    conex.executeSql(Sql);
    
    try{
       conex.rs.first();
       do{
    dados.add(new Object[]{conex.rs.getInt("cod_medico"),conex.rs.getString("nome_medico"),conex.rs.getString("especialidade_medico"),conex.rs.getInt("crm_medico")});
       }while (conex.rs.next()); //quando tiver dados ele fica percorendo nossa ArrayList
       
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher ArrayList"+ex);
    }
    ModeloTabela modelo = new ModeloTabela(dados, colunas);
    jTableMedicos.setModel(modelo);
    jTableMedicos.getColumnModel().getColumn(0).setPreferredWidth(40);// tamanho da tabela
    jTableMedicos.getColumnModel().getColumn(0).setResizable(false);// faz com que o  usuario nao alter o tamanho da coluna com o mause 
    jTableMedicos.getColumnModel().getColumn(1).setPreferredWidth(180);
    jTableMedicos.getColumnModel().getColumn(1).setResizable(false);
    jTableMedicos.getColumnModel().getColumn(2).setPreferredWidth(160);
    jTableMedicos.getColumnModel().getColumn(2).setResizable(false);
    jTableMedicos.getColumnModel().getColumn(3).setPreferredWidth(70);
    jTableMedicos.getColumnModel().getColumn(3).setResizable(false);
    jTableMedicos.getTableHeader().setReorderingAllowed(false);// o Usuaro nao podera altera o cabecalho
    jTableMedicos.setAutoResizeMode(jTableMedicos.AUTO_RESIZE_OFF);// para nao redemecionar a tabela
    jTableMedicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// usuario podera seleconar somente um dado na tabela
    
  //  conex.desconecta();
    
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
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    public javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEspecialista;
    private javax.swing.JFormattedTextField jFormattedTextFieldCrm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jtCOD;
    // End of variables declaration//GEN-END:variables
}
