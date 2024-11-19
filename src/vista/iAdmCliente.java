package vista;

import controlador.C_Cliente;
import modelo.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class iAdmCliente extends javax.swing.JInternalFrame {

    private int idCliente;
    private C_Cliente controlCliente;

    public iAdmCliente() {
        initComponents();
        this.setSize(800, 600);
        this.setTitle("Administrar clientes");
        controlCliente = new C_Cliente();
        this.cargarClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_cliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        text_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_apellido = new javax.swing.JTextField();
        text_dni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        text_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRADOR DE CLIENTES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_cliente.setBackground(new java.awt.Color(255, 255, 255));
        t_cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(t_cliente);
        if (t_cliente.getColumnModel().getColumnCount() > 0) {
            t_cliente.getColumnModel().getColumn(0).setMinWidth(10);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 470, 410));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 190, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(text_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        text_apellido.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(text_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 30));

        text_dni.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(text_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Documento:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        text_telefono.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(text_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 170, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Telefono:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 190, 300));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backgrounds/800-600.png"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizarCliente();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminarCliente();
    }//GEN-LAST:event_btn_eliminarActionPerformed
    private void cargarClientes() {
        List<Cliente> clientes = controlCliente.leerTodas();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NOMBRE");
        model.addColumn("APELLIDO");
        model.addColumn("DNI");
        model.addColumn("TELEFONO");
        for (Cliente cliente : clientes) {
            Object[] fila = new Object[5];
            fila[0] = cliente.getId();
            fila[1] = cliente.getNombre();
            fila[2] = cliente.getApellido();
            fila[3] = cliente.getDni();
            fila[4] = cliente.getTelefono();
            model.addRow(fila);
        }
        t_cliente.setModel(model);
        t_cliente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaPoint = t_cliente.rowAtPoint(e.getPoint());
                int columnaPoint = 0;
                if (filaPoint > -1) {
                    idCliente = (int) model.getValueAt(filaPoint, columnaPoint);
                    mostrarDatosCliente(idCliente);
                }
            }
        });
    }

    private void mostrarDatosCliente(int idCliente) {
        Cliente cliente = controlCliente.leer(idCliente);
        if (cliente != null) {
            text_nombre.setText(cliente.getNombre());
            text_apellido.setText(cliente.getApellido());
            text_dni.setText(String.valueOf(cliente.getDni()));
            text_telefono.setText(String.valueOf(cliente.getTelefono()));
        } else {
            JOptionPane.showMessageDialog(null, "Error al cargar datos del cliente");
        }
    }

    private void actualizarCliente() {
        try {
            String nombre = text_nombre.getText().trim();
            String apellido = text_apellido.getText().trim();
            if (nombre.isEmpty() || apellido.isEmpty() || text_dni.getText().trim().isEmpty() || text_telefono.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Falta completar datos");
                return;
            }
            int dni;
            try {
                dni = Integer.parseInt(text_dni.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DNI debe ser un número válido");
                return;
            }
            long telefono;
            try {
                telefono = Long.parseLong(text_telefono.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Teléfono debe ser un número válido");
                return;
            }
            controlCliente.actualizar(idCliente, nombre, apellido, dni, telefono);
            JOptionPane.showMessageDialog(null, "Cliente actualizado");
            limpiarCampos();
            this.cargarClientes();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void eliminarCliente() {
        try {
            if (!text_nombre.getText().isEmpty()) {
                String nombreCliente = text_nombre.getText().trim();
                String apellidoCliente = text_apellido.getText().trim();
                int confirmacion = JOptionPane.showOptionDialog(null, "¿Está seguro de eliminar el cliente " + nombreCliente + " " + apellidoCliente + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "No");
                if (confirmacion == JOptionPane.YES_OPTION) {
                    controlCliente.eliminar(idCliente);
                    JOptionPane.showMessageDialog(null, "Cliente eliminado");
                    limpiarCampos();
                    this.cargarClientes();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un cliente");
            }
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
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable t_cliente;
    private javax.swing.JTextField text_apellido;
    private javax.swing.JTextField text_dni;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JTextField text_telefono;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

}
