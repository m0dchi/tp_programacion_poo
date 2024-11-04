package vista;

import controlador.C_Categoria;
import javax.swing.JOptionPane;

public class iCategoria extends javax.swing.JInternalFrame {

    private C_Categoria controlCategoria;

    public iCategoria() {
        initComponents();
        this.setSize(500, 400);
        this.setTitle("Nueva categoria");
        controlCategoria = new C_Categoria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_descripcion = new javax.swing.JLabel();
        text_nombre = new javax.swing.JTextField();
        text_descripcion = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("NUEVA CATEGORIA");
        getContentPane().add(lb_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        lb_nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lb_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_nombre.setText("Nombre de categoria:");
        getContentPane().add(lb_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 210, -1));

        lb_descripcion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb_descripcion.setForeground(new java.awt.Color(255, 255, 255));
        lb_descripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_descripcion.setText("Descripción:");
        getContentPane().add(lb_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, -1));

        text_nombre.setBackground(new java.awt.Color(204, 204, 204));
        text_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        text_nombre.setForeground(new java.awt.Color(0, 0, 0));
        text_nombre.setCaretColor(new java.awt.Color(0, 0, 0));
        text_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(text_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 350, -1));

        text_descripcion.setBackground(new java.awt.Color(204, 204, 204));
        text_descripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        text_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        text_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_descripcionActionPerformed(evt);
            }
        });
        getContentPane().add(text_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 350, -1));

        btn_guardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(0, 0, 0));
        btn_guardar.setText("Guardar");
        btn_guardar.setToolTipText("");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backgrounds/500-400.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 490, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_descripcionActionPerformed

    private void text_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombreActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        guardarCategoria();
    }//GEN-LAST:event_btn_guardarActionPerformed
    private void guardarCategoria() {
        try {
            String nombre = text_nombre.getText().trim();
            String descripcion = text_descripcion.getText().trim();
            if (nombre.isEmpty() || descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Falta completar datos");
            } else {
                if (!controlCategoria.categoriaExiste(nombre)) {
                    controlCategoria.guardar(nombre, descripcion);
                    JOptionPane.showMessageDialog(null, "Categoria guardada");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "La categoria ya existe");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void limpiarCampos() {
        text_nombre.setText("");
        text_descripcion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_descripcion;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTextField text_descripcion;
    private javax.swing.JTextField text_nombre;
    // End of variables declaration//GEN-END:variables
}
