/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PacoteInterfaceVisual;

/**
 *
 * @author CaioFSX
 */
public class PaginaConfirmarCodigoEmail extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceVisual
     */
    public PaginaConfirmarCodigoEmail() {
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

        JPanelPedirSenha = new javax.swing.JPanel();
        InformeSuaSenha = new javax.swing.JTextField();
        CampoInserirSenha = new javax.swing.JTextField();
        BotaoEntrarSenha = new javax.swing.JButton();
        PainelLogoPedirSenha = new javax.swing.JPanel();
        TituloBancoJava = new javax.swing.JTextField();
        ImagemLogoJava = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        JPanelPedirSenha.setBackground(new java.awt.Color(255, 255, 255));

        InformeSuaSenha.setEditable(false);
        InformeSuaSenha.setBackground(new java.awt.Color(255, 255, 255));
        InformeSuaSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        InformeSuaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InformeSuaSenha.setText("Digite o código de 4 dígitos que enviamos para seu e-mail:");
        InformeSuaSenha.setBorder(null);
        InformeSuaSenha.setFocusable(false);
        InformeSuaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformeSuaSenhaActionPerformed(evt);
            }
        });

        CampoInserirSenha.setText(" 0000");
        CampoInserirSenha.setToolTipText("");
        CampoInserirSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoInserirSenhaActionPerformed(evt);
            }
        });

        BotaoEntrarSenha.setBackground(new java.awt.Color(204, 0, 0));
        BotaoEntrarSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoEntrarSenha.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrarSenha.setText("Confirmar");
        BotaoEntrarSenha.setBorderPainted(false);
        BotaoEntrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelPedirSenhaLayout = new javax.swing.GroupLayout(JPanelPedirSenha);
        JPanelPedirSenha.setLayout(JPanelPedirSenhaLayout);
        JPanelPedirSenhaLayout.setHorizontalGroup(
            JPanelPedirSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPedirSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelPedirSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelPedirSenhaLayout.createSequentialGroup()
                        .addComponent(CampoInserirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addComponent(InformeSuaSenha))
                .addContainerGap())
            .addGroup(JPanelPedirSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelPedirSenhaLayout.createSequentialGroup()
                    .addContainerGap(112, Short.MAX_VALUE)
                    .addComponent(BotaoEntrarSenha)
                    .addGap(114, 114, 114)))
        );
        JPanelPedirSenhaLayout.setVerticalGroup(
            JPanelPedirSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPedirSenhaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InformeSuaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoInserirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
            .addGroup(JPanelPedirSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelPedirSenhaLayout.createSequentialGroup()
                    .addContainerGap(356, Short.MAX_VALUE)
                    .addComponent(BotaoEntrarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)))
        );

        PainelLogoPedirSenha.setBackground(new java.awt.Color(204, 0, 0));

        TituloBancoJava.setEditable(false);
        TituloBancoJava.setBackground(new java.awt.Color(204, 0, 0));
        TituloBancoJava.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TituloBancoJava.setForeground(new java.awt.Color(255, 255, 255));
        TituloBancoJava.setText("Banco JAVA");
        TituloBancoJava.setBorder(null);
        TituloBancoJava.setFocusable(false);
        TituloBancoJava.setSelectedTextColor(new java.awt.Color(242, 242, 242));
        TituloBancoJava.setSelectionColor(new java.awt.Color(242, 242, 242));
        TituloBancoJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloBancoJavaActionPerformed(evt);
            }
        });

        ImagemLogoJava.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\sistema-bancario\\src\\main\\resources\\images\\java-logo-black-and-white-1.png")); // NOI18N
        ImagemLogoJava.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout PainelLogoPedirSenhaLayout = new javax.swing.GroupLayout(PainelLogoPedirSenha);
        PainelLogoPedirSenha.setLayout(PainelLogoPedirSenhaLayout);
        PainelLogoPedirSenhaLayout.setHorizontalGroup(
            PainelLogoPedirSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLogoPedirSenhaLayout.createSequentialGroup()
                .addGroup(PainelLogoPedirSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLogoPedirSenhaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(TituloBancoJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelLogoPedirSenhaLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(ImagemLogoJava)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        PainelLogoPedirSenhaLayout.setVerticalGroup(
            PainelLogoPedirSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLogoPedirSenhaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TituloBancoJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(ImagemLogoJava, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PainelLogoPedirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPanelPedirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelLogoPedirSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelPedirSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TituloBancoJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloBancoJavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloBancoJavaActionPerformed

    private void InformeSuaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformeSuaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InformeSuaSenhaActionPerformed

    private void CampoInserirSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoInserirSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoInserirSenhaActionPerformed

    private void BotaoEntrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoEntrarSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaConfirmarCodigoEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaConfirmarCodigoEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaConfirmarCodigoEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaConfirmarCodigoEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaginaConfirmarCodigoEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrarSenha;
    private javax.swing.JTextField CampoInserirSenha;
    private javax.swing.JLabel ImagemLogoJava;
    private javax.swing.JTextField InformeSuaSenha;
    private javax.swing.JPanel JPanelPedirSenha;
    private javax.swing.JPanel PainelLogoPedirSenha;
    private javax.swing.JTextField TituloBancoJava;
    // End of variables declaration//GEN-END:variables
}
