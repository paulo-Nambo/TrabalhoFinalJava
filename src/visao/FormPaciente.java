
package visao;

import ModeloDao.DaoPaciente;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansPaciente;
import modeloBeans.ModeloTabela;
import modeloConection.conexaoBD;


public class FormPaciente extends javax.swing.JFrame {

    conexaoBD conex = new conexaoBD();
    BeansPaciente pac = new BeansPaciente();
    DaoPaciente dao = new DaoPaciente();
    int flag=0;
    int resposta=0;
    public FormPaciente() {
        initComponents();
        preencherBairros();
        preencherTabela("select paci_codigo,paci_nome,paci_telefone,paci_bi,bainome from pacientes inner join bairro on paci_baicodigo=baicodigo order by paci_nome");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNomePac = new javax.swing.JTextField();
        jFormattedTextFieldDtNas = new javax.swing.JFormattedTextField();
        jFormattedTextFieldBI = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelef = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldAV = new javax.swing.JTextField();
        jFormattedTextFieldCap = new javax.swing.JFormattedTextField();
        jTextFieldDistrito = new javax.swing.JTextField();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        jButtonNovop = new javax.swing.JButton();
        jButtonEditarp = new javax.swing.JButton();
        jButtonCancelarp = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        jButtonExcluirp = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField1Pesquisar = new javax.swing.JTextField();
        jButtonPesquisa = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jLabel3.setText("BI:");

        jLabel4.setText("Nascimento:");

        jLabel5.setText("Telefone:");

        jTextFieldNomePac.setEnabled(false);

        jFormattedTextFieldDtNas.setEnabled(false);
        jFormattedTextFieldDtNas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDtNasActionPerformed(evt);
            }
        });

        jFormattedTextFieldBI.setEnabled(false);

        jFormattedTextFieldTelef.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("AV/Rua:");

        jLabel8.setText("Distrito:");

        jLabel9.setText("Cap:");

        jLabel10.setText("Bairro:");

        jTextFieldAV.setEnabled(false);

        jFormattedTextFieldCap.setEnabled(false);

        jTextFieldDistrito.setEnabled(false);

        jComboBoxBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxBairro.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDistrito))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAV, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxBairro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCap, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldAV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jLabel6.setText("Endereco:");

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

        jButtonNovop.setText("Novo");
        jButtonNovop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovopActionPerformed(evt);
            }
        });

        jButtonEditarp.setText("Editar");
        jButtonEditarp.setEnabled(false);
        jButtonEditarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarpActionPerformed(evt);
            }
        });

        jButtonCancelarp.setText("Cancelar");
        jButtonCancelarp.setEnabled(false);
        jButtonCancelarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarpActionPerformed(evt);
            }
        });

        Salvar.setText("Salvar");
        Salvar.setEnabled(false);
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        jButtonExcluirp.setText("Excluir");
        jButtonExcluirp.setEnabled(false);
        jButtonExcluirp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirpActionPerformed(evt);
            }
        });

        jLabel11.setText("Pesquisa:");

        jTextField1Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1PesquisarActionPerformed(evt);
            }
        });

        jButtonPesquisa.setText("Procurar");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });

        jLabel12.setText("Codigo:");

        jTextFieldCodigo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovop, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEditarp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelarp)
                                .addGap(18, 18, 18)
                                .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jButtonExcluirp, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(289, 289, 289)
                                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldBI, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldDtNas)
                            .addComponent(jFormattedTextFieldTelef, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addGap(45, 45, 45))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisa)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDtNas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovop)
                    .addComponent(jButtonEditarp)
                    .addComponent(jButtonCancelarp)
                    .addComponent(Salvar)
                    .addComponent(jButtonExcluirp))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Formulario de Paciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(634, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void preencherBairros(){
    conex.getConnection();
    
    conex.executeSql("select *from bairro order by bainome");
        try {
            conex.rs.first();
            jComboBoxBairro.removeAllItems();
            do{
            
            jComboBoxBairro.addItem(conex.rs.getString("bainome"));
           
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao preencher Bairros "+ex);
        }
   
    conex.desconecta();
}
    
    
    
    private void jButtonCancelarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarpActionPerformed
     jTextFieldNomePac.setEnabled(true);
        jFormattedTextFieldDtNas.setEnabled(true);
        jFormattedTextFieldBI.setEnabled(true);
        jButtonCancelarp.setEnabled(true);
        jTextFieldDistrito.setEnabled(true);
        jTextFieldAV.setEnabled(true);
        jFormattedTextFieldCap.setEnabled(true);
        jFormattedTextFieldTelef.setEnabled(true);
        jComboBoxBairro.setEnabled(true);
        jTextFieldCodigo.setText("");
        jTextFieldNomePac.setText("");
        jFormattedTextFieldDtNas.setText("");
        jTextField1Pesquisar.setText("");
        jTextFieldAV.setText("");
        jFormattedTextFieldCap.setText("");
        jTextFieldDistrito.setText("");
        jFormattedTextFieldBI.setText("");
         jFormattedTextFieldTelef.setText("");
         jButtonNovop.setEnabled(true);
         jButtonCancelarp.setEnabled(true);
         Salvar.setEnabled(true);
        jButtonEditarp.setEnabled(false);
        jButtonExcluirp.setEnabled(false);
        jTextField1Pesquisar.setEnabled(true);
        jButtonPesquisa.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarpActionPerformed

    
    
    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        if(jTextFieldNomePac.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha o NOME para continuar");
          jTextFieldNomePac.requestFocus();
      }else 
         
          if(jFormattedTextFieldDtNas.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha a data de nascimento para continuar");
          jFormattedTextFieldDtNas.requestFocus();
      }else
          if(jFormattedTextFieldBI.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha BI para continuar");
          jFormattedTextFieldBI.requestFocus();
          }else 
          if(jFormattedTextFieldTelef.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha Telefone para continuar");
          jFormattedTextFieldTelef.requestFocus();
          }else 
          if(jTextFieldAV.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha Av/Rua para continuar");
          jTextFieldAV.requestFocus();
          }else 
       
          if(jTextFieldDistrito.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha Distrito para continuar");
          jTextFieldDistrito.requestFocus();
          }else
             
          if(jFormattedTextFieldCap.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "preencha Caixa postal (CAP) para continuar");
          jFormattedTextFieldCap.requestFocus();
          }else
              
          if (flag==1){
          pac.setNomePac( jTextFieldNomePac.getText());
          pac.setCap(jFormattedTextFieldCap.getText());
          pac.setDestrito(jTextFieldDistrito.getText());
          pac.setNas(jFormattedTextFieldDtNas.getText());
          pac.setBi(jFormattedTextFieldBI.getText());
          pac.setNomeBairro((String) jComboBoxBairro.getSelectedItem());
          pac.setTelefone(jFormattedTextFieldTelef.getText());
          pac.setRua(jTextFieldAV.getText());
          dao.Salvar(pac);
        
        }else{
          pac.setNomePac( jTextFieldNomePac.getText());
          pac.setCap(jFormattedTextFieldCap.getText());
          pac.setDestrito(jTextFieldDistrito.getText());
          pac.setNas(jFormattedTextFieldDtNas.getText());
          pac.setBi(jFormattedTextFieldBI.getText());
          pac.setNomeBairro((String) jComboBoxBairro.getSelectedItem());
          pac.setTelefone(jFormattedTextFieldTelef.getText());
          pac.setRua(jTextFieldAV.getText());
          pac.setCodPac(Integer.parseInt( jTextFieldCodigo.getText()));
          dao.Alterar(pac);
               
          }
              
        
    }//GEN-LAST:event_SalvarActionPerformed

    private void jButtonNovopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovopActionPerformed
      flag=1;
      Salvar.setEnabled(true);
      jTextFieldNomePac.setEnabled(true);
        jFormattedTextFieldDtNas.setEnabled(true);
        jFormattedTextFieldBI.setEnabled(true);
        jButtonCancelarp.setEnabled(true);
        jTextFieldDistrito.setEnabled(true);
        jTextFieldAV.setEnabled(true);
        jFormattedTextFieldCap.setEnabled(true);
        jFormattedTextFieldTelef.setEnabled(true);
        jComboBoxBairro.setEnabled(true);
        jTextFieldCodigo.setText("");
        jTextFieldNomePac.setText("");
        jFormattedTextFieldDtNas.setText("");
        jTextField1Pesquisar.setText("");
        jTextFieldAV.setText("");
        jFormattedTextFieldCap.setText("");
        jTextFieldDistrito.setText("");
        jButtonEditarp.setEnabled(false);
        jButtonExcluirp.setEnabled(false);
        jTextField1Pesquisar.setEnabled(false);
        jButtonPesquisa.setEnabled(false);
    }//GEN-LAST:event_jButtonNovopActionPerformed

    private void jButtonEditarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarpActionPerformed
       flag=2;
    }//GEN-LAST:event_jButtonEditarpActionPerformed

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        pac.setPesquisa(jTextField1Pesquisar.getText());
       BeansPaciente pac1= dao.buscaPaciente(pac);
       jTextFieldNomePac.setText(pac1.getNomePac());
       jTextFieldCodigo.setText(String.valueOf(pac1.getCodPac()));
       jFormattedTextFieldDtNas.setText(pac1.getNas());
       jFormattedTextFieldBI.setText(pac1.getBi());
       jFormattedTextFieldTelef.setText(pac1.getTelefone());
       jTextFieldAV.setText(pac1.getRua());
       jFormattedTextFieldCap.setText(pac1.getCap());
       jTextFieldDistrito.setText(pac1.getDestrito());
       jComboBoxBairro.setSelectedItem(pac1.getNomeBairro());
       
    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jButtonExcluirpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirpActionPerformed
         resposta=JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o paciente?");
         if(resposta==JOptionPane.YES_OPTION){
           pac.setCodPac(Integer.parseInt(jTextFieldCodigo.getText()));
       dao.Excluir(pac);  
         }
    }//GEN-LAST:event_jButtonExcluirpActionPerformed

    private void jTablePacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacienteMouseClicked
          String paci_nome=""+jTablePaciente.getValueAt(jTablePaciente.getSelectedRow(),1);
        conex.getConnection();
        conex.executeSql("select *from pacientes where paci_nome='"+paci_nome+"'");
        try {
            conex.rs.first();
            jTextFieldCodigo.setText(String.valueOf(conex.rs.getInt("paci_codigo")));
            jTextFieldNomePac.setText(conex.rs.getString("paci_nome"));
            jFormattedTextFieldBI.setText(conex.rs.getString("paci_bi"));
            jFormattedTextFieldDtNas.setText(conex.rs.getString("paci_nascimento"));
            jFormattedTextFieldTelef.setText(conex.rs.getString("paci_telefone"));
            jTextFieldAV.setText(conex.rs.getString("paci_rua"));
            jTextFieldDistrito.setText(conex.rs.getString("paci_distrito"));
            
            jFormattedTextFieldCap.setText(conex.rs.getString("paci_cap"));
            conexaoBD conexPesquisa= new conexaoBD();
            conexPesquisa.executeSql(("select *from bairro where baicodigo=")+conex.rs.getInt("paci_baicodigo"));
            conexPesquisa.rs.first();
            jComboBoxBairro.setSelectedItem(conexPesquisa.rs.getString("bainome"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar os dados"+ex);
        }
        
       // conex.desconecta();
       
    }//GEN-LAST:event_jTablePacienteMouseClicked

    private void jFormattedTextFieldDtNasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDtNasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDtNasActionPerformed

    private void jTextField1PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1PesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1PesquisarActionPerformed

     public final  void preencherTabela(String Sql){
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
        JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher ArrayList"+ex);
    }
    ModeloTabela modelo = new ModeloTabela(dados, colunas);
    jTablePaciente.setModel(modelo);
    jTablePaciente.getColumnModel().getColumn(0).setPreferredWidth(40);// tamanho da tabela
    jTablePaciente.getColumnModel().getColumn(0).setResizable(false);// faz com que o  usuario nao alter o tamanho da coluna com o mause 
    jTablePaciente.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTablePaciente.getColumnModel().getColumn(1).setResizable(false);
    jTablePaciente.getColumnModel().getColumn(2).setPreferredWidth(90);
    jTablePaciente.getColumnModel().getColumn(2).setResizable(false);
    jTablePaciente.getColumnModel().getColumn(3).setPreferredWidth(80);
    jTablePaciente.getColumnModel().getColumn(3).setResizable(false);
    jTablePaciente.getColumnModel().getColumn(4).setPreferredWidth(80);
    jTablePaciente.getColumnModel().getColumn(4).setResizable(false);
    jTablePaciente.getTableHeader().setReorderingAllowed(false);// o Usuaro nao podera altera o cabecalho
    jTablePaciente.setAutoResizeMode(jTablePaciente.AUTO_RESIZE_OFF);// para nao redemecionar a tabela
    jTablePaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// usuario podera seleconar somente um dado na tabela
    
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
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JButton jButtonCancelarp;
    private javax.swing.JButton jButtonEditarp;
    private javax.swing.JButton jButtonExcluirp;
    private javax.swing.JButton jButtonNovop;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JFormattedTextField jFormattedTextFieldBI;
    private javax.swing.JFormattedTextField jFormattedTextFieldCap;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtNas;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JTextField jTextField1Pesquisar;
    private javax.swing.JTextField jTextFieldAV;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDistrito;
    private javax.swing.JTextField jTextFieldNomePac;
    // End of variables declaration//GEN-END:variables
}
