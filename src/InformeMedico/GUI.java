package InformeMedico;

import file_manager.FileManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author munchi
 */
public class GUI extends javax.swing.JFrame {
    Paciente paciente;
    ArrayList<String> datosPaciente=new ArrayList<>();
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        paciente = new Paciente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        nombreFichero = new javax.swing.JTextField();
        barraMenu = new javax.swing.JMenuBar();
        pacienteOpcionMenu = new javax.swing.JMenu();
        datosPacienteMenuItem = new javax.swing.JMenuItem();
        nacimientoMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        historialSaludMenuItem = new javax.swing.JMenuItem();
        historialFamiliarMenuItem = new javax.swing.JMenuItem();
        salirMenuItem = new javax.swing.JMenuItem();
        opcionInfoMenu = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tlwg Typist", 1, 24)); // NOI18N
        jLabel1.setText("DAD1.2 INFORME MEDICO");

        jButton1.setText("Generar Informe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nimbus Mono L", 2, 12)); // NOI18N
        jLabel2.setText("Guzmán Martínez Santos");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InformeMedico/LogoCesar.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pacienteOpcionMenu.setText("Paciente");

        datosPacienteMenuItem.setText("Datos Paciente");
        datosPacienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosPacienteMenuItemActionPerformed(evt);
            }
        });
        pacienteOpcionMenu.add(datosPacienteMenuItem);

        nacimientoMenuItem1.setText("Nacimiento");
        nacimientoMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacimientoMenuItem1ActionPerformed(evt);
            }
        });
        pacienteOpcionMenu.add(nacimientoMenuItem1);

        jMenu4.setText("Historial");

        historialSaludMenuItem.setText("Historial de salud");
        historialSaludMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialSaludMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(historialSaludMenuItem);

        historialFamiliarMenuItem.setText("Historial familiar");
        historialFamiliarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialFamiliarMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(historialFamiliarMenuItem);

        pacienteOpcionMenu.add(jMenu4);

        salirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        pacienteOpcionMenu.add(salirMenuItem);

        barraMenu.add(pacienteOpcionMenu);

        opcionInfoMenu.setText("Info");
        barraMenu.add(opcionInfoMenu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(nombreFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(nombreFichero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nacimientoMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacimientoMenuItem1ActionPerformed
        Nacimiento nacimiento = new Nacimiento(paciente);
        nacimiento.setVisible(true);
        nacimiento.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_nacimientoMenuItem1ActionPerformed

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirMenuItemActionPerformed

    private void datosPacienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosPacienteMenuItemActionPerformed
        DatosPaciente datosPaciente = new DatosPaciente(paciente);
        datosPaciente.setVisible(true);//abre la ventana
        datosPaciente.setLocationRelativeTo(null);//hace que La ventana salga Centrada
        this.dispose();//hace que la ventana se cierre al abirir la otra
    }//GEN-LAST:event_datosPacienteMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
            extraerDatosPaciente();
            //System.out.println(FileManager.filesList());
            //if(FileManager.exists("datosPacientes"+paciente.getNombre())){
                System.out.println("Esta Paciente ya tiene un informe");
            //}else{
                    FileManager.saveFile("datosPacientes"+paciente.getNombre(), datosPaciente);
            //}
        } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void historialFamiliarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialFamiliarMenuItemActionPerformed
        HistorialFamiliar historialFamiliar = new HistorialFamiliar(paciente);
        historialFamiliar.setVisible(true);
        historialFamiliar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_historialFamiliarMenuItemActionPerformed

    private void historialSaludMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialSaludMenuItemActionPerformed
        HistorialSalud historialSalud = new HistorialSalud(paciente);
        historialSalud.setVisible(true);
        historialSalud.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_historialSaludMenuItemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            obtenerDatosPaciente(nombreFichero.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    private void extraerDatosPaciente(){
        if(paciente.getNombre() != null)
            datosPaciente.add(paciente.getNombre());        
        if(paciente.getApellidos() != null)        
            datosPaciente.add(paciente.getApellidos());          
        if(paciente.getFecha() != null)   
            datosPaciente.add(paciente.getFecha());       
        if(paciente.getIdioma() != null)
            datosPaciente.add(paciente.getIdioma());       
        if(paciente.getSexo() != null)
            datosPaciente.add(paciente.getSexo());
        if(paciente.getResidencia() != null)
            datosPaciente.add(paciente.getResidencia());
        if(paciente.getTrabajo() != null)
            datosPaciente.add(paciente.getTrabajo());
        if(paciente.getTelefono() != null)
            datosPaciente.add(paciente.getTelefono());
        if(paciente.getCorreo() != null)
            datosPaciente.add(paciente.getCorreo());
        if(paciente.getPersonasConvive() != null)
            datosPaciente.add(paciente.getPersonasConvive());
        if(paciente.getTipoVivienda() != null)
            datosPaciente.add(paciente.getTipoVivienda());
        if(paciente.getTipoMascota() != null)
            datosPaciente.add(paciente.getTipoMascota());
        if(paciente.getEmpleo() != null)
            datosPaciente.add(paciente.getEmpleo());
        if(paciente.getAnhosEmpleo() != null)
            datosPaciente.add(paciente.getAnhosEmpleo());
        if(paciente.getEmpleosRiego() != null)
            datosPaciente.add(paciente.getEmpleosRiego());
        if(paciente.getAlergias() != null)
            datosPaciente.add(paciente.getAlergias());
        if(paciente.getVacunas() != null)
            datosPaciente.add(paciente.getVacunas());
        if(paciente.getEnfermedadesFrecuentes() != null)
            datosPaciente.add(paciente.getEnfermedadesFrecuentes());
        
            datosPaciente.add(paciente.getAlergias());
            datosPaciente.add(paciente.getVacunas());
            datosPaciente.add(paciente.getEnfermedadesFrecuentes());
       
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    public void obtenerDatosPaciente(String fileName) throws FileNotFoundException{
        ArrayList<String> datosFichero =FileManager.readFile(fileName);
        paciente.setNombre(datosFichero.get(0));
        paciente.setApellidos(datosFichero.get(1));
        paciente.setFecha(datosFichero.get(2));
        paciente.setIdioma(datosFichero.get(3));
        paciente.setSexo(datosFichero.get(4));
        paciente.setResidencia(datosFichero.get(5));
        paciente.setTrabajo(datosFichero.get(6));
        paciente.setTelefono(datosFichero.get(7));
        paciente.setCorreo(datosFichero.get(8));
        paciente.setPersonasConvive(datosFichero.get(9));
        paciente.setTipoVivienda(datosFichero.get(10));
       //paciente.setMacotas(datosFichero.get(11));
        paciente.setTipoMascota(datosFichero.get(11));
        ///-----
        paciente.setAlergias(datosFichero.get(12));
        paciente.setVacunas(datosFichero.get(13));
        paciente.setEnfermedadesFrecuentes(datosFichero.get(14));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem datosPacienteMenuItem;
    private javax.swing.JMenuItem historialFamiliarMenuItem;
    private javax.swing.JMenuItem historialSaludMenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem nacimientoMenuItem1;
    private javax.swing.JTextField nombreFichero;
    private javax.swing.JMenu opcionInfoMenu;
    private javax.swing.JMenu pacienteOpcionMenu;
    private javax.swing.JMenuItem salirMenuItem;
    // End of variables declaration//GEN-END:variables
}
