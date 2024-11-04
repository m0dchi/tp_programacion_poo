package vista;

import controlador.C_Usuario;
import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class fLogin extends javax.swing.JFrame {

    private C_Usuario controlUsuario;

    public fLogin() {
        try {
            InputStream robotoRegularStream = getClass().getResourceAsStream("/assets/fonts/Roboto-Regular.ttf");
            Font robotoRegular = Font.createFont(Font.TRUETYPE_FONT, robotoRegularStream).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(robotoRegular);
            InputStream robotoBlackStream = getClass().getResourceAsStream("/assets/fonts/Roboto-Black.ttf");
            Font robotoBlack = Font.createFont(Font.TRUETYPE_FONT, robotoBlackStream).deriveFont(12f);
            ge.registerFont(robotoBlack);
            UIManager.put("Label.font", robotoRegular);
            UIManager.put("Button.font", robotoBlack);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("CDE".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        }
        initComponents();
        this.setResizable(false);
        this.setTitle("Inicio de sesión - SISTEMA CIBERCAFE");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.controlUsuario = new C_Usuario();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("assets/iconprograma.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        logotitulo = new javax.swing.JLabel();
        fondojpanel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        autoras = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(192, 151, 88)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Black", 0, 40)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("VENTAS PARA CIBERCAFÉ");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        titulo1.setFont(new java.awt.Font("Roboto Black", 0, 40)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("SISTEMA DE GESTIÓN DE");
        jPanel1.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        logotitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gestionlogo.png"))); // NOI18N
        jPanel1.add(logotitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        fondojpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backgrounds/800-210.png"))); // NOI18N
        jPanel1.add(fondojpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 210));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(192, 151, 88)));

        autoras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        autoras.setForeground(new java.awt.Color(204, 204, 204));
        autoras.setText("© Rocio Villanueva, Charo de Don Pedro, Zoe Montenegro");

        usuario.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("USUARIO");

        contraseña.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        contraseña.setForeground(new java.awt.Color(0, 0, 0));
        contraseña.setText("CONTRASEÑA");

        txt_usuario.setBackground(new java.awt.Color(44, 21, 69));
        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });

        txt_password.setBackground(new java.awt.Color(44, 21, 69));
        txt_password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });

        btn_login.setText("Ingresar");
        btn_login.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_login.setBorderPainted(false);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(autoras))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseña)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseña)
                .addGap(18, 18, 18)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(autoras)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 470, 390));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DEFAULT: test - 1234");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("credenciales para poder");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ingresar al sistema");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Por favor, ingresa tus");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        bienvenido.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        bienvenido.setText("BIENVENIDO");
        jPanel3.add(bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backgrounds/330-390.png"))); // NOI18N
        jPanel3.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 390));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 330, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        this.Login();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            this.Login();
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txt_password.requestFocus();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

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
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autoras;
    private javax.swing.JLabel bienvenido;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondojpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logotitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    private void Login() {
        if (!txt_usuario.getText().isEmpty() && !txt_password.getText().isEmpty()) {
            try {
                controlUsuario.loginUser(txt_usuario.getText().trim(), txt_password.getText().trim());
                JOptionPane.showMessageDialog(null, "Inicio de sesión correcto");
                fMenu menu = new fMenu();
                menu.setVisible(true);
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese sus credenciales");
        }
    }
}
