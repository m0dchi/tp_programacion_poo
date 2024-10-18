package vista;

import conexion.Conexion;
import modelo.Categoria;
import controlador.C_Categoria;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class iAdmCategoria extends javax.swing.JInternalFrame {

    private int idCategoria;

    public iAdmCategoria() {
        initComponents();
        this.setSize(700, 500);
        this.setTitle("Administrar categorias");

        this.cargaCategoria();
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

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/700-500.jpeg"))); // NOI18N
        wallpaper.setText("jLabel1");
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        if (!text_nombre.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            C_Categoria controlCategoria = new C_Categoria();

            categoria.setNombre(text_nombre.getText().trim());
            categoria.setDescripcion(text_descripcion.getText().trim());

            if (controlCategoria.actualizar(categoria, idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoria actualizada");
                text_nombre.setText("");
                text_descripcion.setText("");
                this.cargaCategoria();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar categoria");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciones una categoria");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       if (!text_nombre.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            C_Categoria controlCategoria = new C_Categoria();

            categoria.setNombre(text_nombre.getText().trim());
            categoria.setDescripcion(text_descripcion.getText().trim());

            if (!controlCategoria.eliminar(idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoria eliminada");
                text_nombre.setText("");
                text_descripcion.setText("");
                this.cargaCategoria();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar categoriaaaass");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciones una categoria");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed


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

//
    private void cargaCategoria() {
        Connection cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select idCategoria, nombre, descripcion from t_categoria;";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            iAdmCategoria.t_categoria = new JTable(model);
            iAdmCategoria.jScrollPane1.setViewportView(iAdmCategoria.t_categoria);

            model.addColumn("ID");
            model.addColumn("NOMBRE");
            model.addColumn("DESCRIPCION");

            while (rs.next()) {
                Object fila[] = new Object[3];

                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al completar datos: " + e);
        }

        t_categoria.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = t_categoria.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idCategoria = (int) model.getValueAt(fila_point, columna_point);
                    datosCat(idCategoria);
                }
            }
        });
    }

    private void datosCat(int idCategoria) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select nombre, descripcion from t_categoria where idCategoria = '" + idCategoria + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                text_nombre.setText(rs.getString("nombre"));
                text_descripcion.setText(rs.getString("descripcion"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar categoria:" + e);
        }
    }

}
