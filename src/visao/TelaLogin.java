
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.conexaoBD;

/**
 *
 * @author Paulo Baltazar
 */
public class TelaLogin extends javax.swing.JFrame {
    conexaoBD con = new conexaoBD();

  
    public TelaLogin() {
        initComponents();
        
        con.getConnection();
    }

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1Acessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1Nome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1Acessar.setBackground(new java.awt.Color(102, 255, 102));
        jButton1Acessar.setText("Acessar");
        jButton1Acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AcessarActionPerformed(evt);
            }
        });
        jButton1Acessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1AcessarKeyPressed(evt);
            }
        });
        getContentPane().add(jButton1Acessar);
        jButton1Acessar.setBounds(230, 190, 71, 23);

        jButtonSair.setBackground(new java.awt.Color(255, 6, 6));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(320, 190, 70, 23);

        jLabel1Nome.setText("Nome");
        getContentPane().add(jLabel1Nome);
        jLabel1Nome.setBounds(180, 70, 50, 20);

        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 120, 50, 20);

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(230, 70, 160, 30);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(230, 120, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logot.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 80, 100, 100);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo (1).jpg"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 524, 321);

        setSize(new java.awt.Dimension(539, 360));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0); // fechar tela de login por completo
       
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButton1AcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AcessarActionPerformed

        try {
            con.executeSql("select *from usuarios where  usu_nome='"+jTextFieldNome.getText()+"'");
            con.rs.first();
            if(con.rs.getString("usu_senha").equals(jPasswordFieldSenha.getText())){
                TelaPrincipal tela= new TelaPrincipal(jTextFieldNome.getText());
                tela.setVisible(true);
                dispose();
                
            }else{
                JOptionPane.showMessageDialog(null, "Senha ou Usuario invalidos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Senha ou Usuario invalidos");
        }
        
    }//GEN-LAST:event_jButton1AcessarActionPerformed

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
if(evt.getKeyCode()==evt.VK_ENTER){
    jPasswordFieldSenha.requestFocus();
    
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
 
      
// TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed
       if(evt.getKeyCode()==evt.VK_ENTER){
    jPasswordFieldSenha.requestFocus();
    
}  
      
    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

    private void jButton1AcessarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1AcessarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1AcessarKeyPressed

   
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Acessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Nome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
