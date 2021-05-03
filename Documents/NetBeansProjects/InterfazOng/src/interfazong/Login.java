/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazong;

import componentead.Usuario;
import imagenes.LogicaNegocio;
import imagenes.Logo;
import java.awt.Color;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Logo logo;
    String colorBoton = "#ffe395";
    String colorEnlace = "#0000ff";

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        logo = new Logo(logotipo);
        logotipo.add(logo).repaint();
        etiqueta1.setText("Usuario: ");
        caja1.setText("");
        etiqueta2.setText("Contraseña: ");
        caja2.setText("");
        casilla.setText("Recordar contraseña");
        boton1.setText("Entrar");
        boton1.setBackground(Color.decode(colorBoton));
        etiqueta3.setText("Registrarse");
        etiqueta3.setForeground(Color.decode(colorEnlace));
        JOptionPane.showMessageDialog(null, "Bienvenido a la aplicación AppONG", "AppONG", JOptionPane.DEFAULT_OPTION);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor1 = new javax.swing.JPanel();
        logotipo = new javax.swing.JPanel();
        etiqueta1 = new javax.swing.JLabel();
        caja1 = new javax.swing.JTextField();
        etiqueta2 = new javax.swing.JLabel();
        caja2 = new javax.swing.JPasswordField();
        casilla = new javax.swing.JCheckBox();
        boton1 = new javax.swing.JButton();
        etiqueta3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout logotipoLayout = new javax.swing.GroupLayout(logotipo);
        logotipo.setLayout(logotipoLayout);
        logotipoLayout.setHorizontalGroup(
            logotipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );
        logotipoLayout.setVerticalGroup(
            logotipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );

        etiqueta1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta1.setText("jLabel1");

        caja1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caja1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        caja1.setText("jTextField1");

        etiqueta2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta2.setText("jLabel2");

        caja2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caja2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        caja2.setText("jPasswordField1");

        casilla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        casilla.setText("jCheckBox1");
        casilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        boton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton1.setText("jButton1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        etiqueta3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta3.setText("jLabel3");
        etiqueta3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        etiqueta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarse(evt);
            }
        });

        javax.swing.GroupLayout contenedor1Layout = new javax.swing.GroupLayout(contenedor1);
        contenedor1.setLayout(contenedor1Layout);
        contenedor1Layout.setHorizontalGroup(
            contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154))
            .addGroup(contenedor1Layout.createSequentialGroup()
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiqueta2)
                            .addComponent(etiqueta1)))
                    .addGroup(contenedor1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        contenedor1Layout.setVerticalGroup(
            contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta1))
                .addGap(18, 18, 18)
                .addGroup(contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta2)
                    .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(casilla)
                .addGap(18, 18, 18)
                .addComponent(boton1)
                .addGap(18, 18, 18)
                .addComponent(etiqueta3)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse
        // TODO add your handling code here:
        Registrarse register = new Registrarse();
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarse

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
        String username = caja1.getText();
        String pass = caja2.getSelectedText();
        Usuario usuario = new Usuario(username, pass);
        if (validarDatos()) {
            Iterator iterador = LogicaNegocio.getListaUsuarios().iterator();
            while (iterador.hasNext()) {
                if (iterador.equals(username)) {
                    Menu menu = new Menu();
                    menu.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_boton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JTextField caja1;
    private javax.swing.JPasswordField caja2;
    private javax.swing.JCheckBox casilla;
    private javax.swing.JPanel contenedor1;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta3;
    private javax.swing.JPanel logotipo;
    // End of variables declaration//GEN-END:variables

    private boolean validarDatos() {
        String caracterNumerico = "0123456789";
        String msgError = "El nombre del usuario no debe empezar por un numero";
        String msgWarning = "Toda la información es obligatorio";
        if (caja1.getText().startsWith(caracterNumerico)) {
            JOptionPane.showMessageDialog(this, "Error", msgError, JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if (!(caja1.getText().isEmpty() && caja2.getSelectedText().isEmpty())) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Aviso", msgWarning, JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
    }
}
