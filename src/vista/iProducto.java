package vista;

import controlador.C_Categoria;
import controlador.C_Producto;
import modelo.Categoria;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class iProducto extends javax.swing.JInternalFrame {

    private C_Categoria controlCategoria;
    private C_Producto controlProducto;
    private Map<String, Integer> categoriaMap;

    public iProducto() {
        initComponents();
        this.setSize(500, 400);
        this.setTitle("Nuevo Producto");
        controlCategoria = new C_Categoria();
        controlProducto = new C_Producto();
        categoriaMap = new HashMap<>();
        cargarCategorias();
    }

    private void cargarCategorias() {
        cbox_categoria.removeAllItems();
        cbox_categoria.addItem("Seleccione una categoría");
        List<Categoria> categorias = controlCategoria.leerTodas();
        for (Categoria categoria : categorias) {
            cbox_categoria.addItem(categoria.getNombre());
            categoriaMap.put(categoria.getNombre(), categoria.getId());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_precio = new javax.swing.JLabel();
        lb_categoria = new javax.swing.JLabel();
        text_nombre = new javax.swing.JTextField();
        text_precio = new javax.swing.JTextField();
        cbox_categoria = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("NUEVO PRODUCTO");
        getContentPane().add(lb_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        lb_nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lb_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_nombre.setText("Nombre:");
        getContentPane().add(lb_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, -1));

        lb_precio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb_precio.setForeground(new java.awt.Color(255, 255, 255));
        lb_precio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_precio.setText("Precio:");
        getContentPane().add(lb_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 110, -1));

        lb_categoria.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb_categoria.setForeground(new java.awt.Color(255, 255, 255));
        lb_categoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_categoria.setText("Categoria:");
        getContentPane().add(lb_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 110, -1));

        text_nombre.setBackground(new java.awt.Color(204, 204, 204));
        text_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        text_nombre.setForeground(new java.awt.Color(0, 0, 0));
        text_nombre.setCaretColor(new java.awt.Color(0, 0, 0));
        text_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(text_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 350, -1));

        text_precio.setBackground(new java.awt.Color(204, 204, 204));
        text_precio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        text_precio.setForeground(new java.awt.Color(0, 0, 0));
        text_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_precioActionPerformed(evt);
            }
        });
        getContentPane().add(text_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 350, -1));

        cbox_categoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbox_categoria.setForeground(new java.awt.Color(0, 0, 0));
        cbox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoria", "Ciber", "Ciber - PROMOS", "Cocina", "Cocina - PROMOS", "Cafetería", "Cafeteria - PROMOS", "Jagertender", "Bebidas" }));
        cbox_categoria.setToolTipText("");
        getContentPane().add(cbox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 200, -1));

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

    private void text_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_precioActionPerformed

    private void text_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombreActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        guardarProducto();
    }//GEN-LAST:event_btn_guardarActionPerformed
    
    private void guardarProducto() {
        try {
            if (cbox_categoria.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione una categoría válida.");
                return;
            }
            String nombre = text_nombre.getText().trim();
            String precioStr = text_precio.getText().trim();
            if (nombre.isEmpty() || precioStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Falta completar datos");
            } else {
                if (!controlProducto.productoExiste(nombre)) {
                    double precio;
                    try {
                        precio = Double.parseDouble(precioStr);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Precio no válido, debe ser en formato \"123\" o \"123.45\"");
                        return;
                    }
                    String categoriaSeleccionada = cbox_categoria.getSelectedItem().toString();
                    int categoriaId = categoriaMap.get(categoriaSeleccionada);
                    controlProducto.guardar(nombre, precio, categoriaId);
                    JOptionPane.showMessageDialog(null, "Producto guardado");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "El producto ya existe");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void limpiarCampos() {
        text_nombre.setText("");
        text_precio.setText("");
        cbox_categoria.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cbox_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_categoria;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_precio;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JTextField text_precio;
    // End of variables declaration//GEN-END:variables
}
