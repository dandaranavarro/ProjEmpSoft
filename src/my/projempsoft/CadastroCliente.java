/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.projempsoft;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Dandara
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        logo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoPesquisar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/b1se.png"))); // NOI18N
        jButton1.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/b1se.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        getContentPane().add(jButton3);
        jButton3.setBounds(140, 230, 370, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/b2se.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 280, 330, 70);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/b3se.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        getContentPane().add(jButton4);
        jButton4.setBounds(160, 330, 330, 90);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/b4se.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        getContentPane().add(jButton5);
        jButton5.setBounds(160, 410, 330, 50);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/b5se.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(150, 460, 350, 80);

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/LogomarcaP.png"))); // NOI18N
        getContentPane().add(logo1);
        logo1.setBounds(670, 180, 154, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/tela clara.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(650, 160, 390, 420);

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/pesquisar. cad produtos - Cópia.png"))); // NOI18N
        botaoPesquisar.setContentAreaFilled(false);
        botaoPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPesquisar);
        botaoPesquisar.setBounds(760, 610, 140, 50);

        botaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/b7se - Cópia_1.png"))); // NOI18N
        botaoCadastrar.setContentAreaFilled(false);
        getContentPane().add(botaoCadastrar);
        botaoCadastrar.setBounds(900, 610, 140, 50);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Cadastro de Clientes");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 20, 500, 70);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projempsoft/images/background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 1160, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo1;
    // End of variables declaration//GEN-END:variables

    
}