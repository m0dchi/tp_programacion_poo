package vista;

import controlador.C_Cliente;
import javax.swing.JOptionPane;

public class iCliente extends javax.swing.JInternalFrame {

    private C_Cliente controlCliente;

    public iCliente() {
        initComponents();
        this.setSize(500, 400);
        this.setTitle("Nuevo cliente");
        controlCliente = new C_Cliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_precio = new javax.swing.JLabel();
        lb_apellido = new javax.swing.JLabel();
        lb_precio1 = new javax.swing.JLabel();
        text_telefono = new javax.swing.JTextField();
        text_apellido = new javax.swing.JTextField();
        text_nombre = new javax.swing.JTextField();
        text_dni = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("NUEVO CLIENTE");
        getContentPane().add(lb_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        lb_nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lb_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_nombre.setText("Nombre:");
        getContentPane().add(lb_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 110, -1));

        lb_precio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb_precio.setForeground(new java.awt.Color(255, 255, 255));
        lb_precio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_precio.setText("Documento:");
        getContentPane().add(lb_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 110, -1));

        lb_apellido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb_apellido.setForeground(new java.awt.Color(255, 255, 255));
        lb_apellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_apellido.setText("Apellido:");
        getContentPane().add(lb_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 110, -1));

        lb_precio1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb_precio1.setForeground(new java.awt.Color(255, 255, 255));
        lb_precio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_precio1.setText("Telefono:");
        getContentPane().add(lb_precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 110, -1));

        text_telefono.setBackground(new java.awt.Color(204, 204, 204));
        text_telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        text_telefono.setForeground(new java.awt.Color(0, 0, 0));
        text_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(text_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 350, -1));

        text_apellido.setBackground(new java.awt.Color(204, 204, 204));
        text_apellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        text_apellido.setForeground(new java.awt.Color(0, 0, 0));
        text_apellido.setCaretColor(new java.awt.Color(0, 0, 0));
        text_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(text_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 350, -1));

        text_nombre.setBackground(new java.awt.Color(204, 204, 204));
        text_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        text_nombre.setForeground(new java.awt.Color(0, 0, 0));
        text_nombre.setCaretColor(new java.awt.Color(0, 0, 0));
        text_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(text_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 350, -1));

        text_dni.setBackground(new java.awt.Color(204, 204, 204));
        text_dni.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        text_dni.setForeground(new java.awt.Color(0, 0, 0));
        text_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_dniActionPerformed(evt);
            }
        });
        getContentPane().add(text_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 350, -1));

        btn_guardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(0, 0, 0));
        btn_guardar.setText("Guardar");
        btn_guardar.setToolTipText("");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backgrounds/500-400.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_dniActionPerformed

    private void text_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombreActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        guardarCliente();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void text_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_apellidoActionPerformed

    private void text_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_telefonoActionPerformed

    private void guardarCliente() {
        try {
            String nombre = text_nombre.getText().trim();
            String apellido = text_apellido.getText().trim();
            int dni = Integer.parseInt(text_dni.getText().trim());
            int telefono = Integer.parseInt(text_telefono.getText().trim());
            if (nombre.isEmpty() || apellido.isEmpty() || dni <= 0 || telefono <= 0) {
                JOptionPane.showMessageDialog(null, "Falta completar datos o los valores no son válidos");
            } else {
                if (!controlCliente.clienteExiste(dni)) {
                    controlCliente.guardar(nombre, apellido, dni, telefono);
                    JOptionPane.showMessageDialog(null, "Cliente guardado");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "El cliente ya existe");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "DNI y Teléfono deben ser números válidos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void limpiarCampos() {
        text_nombre.setText("");
        text_apellido.setText("");
        text_dni.setText("");
        text_telefono.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_apellido;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_precio;
    private javax.swing.JLabel lb_precio1;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTextField text_apellido;
    private javax.swing.JTextField text_dni;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JTextField text_telefono;
    // End of variables declaration//GEN-END:variables
}
