package vista;

import controlador.C_DetalleVenta;
import modelo.DetalleVenta;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class iAdmVentas extends javax.swing.JInternalFrame {

    private int idDetalleVenta;
    private C_DetalleVenta controlVenta;

    public iAdmVentas() {
        initComponents();
        this.setSize(700, 500);
        this.setTitle("Administrar Ventas");
        controlVenta = new C_DetalleVenta();
        this.cargarVentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_ventas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text_fecha = new javax.swing.JTextField();
        text_total = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRADOR DE CATEGORIAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_ventas.setBackground(new java.awt.Color(255, 255, 255));
        t_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(t_ventas);
        if (t_ventas.getColumnModel().getColumnCount() > 0) {
            t_ventas.getColumnModel().getColumn(0).setMinWidth(10);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 380, 320));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 190, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Total");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        text_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(text_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 50));

        text_total.setBackground(new java.awt.Color(255, 255, 255));
        text_total.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jPanel3.add(text_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 90));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de venta:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 190, 210));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backgrounds/700-500.jpeg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizarDetalleVenta();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminarDetalleVenta();
    }//GEN-LAST:event_btn_eliminarActionPerformed
    private void cargarVentas() {
        List<DetalleVenta> detallesVentas = controlVenta.obtenerTodasLasVentas();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("ID Cabecera");
        model.addColumn("Producto");
        model.addColumn("Cantidad");
        model.addColumn("P.Unitario");
        model.addColumn("Total");
        for (DetalleVenta detalle : detallesVentas) {
            Object[] fila = new Object[6];
            fila[0] = detalle.getIdDetalleVenta();
            fila[1] = detalle.getIdCabVenta();
            fila[2] = detalle.getNombre();
            fila[3] = detalle.getCantidad();
            fila[4] = detalle.getPrecioUni();
            fila[5] = detalle.getPagarTotal();
            model.addRow(fila);
        }
        t_ventas.setModel(model);
        t_ventas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaPoint = t_ventas.rowAtPoint(e.getPoint());
                int columnaPoint = 0;
                if (filaPoint > -1) {
                    idDetalleVenta = (int) model.getValueAt(filaPoint, columnaPoint);
                    mostrarDatosDetalleVenta(idDetalleVenta);
                }
            }
        });
    }

    private void mostrarDatosDetalleVenta(int idDetalleVenta) {
        DetalleVenta detalle = controlVenta.leer(idDetalleVenta);
        if (detalle != null) {
            String fechaVenta = controlVenta.obtenerFechaVenta(detalle.getIdCabVenta());
            text_fecha.setText(fechaVenta);
            text_total.setText(String.valueOf(detalle.getPagarTotal()));
        } else {
            JOptionPane.showMessageDialog(null, "Error al cargar datos del detalle de la venta");
        }
    }

    private void actualizarDetalleVenta() {
        try {
            String totalStr = text_total.getText().trim();
            if (!totalStr.isEmpty()) {
                double total = Double.parseDouble(totalStr);
                controlVenta.actualizarTotalDetalleVenta(idDetalleVenta, total);
                JOptionPane.showMessageDialog(null, "Detalle de venta actualizado");
                limpiarCampos();
                this.cargarVentas();
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un detalle de venta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void eliminarDetalleVenta() {
        try {
            if (!text_total.getText().isEmpty()) {
                String detalleTotal = text_total.getText().trim();
                int confirmacion = JOptionPane.showOptionDialog(null, "¿Está seguro de eliminar el detalle de venta con total " + detalleTotal + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "No");
                if (confirmacion == JOptionPane.YES_OPTION) {
                    controlVenta.eliminarDetalleVenta(idDetalleVenta);
                    JOptionPane.showMessageDialog(null, "Detalle de venta eliminado");
                    limpiarCampos();
                    this.cargarVentas();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un detalle de venta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void limpiarCampos() {
        text_fecha.setText("");
        text_total.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable t_ventas;
    private javax.swing.JTextField text_fecha;
    private javax.swing.JTextField text_total;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

}
