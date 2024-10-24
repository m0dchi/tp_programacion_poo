package vista;

import javax.swing.JDesktopPane;
import java.awt.*;
import javax.swing.*;

public class fMenu extends javax.swing.JFrame {
    public static JDesktopPane jDesktopPane_menu;

    public fMenu() {
        initComponents();
        this.setResizable(false);
        this.setSize(1280, 720);
        this.setTitle("SISTEMA CIBERCAFÉ");
        this.setLocationRelativeTo(null);

        jDesktopPane_menu = new JDesktopPane() {
            private Image backgroundImage;

            {
                try {
                    backgroundImage = new ImageIcon(getClass().getResource("/assets/backgrounds/fmenubackground.png")).getImage();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Background image not found or failed to load");
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.setLayout(new BorderLayout());
        this.add(jDesktopPane_menu, BorderLayout.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mi_nuevoProducto = new javax.swing.JMenuItem();
        mi_productos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mi_nuevaCategoria = new javax.swing.JMenuItem();
        mi_categorias = new javax.swing.JMenuItem();
        mi_nuevoCliente = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mi_clientes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mi_nuevoUsuario = new javax.swing.JMenuItem();
        mi_usuarios = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mi_nuevaVenta = new javax.swing.JMenuItem();
        mi_ventas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mi_reporteClientes = new javax.swing.JMenuItem();
        mi_reporteCategorias = new javax.swing.JMenuItem();
        mi_reporteProductos = new javax.swing.JMenuItem();
        mi_reporteVentas = new javax.swing.JMenuItem();
        mi_historial = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        mi_cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        jMenuBar1.setBackground(new java.awt.Color(35, 26, 68));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/producto.png"))); // NOI18N
        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_nuevoProducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_nuevoProducto.setText("Nuevo producto");
        mi_nuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_nuevoProductoActionPerformed(evt);
            }
        });
        jMenu2.add(mi_nuevoProducto);

        mi_productos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_productos.setText("Administrar productos");
        mi_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_productosActionPerformed(evt);
            }
        });
        jMenu2.add(mi_productos);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/categoria.png"))); // NOI18N
        jMenu4.setText("Categorias");
        jMenu4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_nuevaCategoria.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_nuevaCategoria.setText("Nueva categoria");
        mi_nuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_nuevaCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(mi_nuevaCategoria);

        mi_categorias.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_categorias.setText("Administrar categorias");
        mi_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_categoriasActionPerformed(evt);
            }
        });
        jMenu4.add(mi_categorias);

        jMenuBar1.add(jMenu4);

        mi_nuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/clientes.png"))); // NOI18N
        mi_nuevoCliente.setText("Clientes");
        mi_nuevoCliente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_nuevoCliente.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jMenuItem3.setText("Nuevo cliente");
        mi_nuevoCliente.add(jMenuItem3);

        mi_clientes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_clientes.setText("Administrar clientes");
        mi_nuevoCliente.add(mi_clientes);

        jMenuBar1.add(mi_nuevoCliente);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/usuario.png"))); // NOI18N
        jMenu1.setText("Usuarios");
        jMenu1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_nuevoUsuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_nuevoUsuario.setText("Nuevo usuario");
        jMenu1.add(mi_nuevoUsuario);

        mi_usuarios.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_usuarios.setText("Administrar usuarios");
        jMenu1.add(mi_usuarios);

        jMenuBar1.add(jMenu1);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/facturacion.png"))); // NOI18N
        jMenu5.setText("Facturación");
        jMenu5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_nuevaVenta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_nuevaVenta.setText("Nueva venta");
        jMenu5.add(mi_nuevaVenta);

        mi_ventas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_ventas.setText("Administrar ventas");
        jMenu5.add(mi_ventas);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/reporte.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_reporteClientes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_reporteClientes.setText("Reporte de clientes");
        jMenu6.add(mi_reporteClientes);

        mi_reporteCategorias.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_reporteCategorias.setText("Reporte de categorias");
        jMenu6.add(mi_reporteCategorias);

        mi_reporteProductos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_reporteProductos.setText("Reporte de productos");
        jMenu6.add(mi_reporteProductos);

        mi_reporteVentas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_reporteVentas.setText("Reporte de ventas");
        jMenu6.add(mi_reporteVentas);

        jMenuBar1.add(jMenu6);

        mi_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/historial.png"))); // NOI18N
        mi_historial.setText("Historial");
        mi_historial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_historial.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jMenuItem16.setText("Ver historial");
        mi_historial.add(jMenuItem16);

        jMenuBar1.add(mi_historial);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/cerrar sesion.png"))); // NOI18N
        jMenu8.setText("Sesión");
        jMenu8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_cerrarSesion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mi_cerrarSesion.setText("Cerrar sesión");
        jMenu8.add(mi_cerrarSesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_nuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_nuevaCategoriaActionPerformed
        iCategoria iCategoria = new iCategoria();
        jDesktopPane_menu.add(iCategoria);
        iCategoria.setVisible(true);
    }//GEN-LAST:event_mi_nuevaCategoriaActionPerformed

    private void mi_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_categoriasActionPerformed
        iAdmCategoria iAdmCategoria = new iAdmCategoria();
        jDesktopPane_menu.add(iAdmCategoria);
        iAdmCategoria.setVisible(true);
    }//GEN-LAST:event_mi_categoriasActionPerformed

    private void mi_nuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_nuevoProductoActionPerformed
        iProducto iProducto = new iProducto();
        jDesktopPane_menu.add(iProducto);
        iProducto.setVisible(true);
    }//GEN-LAST:event_mi_nuevoProductoActionPerformed

    private void mi_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_productosActionPerformed
        iAdmProducto iAdmProducto = new iAdmProducto();
        jDesktopPane_menu.add(iAdmProducto);
        iAdmProducto.setVisible(true);
    }//GEN-LAST:event_mi_productosActionPerformed

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
            java.util.logging.Logger.getLogger(fMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mi_categorias;
    private javax.swing.JMenuItem mi_cerrarSesion;
    private javax.swing.JMenuItem mi_clientes;
    private javax.swing.JMenu mi_historial;
    private javax.swing.JMenuItem mi_nuevaCategoria;
    private javax.swing.JMenuItem mi_nuevaVenta;
    private javax.swing.JMenu mi_nuevoCliente;
    private javax.swing.JMenuItem mi_nuevoProducto;
    private javax.swing.JMenuItem mi_nuevoUsuario;
    private javax.swing.JMenuItem mi_productos;
    private javax.swing.JMenuItem mi_reporteCategorias;
    private javax.swing.JMenuItem mi_reporteClientes;
    private javax.swing.JMenuItem mi_reporteProductos;
    private javax.swing.JMenuItem mi_reporteVentas;
    private javax.swing.JMenuItem mi_usuarios;
    private javax.swing.JMenuItem mi_ventas;
    // End of variables declaration//GEN-END:variables
}
