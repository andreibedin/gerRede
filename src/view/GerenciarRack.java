
package view;

import controller.RackController;
import javax.swing.table.DefaultTableModel;
import model.Rack;


public class GerenciarRack extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private Rack atual;
    private RackController controller = new RackController();
    
    public GerenciarRack() {
        initComponents();
        
        initTable();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPGerenciarRack = new javax.swing.JPanel();
        jLNome = new javax.swing.JLabel();
        jLSetor = new javax.swing.JLabel();
        jLUnidade = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFSetor = new javax.swing.JTextField();
        jTFUnidade = new javax.swing.JTextField();
        jBIncluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPGerenciarRack.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Rack"));

        jLNome.setText("NOME:");

        jLSetor.setText("SETOR:");

        jLUnidade.setText("UNIDADE:");

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jBIncluir.setText("INCLUIR");
        jBIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncluirActionPerformed(evt);
            }
        });

        jBAlterar.setText("ALTERAR");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBExcluir.setText("EXCLUIR");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Racks Cadastrados"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Setor", "Unidade"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jBVoltar.setText("VOLTAR");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPGerenciarRackLayout = new javax.swing.GroupLayout(jPGerenciarRack);
        jPGerenciarRack.setLayout(jPGerenciarRackLayout);
        jPGerenciarRackLayout.setHorizontalGroup(
            jPGerenciarRackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPGerenciarRackLayout.createSequentialGroup()
                .addGroup(jPGerenciarRackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPGerenciarRackLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPGerenciarRackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLSetor)
                            .addComponent(jLNome))
                        .addGap(28, 28, 28)
                        .addGroup(jPGerenciarRackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNome)
                            .addComponent(jTFSetor, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addComponent(jLUnidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPGerenciarRackLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jBIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBVoltar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPGerenciarRackLayout.setVerticalGroup(
            jPGerenciarRackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGerenciarRackLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPGerenciarRackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPGerenciarRackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSetor)
                    .addComponent(jTFUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUnidade))
                .addGap(50, 50, 50)
                .addGroup(jPGerenciarRackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIncluir)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir)
                    .addComponent(jBVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGerenciarRack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPGerenciarRack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirActionPerformed
       Rack rack = new Rack();
       
       rack.setNome(String.valueOf(jTFNome.getText()));
       rack.setSetor(String.valueOf(jTFSetor.getText()));
       rack.setUnidade(String.valueOf(jTFUnidade.getText()));

       controller.adicionaRack(rack);

       initTable();
    }//GEN-LAST:event_jBIncluirActionPerformed

     private void initTable() {
        dtm = new DefaultTableModel();
        
        dtm.addColumn("Nome");
        dtm.addColumn("Numero");
        dtm.addColumn("Setor");
        dtm.addColumn("Unidade");
        
        for(Rack rack : controller.getListaRack()) {
            dtm.addRow(new String[] { rack.getNome(), String.valueOf(rack.getNumero()),rack.getSetor(), rack.getUnidade()});
        }
        
        jTable1.setModel(dtm);
    }
    
    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
		if(atual != null) {
			atual.setNome(jTFNome.getText());
			atual.setSetor(jTFSetor.getText());
			atual.setUnidade(jTFUnidade.getText());
			controller.alteraRack(atual);			
		}
    }//GEN-LAST:event_jBAlterarActionPerformed
	
	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
		atual = controller.getListaRack().get(jTable1.getSelectedRow());
       
                jTFNome.setText(atual.getNome());
                jTFSetor.setText(atual.getSetor());
                jTFUnidade.setText(atual.getUnidade()); 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        controller.removeRack(jTable1.getSelectedRow());
        initTable();
    }//GEN-LAST:event_jBExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBIncluir;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLSetor;
    private javax.swing.JLabel jLUnidade;
    private javax.swing.JPanel jPGerenciarRack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFSetor;
    private javax.swing.JTextField jTFUnidade;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
