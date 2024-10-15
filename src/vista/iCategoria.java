package vista;

import controlador.C_Categoria;
import javax.swing.JOptionPane;
import modelo.Categoria;

public class iCategoria extends javax.swing.JInternalFrame {

    public iCategoria() {
        initComponents();
        this.setSize(500, 400);
        this.setTitle("Nueva categoria");
        
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

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titulo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("NUEVA CATEGORIA");
        getContentPane().add(lb_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        lb_nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lb_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_nombre.setText("Nombre de categoria:");
        getContentPane().add(lb_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 210, -1));

        lb_descripcion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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
        btn_guardar.setText("Guardar");
        btn_guardar.setToolTipText("");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 90, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_descripcionActionPerformed

    private void text_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombreActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        Categoria categoria = new Categoria();
        C_Categoria controlCategoria = new C_Categoria();

        if (text_nombre.getText().isEmpty() || text_nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta completar datos");
        } else {
            categoria.setNombre(text_nombre.getText().trim());
            categoria.setDescripcion(text_descripcion.getText().trim());
            categoria.setEstado(1);
            if (controlCategoria.guardar(categoria)) {
                JOptionPane.showMessageDialog(null, "Categoria guardada");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar categoria");
            }
        }
        
        text_descripcion.setText("");
        text_nombre.setText("");
    }//GEN-LAST:event_btn_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel lb_descripcion;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTextField text_descripcion;
    private javax.swing.JTextField text_nombre;
    // End of variables declaration//GEN-END:variables
}
