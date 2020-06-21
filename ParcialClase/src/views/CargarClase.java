package views;
import javax.swing.JOptionPane;
import models.AltaClases;
import models.Grupal;
import models.Individual;

public class CargarClase extends javax.swing.JFrame {

    AltaClases clases;
    
    public CargarClase() {
        initComponents();
        clases = new AltaClases();
        rbtIndividual.setSelected(true);
        txtCantidadClases.setEnabled(false);
        txtCupo.setEnabled(false);
    }
    
    /*public boolean validar(){
        if (!rbtGrupal.isSelected() && !rbrIndividual.isSelected()) {
            JOptionPane.showMessageDialog(this,"Seleccione Tipo de Clase");
            return false;
            
        } else{
            if (txtCostoBase.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete el costo base");
                return false;
                }
            else{
            if (txtCupo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete el cupo");
                return false;
                }
            else{
            if (txtDiaHora.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete dia y hora");
                return false;
                }
            else{
            if (txtMateria.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete materia");
                return false;
                }
             else{
            if (txtCantidadClases.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete cantidad de clases");
                return false;
                }
            else {return true;}
        }
    }
            }}}}*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        rbtIndividual = new javax.swing.JRadioButton();
        rbtGrupal = new javax.swing.JRadioButton();
        txtDiaHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        txtCostoBase = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel5 = new javax.swing.JLabel();
        txtCupo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidadClases = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        chkTarde = new javax.swing.JCheckBox();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Dia y Hora:");

        btnCargar.setText("Cargar Clase");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnListado.setText("Listado Clases");
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });

        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtIndividual);
        rbtIndividual.setText("Individual");
        rbtIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtIndividualActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtGrupal);
        rbtGrupal.setText("Grupal");
        rbtGrupal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtGrupalActionPerformed(evt);
            }
        });

        jLabel2.setText("Materia: ");

        jLabel3.setText("Costo Base:");

        jLabel4.setText("Tipo de Clase: ");

        jLabel5.setText("Cupo:");

        jLabel6.setText("Cant. de clases: ");

        jLabel7.setText("LLego Tarde:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtIndividual)
                                .addGap(10, 10, 10)
                                .addComponent(rbtGrupal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCargar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReportes)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCantidadClases, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(chkTarde, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMateria, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiaHora, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCostoBase, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbtIndividual)
                    .addComponent(rbtGrupal))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDiaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidadClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(chkTarde))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCostoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnListado)
                    .addComponent(btnReportes))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        VentanaListado ventana = new VentanaListado(clases);
        ventana.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
       VentanaReportes ventana= new VentanaReportes(clases);
        ventana.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        
           if (rbtIndividual.isSelected()){ {
               Individual c = new Individual();
               
              c.setCostoBase(Float.parseFloat(txtCostoBase.getText()));
              c.setDiaHora(txtDiaHora.getText());
              c.setCostoBase(Float.parseFloat(txtCostoBase.getText()));
              c.setLlegoTarde(chkTarde.isSelected());
              c.setMateria(txtMateria.getText());
              
              
              clases.agregarClase(c);
              
            }
        }
        else {  
            Grupal c = new Grupal();
            c.setCantidadClases(Integer.parseInt(txtCantidadClases.getText()));
            c.setCostoBase(Float.parseFloat(txtCostoBase.getText()));
            c.setCupo(Integer.parseInt(txtCupo.getText()));
            c.setDiaHora(txtDiaHora.getText());
            
            
            clases.agregarClase(c);
            
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void rbtIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtIndividualActionPerformed
   txtCupo.setEnabled(false);
   txtCantidadClases.setEnabled(false);   
   chkTarde.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_rbtIndividualActionPerformed

    private void rbtGrupalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtGrupalActionPerformed
chkTarde.setEnabled(false);  
txtCupo.setEnabled(true);
   txtCantidadClases.setEnabled(true);   // TODO add your handling code here:
    }//GEN-LAST:event_rbtGrupalActionPerformed

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
            java.util.logging.Logger.getLogger(CargarClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarClase().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnReportes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkTarde;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbtGrupal;
    private javax.swing.JRadioButton rbtIndividual;
    private javax.swing.JTextField txtCantidadClases;
    private javax.swing.JTextField txtCostoBase;
    private javax.swing.JTextField txtCupo;
    private javax.swing.JTextField txtDiaHora;
    private javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables
}