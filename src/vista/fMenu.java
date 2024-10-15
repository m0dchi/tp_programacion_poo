package vista;

import javax.swing.JDesktopPane;
import java.awt.Toolkit;

public class fMenu extends javax.swing.JFrame {
    
    public static JDesktopPane jDesktopPane_menu;

    public fMenu() {
       initComponents();
        this.setResizable(true);
        this.setSize(1280, 720);
        this.setTitle("SISTEMA CIBERCAFÉ");
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null); 
        
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto-110));
        this.add(jDesktopPane_menu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_nuevoUsuario = new javax.swing.JMenuItem();
        mi_usuarios = new javax.swing.JMenuItem();
        mi_nuevoCliente = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mi_clientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mi_nuevoProducto = new javax.swing.JMenuItem();
        mi_productos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mi_nuevaCategoria = new javax.swing.JMenuItem();
        mi_categorias = new javax.swing.JMenuItem();
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

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/usuario.png"))); // NOI18N
        jMenu1.setText("Usuarios");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_nuevoUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_nuevoUsuario.setText("Nuevo usuario");
        jMenu1.add(mi_nuevoUsuario);

        mi_usuarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_usuarios.setText("Administrar usuarios");
        jMenu1.add(mi_usuarios);

        jMenuBar1.add(jMenu1);

        mi_nuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clientes.png"))); // NOI18N
        mi_nuevoCliente.setText("Clientes");
        mi_nuevoCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_nuevoCliente.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jMenuItem3.setText("Nuevo cliente");
        mi_nuevoCliente.add(jMenuItem3);

        mi_clientes.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        mi_clientes.setText("Administrar clientes");
        mi_nuevoCliente.add(mi_clientes);

        jMenuBar1.add(mi_nuevoCliente);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/producto.png"))); // NOI18N
        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_nuevoProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_nuevoProducto.setText("Nuevo producto");
        jMenu2.add(mi_nuevoProducto);

        mi_productos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_productos.setText("Administrar productos");
        jMenu2.add(mi_productos);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/categoria.png"))); // NOI18N
        jMenu4.setText("Categorias");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_nuevaCategoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_nuevaCategoria.setText("Nueva categoria");
        mi_nuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_nuevaCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(mi_nuevaCategoria);

        mi_categorias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_categorias.setText("Administrar categorias");
        jMenu4.add(mi_categorias);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/facturacion.png"))); // NOI18N
        jMenu5.setText("Facturación");
        jMenu5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_nuevaVenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_nuevaVenta.setText("Nueva venta");
        jMenu5.add(mi_nuevaVenta);

        mi_ventas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_ventas.setText("Administrar ventas");
        jMenu5.add(mi_ventas);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/reporte.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_reporteClientes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_reporteClientes.setText("Reporte de clientes");
        jMenu6.add(mi_reporteClientes);

        mi_reporteCategorias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_reporteCategorias.setText("Reporte de categorias");
        jMenu6.add(mi_reporteCategorias);

        mi_reporteProductos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_reporteProductos.setText("Reporte de productos");
        jMenu6.add(mi_reporteProductos);

        mi_reporteVentas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_reporteVentas.setText("Reporte de ventas");
        jMenu6.add(mi_reporteVentas);

        jMenuBar1.add(jMenu6);

        mi_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/historial.png"))); // NOI18N
        mi_historial.setText("Historial");
        mi_historial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mi_historial.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem16.setText("Ver historial");
        mi_historial.add(jMenuItem16);

        jMenuBar1.add(mi_historial);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cerrar sesion.png"))); // NOI18N
        jMenu8.setText("Sesión");
        jMenu8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        mi_cerrarSesion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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
