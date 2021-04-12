/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import ModeloDao.DaoUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansUsuario;
import modeloBeans.ModeloTabela;
import modeloConection.conexaoBD;

/**
 *
 * @author Paulo Baltazar
 */
public class FormUsuario extends javax.swing.JFrame {

    BeansUsuario mod =new BeansUsuario();
    DaoUsuario dao= new DaoUsuario();
    conexaoBD conex=new conexaoBD();
    int flag=0;
            
    public FormUsuario() {
        initComponents();
         preencherTabela("select *from usuarios order by usu_nome");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldConfSenha = new javax.swing.JPasswordField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBusca = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Usuario");

        jTextFieldUsuario.setEnabled(false);

        jLabel3.setText("Senha:");

        jPasswordFieldSenha.setEnabled(false);

        jLabel4.setText("Confirme Senha");

        jPasswordFieldConfSenha.setEnabled(false);
        jPasswordFieldConfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConfSenhaActionPerformed(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Recepcionista", "Medico", " " }));
        jComboBoxTipo.setEnabled(false);

        jLabel5.setText("Tipo:");

        jLabel6.setText("Codigo:");

        jTextFieldCod.setEnabled(false);

        jButtonBusca.setText("Pesquisar");
        jButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordFieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonBusca)
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordFieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBusca))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("CADASTRO DE USUARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(656, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag=1;
        jTextFieldUsuario.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfSenha.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldCod.setText("");
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfSenha.setText("");
        jTextFieldBuscar.setText("");
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldBuscar.setEnabled(false);
        jButtonBusca.setEnabled(false);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
         if(jTextFieldUsuario.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha o NOME para continuar");
          jTextFieldUsuario.requestFocus();
      }else if(jPasswordFieldConfSenha.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha confirma senha para continuar");
          jPasswordFieldConfSenha.requestFocus();
      }else if(jPasswordFieldSenha.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "preencha senha para continuar");
      }else 
          if(jPasswordFieldSenha.getText().equals(jPasswordFieldConfSenha.getText())){
         if (flag==1){
        mod.setUsuNome(jTextFieldUsuario.getText());
       mod.setUsuTipo((String)jComboBoxTipo.getSelectedItem());
       mod.setUsuSenha(jPasswordFieldSenha.getText());
       dao.Salvar(mod);
       
       jTextFieldUsuario.setText("");
       jPasswordFieldSenha.setText("");
       jPasswordFieldConfSenha.setText("");
       jTextFieldUsuario.setEnabled(false);
       jPasswordFieldSenha.setEnabled(false);
       jPasswordFieldConfSenha.setEnabled(false);
       jComboBoxTipo.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonNovo.setEnabled(true);
       jTextFieldCod.setText("");
       jButtonEditar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       
       preencherTabela("select *from usuarios order by usu_nome");
        }else{
       mod.setUsuCod(Integer.parseInt(jTextFieldCod.getText()));
       mod.setUsuNome(jTextFieldUsuario.getText());
       mod.setUsuTipo((String)jComboBoxTipo.getSelectedItem());
       mod.setUsuSenha(jPasswordFieldSenha.getText());
       dao.Alterar(mod); 
         jTextFieldUsuario.setText("");
       jPasswordFieldSenha.setText("");
       jPasswordFieldConfSenha.setText("");
       jTextFieldBuscar.setText("");
       jTextFieldUsuario.setEnabled(false);
       jPasswordFieldSenha.setEnabled(false);
       jPasswordFieldConfSenha.setEnabled(false);
       jComboBoxTipo.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonNovo.setEnabled(true);
       jButtonCancelar.setEnabled(false);
       jTextFieldCod.setText("");
       preencherTabela("select *from usuarios order by usu_nome");
        }  
      }else{
            JOptionPane.showMessageDialog(null, "Erro ao confirmar senha tente novamente");  
          }
       
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaActionPerformed
        mod.setUsuPesquisa(jTextFieldBuscar.getText());
        BeansUsuario model = dao.buscaUsuario(mod);
        jTextFieldCod.setText(String.valueOf(model.getUsuCod()));
        jTextFieldUsuario.setText(model.getUsuNome());
        jPasswordFieldSenha.setText(model.getUsuSenha());
        jPasswordFieldConfSenha.setText(model.getUsuSenha());
        jComboBoxTipo.setSelectedItem(model.getUsuTipo());
        jButtonEditar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        
        preencherTabela("select *from usuarios order by usu_nome like '%"+mod.getUsuPesquisa()+"%'");


    }//GEN-LAST:event_jButtonBuscaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
         flag=2;
        jTextFieldUsuario.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfSenha.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       int resposta =0;
      resposta=JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o Usuario");
      if(resposta== JOptionPane.YES_OPTION){
        mod.setUsuCod(Integer.parseInt(jTextFieldCod.getText()));
      dao.Apagar(mod);
        jTextFieldCod.setText("");
       jTextFieldUsuario.setText("");
       jPasswordFieldSenha.setText("");
       jPasswordFieldConfSenha.setText("");
       jTextFieldBuscar.setText("");
       jTextFieldUsuario.setEnabled(false);
       jPasswordFieldSenha.setEnabled(false);
       jPasswordFieldConfSenha.setEnabled(true);
       jComboBoxTipo.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        preencherTabela("select *from usuarios order by usu_nome");
      }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldUsuario.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jPasswordFieldConfSenha.setEnabled(true);
        jComboBoxTipo.setEnabled(!true);
        jTextFieldCod.setText("");
       jTextFieldUsuario.setText("");
       jPasswordFieldSenha.setText("");
       jPasswordFieldConfSenha.setText("");
       jTextFieldBuscar.setText("");
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldBuscar.setEnabled(true);
        jButtonBusca.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
 
        String usu_nome=""+jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(),1);
        conex.getConnection();
        conex.executeSql("select *from usuarios where usu_nome='"+usu_nome+"'");
        try {
            conex.rs.first();
            jTextFieldCod.setText(String.valueOf(conex.rs.getInt("usu_cod")));
            jTextFieldUsuario.setText(conex.rs.getString("usu_nome"));
            jPasswordFieldSenha.setText(conex.rs.getString("usu_senha"));
            jComboBoxTipo.setSelectedItem(conex.rs.getString("usu_tipo"));
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar o Usuario"+ex);
        }
        
    //    conex.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);  
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jTextFieldUsuario.setEnabled(false);
        jTextFieldCod.setEnabled(false);
        jTextFieldBuscar.setEnabled(false);
        jPasswordFieldConfSenha.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        
        
        


    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void jPasswordFieldConfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldConfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldConfSenhaActionPerformed

    @SuppressWarnings("unchecked")
    public final void preencherTabela(String Sql){
        ArrayList valores = new ArrayList ();
            
             
      String [] colunas= new String[]{"ID","Usuario","Senha","Tipo"};       
    conex.getConnection();
    conex.executeSql(Sql);
    
    try{
       conex.rs.first();
       do{
    valores.add(new Object[]{conex.rs.getInt("usu_cod"),conex.rs.getString("usu_nome"),conex.rs.getString("usu_senha"),conex.rs.getString("usu_tipo")});
       }while (conex.rs.next()); //quando tiver dados ele fica percorendo nossa ArrayList
       
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher ArrayList"+ex);
    }
    ModeloTabela modelo = new ModeloTabela(valores,colunas);
    jTableUsuario.setModel(modelo);
    jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(40);// tamanho da tabela
    jTableUsuario.getColumnModel().getColumn(0).setResizable(false);// faz com que o  usuario nao alter o tamanho da coluna com o mause 
    jTableUsuario.getColumnModel().getColumn(1).setPreferredWidth(180);
    jTableUsuario.getColumnModel().getColumn(1).setResizable(false);
    jTableUsuario.getColumnModel().getColumn(2).setPreferredWidth(100);
    jTableUsuario.getColumnModel().getColumn(2).setResizable(false);
    jTableUsuario.getColumnModel().getColumn(3).setPreferredWidth(130);
    jTableUsuario.getColumnModel().getColumn(3).setResizable(false);
    jTableUsuario.getTableHeader().setReorderingAllowed(false);// o Usuaro nao podera altera o cabecalho
    jTableUsuario.setAutoResizeMode(jTableUsuario.AUTO_RESIZE_OFF);// para nao redemecionar a tabela
    jTableUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// usuario podera seleconar somente um dado na tabela
    
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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
