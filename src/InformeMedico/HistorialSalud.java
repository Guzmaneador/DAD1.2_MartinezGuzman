
package InformeMedico;

/**
 *
 * @author Vulture
 */
public class HistorialSalud extends javax.swing.JFrame {
    Paciente paciente ;
    /**
     * Creates new form HistorialSalud
     */
    public HistorialSalud(Paciente paciente) {
        initComponents();
        this.paciente=paciente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        guardarButton = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        siAlergiasRadioButton = new javax.swing.JRadioButton();
        VacunasLabel = new javax.swing.JLabel();
        noAlergiasRadioButton = new javax.swing.JRadioButton();
        siVacunasRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        alergiasPanel2 = new javax.swing.JPanel();
        cacahuetesBox2 = new javax.swing.JCheckBox();
        sojaBox2 = new javax.swing.JCheckBox();
        lacteosBox2 = new javax.swing.JCheckBox();
        mariscoBox2 = new javax.swing.JCheckBox();
        penicilinaBox2 = new javax.swing.JCheckBox();
        otrosBox2 = new javax.swing.JCheckBox();
        alergiasTextField2 = new javax.swing.JTextField();
        latexBox2 = new javax.swing.JCheckBox();
        noVacunasRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enfermedadesArea = new javax.swing.JTextArea();
        vacunasPanel = new javax.swing.JPanel();
        rabicaBox = new javax.swing.JCheckBox();
        viruelaBox = new javax.swing.JCheckBox();
        sarampionBox = new javax.swing.JCheckBox();
        virusBox = new javax.swing.JCheckBox();
        rubeolaBox = new javax.swing.JCheckBox();
        otrasVacunasBox = new javax.swing.JCheckBox();
        vacunasTextField = new javax.swing.JTextField();
        fiebreBox = new javax.swing.JCheckBox();
        borrarButtom = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("HISTORIAL FAMILIAR DEL PACIENTE");

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Alergias:");

        siAlergiasRadioButton.setText("Sí");
        siAlergiasRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siAlergiasRadioButtonActionPerformed(evt);
            }
        });

        VacunasLabel.setText("Infeciones Frecuentes:");

        noAlergiasRadioButton.setSelected(true);
        noAlergiasRadioButton.setText("No");
        noAlergiasRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noAlergiasRadioButtonActionPerformed(evt);
            }
        });

        siVacunasRadioButton.setText("Sí");
        siVacunasRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siVacunasRadioButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Enfermedades Frecuentes:");

        alergiasPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        alergiasPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                alergiasPanel2ComponentHidden(evt);
            }
        });

        cacahuetesBox2.setText("Cacahuetes");
        cacahuetesBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cacahuetesBox2ActionPerformed(evt);
            }
        });

        sojaBox2.setText("Soja");

        lacteosBox2.setText("Lacteos");
        lacteosBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lacteosBox2ActionPerformed(evt);
            }
        });

        mariscoBox2.setText("Marisco");

        penicilinaBox2.setText("Penicilina");

        otrosBox2.setText("Otros:");

        alergiasTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergiasTextField2ActionPerformed(evt);
            }
        });

        latexBox2.setText("Latex");

        javax.swing.GroupLayout alergiasPanel2Layout = new javax.swing.GroupLayout(alergiasPanel2);
        alergiasPanel2.setLayout(alergiasPanel2Layout);
        alergiasPanel2Layout.setHorizontalGroup(
            alergiasPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alergiasPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alergiasPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cacahuetesBox2)
                    .addComponent(sojaBox2))
                .addGap(18, 18, 18)
                .addGroup(alergiasPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mariscoBox2)
                    .addComponent(lacteosBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alergiasPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alergiasPanel2Layout.createSequentialGroup()
                        .addComponent(otrosBox2)
                        .addGap(18, 18, 18)
                        .addComponent(alergiasTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(alergiasPanel2Layout.createSequentialGroup()
                        .addComponent(penicilinaBox2)
                        .addGap(28, 28, 28)
                        .addComponent(latexBox2)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        alergiasPanel2Layout.setVerticalGroup(
            alergiasPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alergiasPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alergiasPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cacahuetesBox2)
                    .addComponent(lacteosBox2)
                    .addComponent(penicilinaBox2)
                    .addComponent(latexBox2))
                .addGap(18, 18, 18)
                .addGroup(alergiasPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sojaBox2)
                    .addComponent(mariscoBox2)
                    .addComponent(otrosBox2)
                    .addComponent(alergiasTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        noVacunasRadioButton.setSelected(true);
        noVacunasRadioButton.setText("No");
        noVacunasRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noVacunasRadioButtonActionPerformed(evt);
            }
        });

        enfermedadesArea.setColumns(20);
        enfermedadesArea.setRows(5);
        jScrollPane1.setViewportView(enfermedadesArea);

        vacunasPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vacunasPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                vacunasPanelComponentHidden(evt);
            }
        });

        rabicaBox.setText("Bacteriana");
        rabicaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabicaBoxActionPerformed(evt);
            }
        });

        viruelaBox.setText("Virica");

        sarampionBox.setText("Por hongos");
        sarampionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sarampionBoxActionPerformed(evt);
            }
        });

        virusBox.setText("Parasitas");

        rubeolaBox.setText("Falta Higiene");

        otrasVacunasBox.setText("Otras:");

        vacunasTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacunasTextFieldActionPerformed(evt);
            }
        });

        fiebreBox.setText(" asociadas a la asistencia sanitaria");

        javax.swing.GroupLayout vacunasPanelLayout = new javax.swing.GroupLayout(vacunasPanel);
        vacunasPanel.setLayout(vacunasPanelLayout);
        vacunasPanelLayout.setHorizontalGroup(
            vacunasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vacunasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vacunasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rabicaBox)
                    .addComponent(viruelaBox))
                .addGap(18, 18, 18)
                .addGroup(vacunasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(virusBox)
                    .addComponent(sarampionBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vacunasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vacunasPanelLayout.createSequentialGroup()
                        .addComponent(otrasVacunasBox)
                        .addGap(18, 18, 18)
                        .addComponent(vacunasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vacunasPanelLayout.createSequentialGroup()
                        .addComponent(rubeolaBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fiebreBox)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vacunasPanelLayout.setVerticalGroup(
            vacunasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vacunasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vacunasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rabicaBox)
                    .addComponent(sarampionBox)
                    .addComponent(rubeolaBox)
                    .addComponent(fiebreBox))
                .addGap(18, 18, 18)
                .addGroup(vacunasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viruelaBox)
                    .addComponent(virusBox)
                    .addComponent(otrasVacunasBox)
                    .addComponent(vacunasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        borrarButtom.setText("Borrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(38, 38, 38)
                                        .addComponent(siAlergiasRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(VacunasLabel)
                                        .addGap(37, 37, 37)
                                        .addComponent(siVacunasRadioButton)))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noVacunasRadioButton)
                                    .addComponent(noAlergiasRadioButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(borrarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(guardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(alergiasPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vacunasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(25, 25, 25))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(siAlergiasRadioButton)
                    .addComponent(noAlergiasRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alergiasPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VacunasLabel)
                    .addComponent(siVacunasRadioButton)
                    .addComponent(noVacunasRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vacunasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrarButtom)
                    .addComponent(guardarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        GUI gui = new GUI();
        gui.setPaciente(paciente);
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        String alergias="";
        if(siAlergiasRadioButton.isSelected()){
           // alergias=analizarAlergias();
        }else if(noAlergiasRadioButton.isSelected()){
            alergias="No tiene Alergias";
        }
        paciente.setAlergias(alergias);
        //--VACUNAS--//
        String vacunas="";
        if(siVacunasRadioButton.isSelected()){
            //vacunas = analizarVacunas();
        }else if(noVacunasRadioButton.isSelected()){
            vacunas = "Nos esta vacunado";
        }
        paciente.setVacunas(vacunas);

        paciente.setEnfermedadesFrecuentes(enfermedadesArea.getText());

    }//GEN-LAST:event_guardarButtonActionPerformed

    private void siAlergiasRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siAlergiasRadioButtonActionPerformed
        alergiasPanel.setVisible(true);
    }//GEN-LAST:event_siAlergiasRadioButtonActionPerformed

    private void noAlergiasRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noAlergiasRadioButtonActionPerformed
        alergiasPanel.setVisible(false);
    }//GEN-LAST:event_noAlergiasRadioButtonActionPerformed

    private void siVacunasRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siVacunasRadioButtonActionPerformed
        vacunasPanel.setVisible(true);
    }//GEN-LAST:event_siVacunasRadioButtonActionPerformed

    private void cacahuetesBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cacahuetesBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cacahuetesBox2ActionPerformed

    private void lacteosBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lacteosBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lacteosBox2ActionPerformed

    private void alergiasTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergiasTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergiasTextField2ActionPerformed

    private void alergiasPanel2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_alergiasPanel2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_alergiasPanel2ComponentHidden

    private void noVacunasRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noVacunasRadioButtonActionPerformed
        vacunasPanel.setVisible(false);
    }//GEN-LAST:event_noVacunasRadioButtonActionPerformed

    private void rabicaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rabicaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rabicaBoxActionPerformed

    private void sarampionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarampionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sarampionBoxActionPerformed

    private void vacunasTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacunasTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacunasTextFieldActionPerformed

    private void vacunasPanelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_vacunasPanelComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_vacunasPanelComponentHidden

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HistorialSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HistorialSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HistorialSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HistorialSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HistorialSalud().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VacunasLabel;
    private javax.swing.JPanel alergiasPanel;
    private javax.swing.JPanel alergiasPanel1;
    private javax.swing.JPanel alergiasPanel2;
    private javax.swing.JTextField alergiasTextField;
    private javax.swing.JTextField alergiasTextField1;
    private javax.swing.JTextField alergiasTextField2;
    private javax.swing.JToggleButton borrarButtom;
    private javax.swing.JCheckBox cacahuetesBox;
    private javax.swing.JCheckBox cacahuetesBox1;
    private javax.swing.JCheckBox cacahuetesBox2;
    private javax.swing.JTextArea enfermedadesArea;
    private javax.swing.JCheckBox fiebreBox;
    private javax.swing.JToggleButton guardarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox lacteosBox;
    private javax.swing.JCheckBox lacteosBox1;
    private javax.swing.JCheckBox lacteosBox2;
    private javax.swing.JCheckBox latexBox;
    private javax.swing.JCheckBox latexBox1;
    private javax.swing.JCheckBox latexBox2;
    private javax.swing.JCheckBox mariscoBox;
    private javax.swing.JCheckBox mariscoBox1;
    private javax.swing.JCheckBox mariscoBox2;
    private javax.swing.JRadioButton noAlergiasRadioButton;
    private javax.swing.JRadioButton noVacunasRadioButton;
    private javax.swing.JCheckBox otrasVacunasBox;
    private javax.swing.JCheckBox otrosBox;
    private javax.swing.JCheckBox otrosBox1;
    private javax.swing.JCheckBox otrosBox2;
    private javax.swing.JCheckBox penicilinaBox;
    private javax.swing.JCheckBox penicilinaBox1;
    private javax.swing.JCheckBox penicilinaBox2;
    private javax.swing.JCheckBox rabicaBox;
    private javax.swing.JCheckBox rubeolaBox;
    private javax.swing.JCheckBox sarampionBox;
    private javax.swing.JRadioButton siAlergiasRadioButton;
    private javax.swing.JRadioButton siVacunasRadioButton;
    private javax.swing.JCheckBox sojaBox;
    private javax.swing.JCheckBox sojaBox1;
    private javax.swing.JCheckBox sojaBox2;
    private javax.swing.JPanel vacunasPanel;
    private javax.swing.JTextField vacunasTextField;
    private javax.swing.JCheckBox viruelaBox;
    private javax.swing.JCheckBox virusBox;
    // End of variables declaration//GEN-END:variables
}
