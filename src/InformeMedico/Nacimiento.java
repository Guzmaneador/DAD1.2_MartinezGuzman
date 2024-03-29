package InformeMedico;

/**
 *
 * @author Vulture
 */
public class Nacimiento extends javax.swing.JFrame {
    Paciente paciente;
    /**
     * Creates new form DatosContacto
     */
    public Nacimiento(Paciente paciente) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        problemasLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        problemasTextArea = new javax.swing.JTextArea();
        tipoPartoLabel = new javax.swing.JLabel();
        naturalRadioButton = new javax.swing.JRadioButton();
        cesariaRadioButton = new javax.swing.JRadioButton();
        semanasLabel = new javax.swing.JLabel();
        semanasSpinner = new javax.swing.JSpinner();
        borrarButton = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("DATOS DE NACIMIENTO DEL PACIENTE");

        problemasLabel.setText("Problemas en el embarazo/nacimiento:");

        problemasTextArea.setColumns(20);
        problemasTextArea.setRows(5);
        jScrollPane1.setViewportView(problemasTextArea);

        tipoPartoLabel.setText("Tipo de parto:");

        buttonGroup1.add(naturalRadioButton);
        naturalRadioButton.setText("Natural");
        naturalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naturalRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(cesariaRadioButton);
        cesariaRadioButton.setText("Cesaria");

        semanasLabel.setText("Semanas de embarazo");

        borrarButton.setText("Borrar");

        guardarButton.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(borrarButton)
                .addGap(136, 136, 136)
                .addComponent(guardarButton)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tipoPartoLabel)
                        .addGap(14, 14, 14)
                        .addComponent(naturalRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(cesariaRadioButton)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(semanasLabel)
                                    .addComponent(problemasLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(semanasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoPartoLabel)
                    .addComponent(naturalRadioButton)
                    .addComponent(cesariaRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semanasLabel)
                    .addComponent(semanasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 87, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(problemasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardarButton)
                            .addComponent(borrarButton))
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void naturalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naturalRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naturalRadioButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        GUI gui = new GUI();
        gui.setPaciente(paciente);
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

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
//            java.util.logging.Logger.getLogger(Nacimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Nacimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Nacimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Nacimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Nacimiento().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cesariaRadioButton;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton naturalRadioButton;
    private javax.swing.JLabel problemasLabel;
    private javax.swing.JTextArea problemasTextArea;
    private javax.swing.JLabel semanasLabel;
    private javax.swing.JSpinner semanasSpinner;
    private javax.swing.JLabel tipoPartoLabel;
    // End of variables declaration//GEN-END:variables
}
