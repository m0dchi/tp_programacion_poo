
package vista;

import controlador.C_DetalleVenta;
import controlador.C_Cliente;
import modelo.Cliente;
import modelo.DetalleVenta;
import controlador.C_CabeceraVenta;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Producto;
import controlador.C_Producto;


public class iVenta extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloDatosProductos;
    private ArrayList<DetalleVenta> listaProductos = new ArrayList<>();
    private DetalleVenta producto;
    private int idCliente = 0;
    private int idProducto = 0;
    private String nombre = "";
    private double precioUnitario = 0.0;
    private int cantidad = 0;
    private double totalPagar = 0.0;
    private int auxIdDetalle = 1;

    public iVenta() {
        initComponents();
        this.setSize(800, 600);
        this.setTitle("Facturación");
        this.cargarClientes();

        this.inicializarTablaProducto();
        text_totalpagar.setText("0.0");
        cargarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        cb_producto = new javax.swing.JComboBox<>();
        cb_cliente = new javax.swing.JComboBox<>();
        text_cantidad = new javax.swing.JTextField();
        text_buscar = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lb3 = new javax.swing.JLabel();
        text_totalpagar = new javax.swing.JTextField();
        btn_registrarventa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("FACTURACION");
        getContentPane().add(lb_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        lb.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb.setForeground(new java.awt.Color(255, 255, 255));
        lb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb.setText("Cantidad:");
        getContentPane().add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 110, -1));

        lb1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb1.setText("Cliente:");
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 80, -1));

        lb2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb2.setText("Producto:");
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        cb_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar producto", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cb_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 290, -1));

        cb_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar cliente", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cb_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 180, -1));
        getContentPane().add(text_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 100, -1));
        getContentPane().add(text_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 150, -1));

        btn_agregar.setText("Agregar productos");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 140, -1));

        btn_buscar.setText("Buscar por DNI");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(t_productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 730, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb3.setFont(new java.awt.Font("Roboto", 0, 34)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb3.setText("Total:");
        jPanel2.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 40));

        text_totalpagar.setEnabled(false);
        jPanel2.add(text_totalpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 180, 40));

        btn_registrarventa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_registrarventa.setText("Registrar venta");
        btn_registrarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarventaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_registrarventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 310, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backgrounds/800-600.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        C_Cliente cCliente = new C_Cliente();
        String clienteBuscar = text_buscar.getText().trim();
        try {
            int dni = Integer.parseInt(clienteBuscar);
            Cliente cliente = cCliente.buscarClientePorDNI(dni);
            cb_cliente.setSelectedItem(cliente.getNombre() + " " + cliente.getApellido());
        } catch (Exception e) {
            cb_cliente.setSelectedItem("Seleccionar cliente");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        text_buscar.setText("");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        String combo = this.cb_producto.getSelectedItem().toString();
        if (combo.equalsIgnoreCase("Seleccionar producto")) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {
            if (!text_cantidad.getText().isEmpty()) {
                boolean validacion = validar(text_cantidad.getText());
                if (validacion) {
                    if (Integer.parseInt(text_cantidad.getText()) > 0) {
                        cantidad = Integer.parseInt(text_cantidad.getText());
                        DatosDelProducto();

                        totalPagar = precioUnitario * cantidad;
                        totalPagar = (double) Math.round(totalPagar * 100) / 100;
                        producto = new DetalleVenta(auxIdDetalle, 1, idProducto, cantidad, precioUnitario, totalPagar);
                        listaProductos.add(producto);
                        JOptionPane.showMessageDialog(null, "Producto Agregado");
                        auxIdDetalle++;
                        text_cantidad.setText("");
                        cargarProductos();
                        CalcularTotalPagar();
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero (0), ni negativa");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numéricos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa la cantidad de productos");
            }
        }
        listaTablaProductos();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_registrarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarventaActionPerformed
        C_CabeceraVenta cCabeceraVenta = new C_CabeceraVenta();
        C_DetalleVenta cDetalleVenta = new C_DetalleVenta();
        String fechaActual = "";
        Date date = new Date();
        fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
        if (!cb_cliente.getSelectedItem().equals("Seleccionar cliente")) {
            if (listaProductos.size() > 0) {
                ObtenerIdCliente();
                try {
                    cCabeceraVenta.guardar(idCliente, totalPagar, fechaActual);
                    JOptionPane.showMessageDialog(null, "¡Venta Registrada!");
                    int idCabVenta = cCabeceraVenta.obtenerUltimoIdCabeceraVenta();
                    for (DetalleVenta elemento : listaProductos) {
                        cDetalleVenta.guardar(idCabVenta, elemento.getIdProducto(), elemento.getCantidad(), elemento.getPrecioUni(), elemento.getPagarTotal());
                    }
                    text_totalpagar.setText("0.0");
                    auxIdDetalle = 1;
                    cargarClientes();
                    listaProductos.clear();
                    listaTablaProductos();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "¡Error al guardar la venta: " + e.getMessage() + "!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Seleccione un producto!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Seleccione un cliente!");
        }
    }//GEN-LAST:event_btn_registrarventaActionPerformed

    private void cargarClientes() {
    C_Cliente cCliente = new C_Cliente();
    try {
        List<Cliente> clientes = cCliente.obtenerTodosLosClientes();
        cb_cliente.removeAllItems();
        cb_cliente.addItem("Seleccionar cliente");
        for (Cliente cliente : clientes) {
            cb_cliente.addItem(cliente.getNombre() + " " + cliente.getApellido());
        }
    } catch (Exception e) {
        System.out.println("Error al cargar clientes: " + e);
    }
}

    private void cargarProductos() {
    C_Producto controlProducto = new C_Producto();
    try {
        System.out.println("Llamando a leerTodas...");
        List<Producto> productos = controlProducto.leerTodas();
        System.out.println("Productos obtenidos: " + productos.size());
        cb_producto.removeAllItems();
        cb_producto.addItem("Seleccionar producto");
        for (Producto producto : productos) {
            System.out.println("Añadiendo producto: " + producto.getNombre());
            cb_producto.addItem(producto.getNombre());
        }
    } catch (Exception e) {
        System.out.println("Error al cargar productos: " + e.getMessage());
        e.printStackTrace();
    }
}

    private void DatosDelProducto() {
    String nombreProducto = cb_producto.getSelectedItem().toString();
    C_Producto cProducto = new C_Producto();
    try {
        Producto producto = cProducto.obtenerProductoPorNombre(nombreProducto);
        idProducto = producto.getId();
        precioUnitario = producto.getPrecio();
        nombre = producto.getNombre();
    } catch (Exception e) {
        System.out.println("¡Error al obtener datos del producto!: " + e.getMessage());
    }
}

    private void inicializarTablaProducto() {
    modeloDatosProductos = new DefaultTableModel();
    modeloDatosProductos.addColumn("Nombre");
    modeloDatosProductos.addColumn("Cantidad");
    modeloDatosProductos.addColumn("P. Unitario");
    modeloDatosProductos.addColumn("Eliminar"); 

    this.t_productos.setModel(modeloDatosProductos);
}

private void listaTablaProductos() {
    this.modeloDatosProductos.setRowCount(listaProductos.size());
    for (int i = 0; i < listaProductos.size(); i++) {
        this.modeloDatosProductos.setValueAt(listaProductos.get(i).getNombre(), i, 0);
        this.modeloDatosProductos.setValueAt(listaProductos.get(i).getCantidad(), i, 1);
        this.modeloDatosProductos.setValueAt(listaProductos.get(i).getPrecioUni(), i, 2);
        this.modeloDatosProductos.setValueAt("Eliminar", i, 3); 
    }
    t_productos.setModel(modeloDatosProductos);
}


    private void CalcularTotalPagar() {
    totalPagar = 0.0;
    for (DetalleVenta detalle : listaProductos) {
        totalPagar += detalle.getPagarTotal();
    }
    text_totalpagar.setText(String.valueOf(totalPagar));
}

    private void ObtenerIdCliente() {
    String nombreCliente = cb_cliente.getSelectedItem().toString();
    C_Cliente cCliente = new C_Cliente();
    try {
        idCliente = cCliente.obtenerIdClientePorNombreCompleto(nombreCliente);
    } catch (Exception e) {
        System.out.println("¡Error al obtener ID del cliente!: " + e.getMessage());
    }
}

    private boolean validar(String texto) {
    return texto.matches("\\d+");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_registrarventa;
    private javax.swing.JComboBox<String> cb_cliente;
    private javax.swing.JComboBox<String> cb_producto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb_titulo;
    public static javax.swing.JTable t_productos;
    private javax.swing.JTextField text_buscar;
    private javax.swing.JTextField text_cantidad;
    private javax.swing.JTextField text_totalpagar;
    // End of variables declaration//GEN-END:variables
}
