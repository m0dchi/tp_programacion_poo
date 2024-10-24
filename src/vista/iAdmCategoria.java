package vista;

import controlador.C_Categoria;
import modelo.Categoria;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class iAdmCategoria extends javax.swing.JInternalFrame {

    private int idCategoria;
    private C_Categoria controlCategoria;

    public iAdmCategoria() {
        initComponents();
        this.setSize(700, 500);
        this.setTitle("Administrar categorias");
        controlCategoria = new C_Categoria();
        this.cargarCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_categoria = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text_nombre = new javax.swing.JTextField();
        text_descripcion = new javax.swing.JTextField();
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

        t_categoria.setBackground(new java.awt.Color(255, 255, 255));
        t_categoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(t_categoria);
        if (t_categoria.getColumnModel().getColumnCount() > 0) {
            t_categoria.getColumnModel().getColumn(0).setMinWidth(10);
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
        jLabel1.setText("Descripción:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        text_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(text_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 50));

        text_descripcion.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(text_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 90));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 190, 210));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backgrounds/700-500.jpeg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        if (!text_nombre.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            categoria.setNombre(text_nombre.getText().trim());
            categoria.setDescripcion(text_descripcion.getText().trim());
            if (controlCategoria.actualizar(categoria, idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoria actualizada");
                text_nombre.setText("");
                text_descripcion.setText("");
                this.cargarCategorias();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar categoria");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una categoria");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
         if (!text_nombre.getText().isEmpty()) {
            String nombreCategoria = text_nombre.getText().trim();

            int confirmacion = JOptionPane.showOptionDialog(null,
                    "¿Está seguro de eliminar la categoria " + nombreCategoria + "?",
                    "Confirmar Eliminación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Sí", "No"},
                    "No");

            if (confirmacion == JOptionPane.YES_OPTION) {
                if (controlCategoria.eliminar(idCategoria)) {
                    JOptionPane.showMessageDialog(null, "Categoria eliminada");
                    text_nombre.setText("");
                    text_descripcion.setText("");
                    this.cargarCategorias();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar la categoria");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una categoria");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed
    private void cargarCategorias() {
        List<Categoria> categorias = controlCategoria.leerTodas();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NOMBRE");
        model.addColumn("DESCRIPCION");

        for (Categoria categoria : categorias) {
            Object[] fila = new Object[3];
            fila[0] = categoria.getId();
            fila[1] = categoria.getNombre();
            fila[2] = categoria.getDescripcion();
            model.addRow(fila);
        }
        t_categoria.setModel(model);
        t_categoria.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaPoint = t_categoria.rowAtPoint(e.getPoint());
                int columnaPoint = 0;
                if (filaPoint > -1) {
                    idCategoria = (int) model.getValueAt(filaPoint, columnaPoint);
                    mostrarDatosCategoria(idCategoria);
                }
            }
        });
    }

    private void mostrarDatosCategoria(int idCategoria) {
        Categoria categoria = controlCategoria.leer(idCategoria);
        if (categoria != null) {
            text_nombre.setText(categoria.getNombre());
            text_descripcion.setText(categoria.getDescripcion());
        } else {
            JOptionPane.showMessageDialog(null, "Error al cargar datos de la categoria");
        }
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
    public static javax.swing.JTable t_categoria;
    private javax.swing.JTextField text_descripcion;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

}
