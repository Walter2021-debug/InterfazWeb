/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Usuario
 */
public class NuevoPermiso extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form NuevoPermiso
     */
    public NuevoPermiso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Usuarios");
        menu = new JMenuBar();
        this.setJMenuBar(menu);
        opcion1 = new JMenu("Opciones");
        menu.add(opcion1);
        elemento1 = new JMenuItem("Perfil");
        elemento1.addActionListener(this);
        opcion1.add(elemento1);
        elemento2 = new JMenuItem("Contacto");
        elemento2.addActionListener(this);
        opcion1.add(elemento2);
        elemento4 = new JMenuItem("Usuarios");
        elemento4.addActionListener(this);
        opcion1.add(elemento4);
        elemento5 = new JMenuItem("Roles");
        elemento5.addActionListener(this);
        opcion1.add(elemento5);
        elemento6 = new JMenuItem("Permisos");
        elemento6.addActionListener(this);
        opcion1.add(elemento6);
        elemento7 = new JMenuItem("Productos");
        elemento7.addActionListener(this);
        opcion1.add(elemento7);
        elemento8 = new JMenuItem("Colaboradores");
        elemento8.addActionListener(this);
        opcion1.add(elemento8);
        elemento9 = new JMenuItem("Categorias");
        elemento9.addActionListener(this);
        opcion1.add(elemento9);
        elemento3 = new JMenuItem("Salir");
        elemento3.addActionListener(this);
        opcion1.add(elemento3);
        etiqueta1.setText("Usuario: ");
        seleccion1.addItem("Seleccionar Usuario");
        etiqueta2.setText("Rol: ");
        seleccion2.addItem("Seleccionar Rol");
        boton1.setText("Crear Permiso");
        boton2.setText("Cancelar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        etiqueta1 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JLabel();
        seleccion1 = new javax.swing.JComboBox<>();
        seleccion2 = new javax.swing.JComboBox<>();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        opcion1 = new javax.swing.JMenu();
        elemento1 = new javax.swing.JMenuItem();
        elemento2 = new javax.swing.JMenuItem();
        elemento4 = new javax.swing.JMenuItem();
        elemento5 = new javax.swing.JMenuItem();
        elemento6 = new javax.swing.JMenuItem();
        elemento7 = new javax.swing.JMenuItem();
        elemento8 = new javax.swing.JMenuItem();
        elemento9 = new javax.swing.JMenuItem();
        elemento3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiqueta1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta1.setText("jLabel1");

        etiqueta2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta2.setText("jLabel1");

        seleccion1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        seleccion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        seleccion2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        seleccion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton1.setText("jButton1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton2.setText("jButton1");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta2)
                            .addComponent(etiqueta1))
                        .addGap(69, 69, 69)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(seleccion2, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE)
                            .addComponent(seleccion1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(boton1)
                        .addGap(18, 18, 18)
                        .addComponent(boton2)
                        .addGap(25, 25, 25)))
                .addGap(116, 116, 116))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta1)
                    .addComponent(seleccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta2))
                .addGap(42, 42, 42)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton2)
                    .addComponent(boton1))
                .addGap(37, 37, 37))
        );

        menu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        opcion1.setText("File");

        elemento1.setText("jMenuItem1");
        opcion1.add(elemento1);

        elemento2.setText("jMenuItem1");
        opcion1.add(elemento2);

        elemento4.setText("jMenuItem1");
        opcion1.add(elemento4);

        elemento5.setText("jMenuItem1");
        opcion1.add(elemento5);

        elemento6.setText("jMenuItem1");
        opcion1.add(elemento6);

        elemento7.setText("jMenuItem1");
        opcion1.add(elemento7);

        elemento8.setText("jMenuItem1");
        opcion1.add(elemento8);

        elemento9.setText("jMenuItem1");
        opcion1.add(elemento9);

        elemento3.setText("jMenuItem1");
        opcion1.add(elemento3);

        menu.add(opcion1);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoPermiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoPermiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoPermiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoPermiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoPermiso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenuItem elemento1;
    private javax.swing.JMenuItem elemento2;
    private javax.swing.JMenuItem elemento3;
    private javax.swing.JMenuItem elemento4;
    private javax.swing.JMenuItem elemento5;
    private javax.swing.JMenuItem elemento6;
    private javax.swing.JMenuItem elemento7;
    private javax.swing.JMenuItem elemento8;
    private javax.swing.JMenuItem elemento9;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu opcion1;
    private javax.swing.JComboBox<String> seleccion1;
    private javax.swing.JComboBox<String> seleccion2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Perfil perfil = new Perfil();
        Contacto contacto = new Contacto();
        Roles roles = new Roles();
        Permisos permisos = new Permisos();
        Productos productos = new Productos();
        Colaboradores colaboradores = new Colaboradores();
        Categorias categorias = new Categorias();
        Login login = new Login();
        
        if (e.getSource()==elemento1) {
            perfil.setVisible(true);
            this.dispose();
        }
        if (e.getSource()==elemento2) {
            contacto.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == elemento5) {
            roles.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == elemento6) {
            permisos.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == elemento7) {
            productos.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == elemento8) {
            colaboradores.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == elemento9) {
            categorias.setVisible(true);
            this.dispose();
        }
        if (e.getSource()==elemento3) {
            login.setVisible(true);
            this.dispose();
        }
    }
}