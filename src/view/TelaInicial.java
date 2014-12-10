/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author cpd_andrei
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBGerenciarRack = new javax.swing.JButton();
        jBGerenciarSwitch = new javax.swing.JButton();
        jBGerenciarPortas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBGerenciarRack.setText("Gerenciar Rack");
        jBGerenciarRack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerenciarRackActionPerformed(evt);
            }
        });

        jBGerenciarSwitch.setText("Gerenciar Switch");
        jBGerenciarSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerenciarSwitchActionPerformed(evt);
            }
        });

        jBGerenciarPortas.setText("Gerenciar Portas");
        jBGerenciarPortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerenciarPortasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBGerenciarRack, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jBGerenciarPortas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBGerenciarSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jBGerenciarRack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBGerenciarSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBGerenciarPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGerenciarRackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerenciarRackActionPerformed
        GerenciarRack telaRack = new GerenciarRack();
        telaRack.setVisible(true);
    }//GEN-LAST:event_jBGerenciarRackActionPerformed

    private void jBGerenciarSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerenciarSwitchActionPerformed
        GerenciarSwitch telaSwitch = new GerenciarSwitch();
        telaSwitch.setVisible(true);
    }//GEN-LAST:event_jBGerenciarSwitchActionPerformed

    private void jBGerenciarPortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerenciarPortasActionPerformed
       GerenciarPortas telaPortas = new GerenciarPortas();
       telaPortas.setVisible(true);
    }//GEN-LAST:event_jBGerenciarPortasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGerenciarPortas;
    private javax.swing.JButton jBGerenciarRack;
    private javax.swing.JButton jBGerenciarSwitch;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
