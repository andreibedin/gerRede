
package view;

import controller.PortaController;
import javax.swing.table.DefaultTableModel;
import model.Portas;
import model.Switch;


public class GerenciarPortas extends javax.swing.JFrame {

    private Portas atual;
    private PortaController controller = new PortaController();
    private DefaultTableModel dtm = new DefaultTableModel();
    
    public GerenciarPortas() {
        initComponents();
        controller.populaListas();
        
        initTable();
              
        for(Switch sw : controller.getListaSwitch()) { 
            jComboBoxnSwitch.addItem(sw.getNome());
        }
    }
    
     private void initTable() {
        dtm = new DefaultTableModel();
         
        dtm.addColumn("Nome SW");
        dtm.addColumn("Numero Porta");
        dtm.addColumn("Vlan");
        dtm.addColumn("Status");
        
        for(Portas porta : controller.getListaPortas()) {
            dtm.addRow(new String[] { 
                buscaNomeSwitch(porta.getIdSwitch()),
                String.valueOf(porta.getNumPorta()), 
                String.valueOf(porta.getVlan()), 
                String.valueOf(porta.getStatus())});
        }
               
        jTable1.setModel(dtm);
    }
     
    private String buscaNomeSwitch(int idSwitch) {
        for(Switch sw : controller.getListaSwitch()) {
            if(sw.getNumero() == idSwitch) {
                return sw.getNome();
            }
        }
        
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLnSwitch = new javax.swing.JLabel();
        jLnPorta = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jLVlan = new javax.swing.JLabel();
        jTFnPorta = new javax.swing.JTextField();
        jComboBoxStatus = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBIncluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jComboBoxnSwitch = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Portas"));

        jLnSwitch.setText("Nome Switch:");

        jLnPorta.setText("Nº Porta:");

        jLStatus.setText("Status:");

        jLVlan.setText("Vlan:");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UP", "DOWN", "BLOCKED" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "80", "180", "280", "300", "420", " " }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Portas Cadastradas"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome SW", "Numero", "Vlan", "Status"
            }
        ));
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });		
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jBIncluir.setText("INCLUIR");
        jBIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncluirActionPerformed(evt);
            }
        });

        jBAlterar.setText("ALTERAR");

        jBExcluir.setText("EXCLUIR");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBVoltar.setText("VOLTAR");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jComboBoxnSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxnSwitchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLVlan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jLStatus)
                        .addGap(45, 45, 45)
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLnSwitch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLnPorta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFnPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(79, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jBIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVoltar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLnSwitch)
                        .addComponent(jLnPorta)
                        .addComponent(jTFnPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVlan)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLStatus)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIncluir)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir)
                    .addComponent(jBVoltar))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        atual = controller.getListaPortas().get(jTable1.getSelectedRow());
        Switch sw = buscaSwitch(atual);
			
		jTFnPorta.setText(atual.getNumPorta());
                			
		for(int i = 0; i < jComboBox2.getItemCount(); i++) {
			if((String) jComboBox2.getItemAt(i) == atual.getVlan()) {
				jComboBox2.setSelectedIndex(i);
			}
		}	
			
        for(int i = 0; i < jComboBoxStatus.getItemCount(); i++) {
			if((String) jComboBoxStatus.getItemAt(i) == atual.getStatus()) {
				jComboBoxStatus.setSelectedIndex(i);
			}
		}

        for(int i = 0; i < jComboBoxnSwitch.getItemCount(); i++) {
            if((String) jComboBoxnSwitch.getItemAt(i) == sw.getNome()) {
                jComboBoxnSwitch.setSelectedIndex(i);
            }
        }    
    }//GEN-LAST:event_jTable1MouseClicked
	
	private Switch buscaSwitch(Portas atual) {
        for(Switch sw : controller.getListaSwitch()) {
            if(sw.getNumero() == atual.getIdSwitch()) {
                return sw;
            }
        }
        
        return null;
    }
	
	private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
		if(atual != null) {
			atual.setIdSwitch(controller.getListaSwitch().get(jComboBoxnSwitch.getSelectedIndex()).getNumero());
			atual.setStatus(jComboBoxStatus.getSelectedItem().toString());
			atual.setNumPorta(Integer.valueOf(jTFnPorta.getText()));
			atual.setVlan(Integer.valueOf(jComboBox2.getSelectedItem().toString()));
		}      
		
        controller.atualizaPorta(atual);
		
		initTable();
    }//GEN-LAST:event_jBAlterarActionPerformed
	
    private void jBIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirActionPerformed
       Portas porta = new Portas();
       
       porta.setIdSwitch(controller.getListaSwitch().get(jComboBoxnSwitch.getSelectedIndex()).getNumero());
       porta.setStatus(jComboBoxStatus.getSelectedItem().toString());
       porta.setNumPorta(Integer.valueOf(jTFnPorta.getText()));
       porta.setVlan(Integer.valueOf(jComboBox2.getSelectedItem().toString()));
       
       controller.adicionaPortas(porta);
       
        initTable();
    }//GEN-LAST:event_jBIncluirActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jComboBoxnSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxnSwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxnSwitchActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        controller.removePorta(jTable1.getSelectedRow());
        initTable();
    }//GEN-LAST:event_jBExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBIncluir;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBoxStatus;
    private javax.swing.JComboBox jComboBoxnSwitch;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLVlan;
    private javax.swing.JLabel jLnPorta;
    private javax.swing.JLabel jLnSwitch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFnPorta;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
