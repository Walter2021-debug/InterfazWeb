/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazong;

import componentead.Permiso;
import imagenes.LogicaNegocio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Permisos extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Permisos
     */
    public Permisos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Permisos");
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
        boton1.setText("Crear permiso");
        refrescarTabla();
    }
    
    private void refrescarTabla() {
        DefaultTableModel dtm = new DefaultTableModel(); 
        dtm.setColumnIdentifiers(new String[] {"PERMISO_ID","USUARIO","ROL"});
        
        List<Permiso> ListaPermisos = LogicaNegocio.getListaPermisos();
        
        for (Permiso permiso : ListaPermisos) {
            dtm.addRow(permiso.toArrayString());
        }
        this.tabla1.setModel(dtm);
        this.tabla2.setModel(dtm);
        
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
        pestañas = new javax.swing.JTabbedPane();
        pestaña1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        pestaña2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        boton1 = new javax.swing.JButton();
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

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        pestaña1.setViewportView(tabla1);

        pestañas.addTab("Previous", pestaña1);

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        pestaña2.setViewportView(tabla2);

        pestañas.addTab("Next", pestaña2);

        boton1.setText("jButton1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(boton1)
                .addGap(284, 284, 284))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pestañas, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(boton1)
                .addGap(35, 35, 35))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

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
        NuevoPermiso nuevoPermiso = new NuevoPermiso();
        nuevoPermiso.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Permisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Permisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Permisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Permisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Permisos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
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
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu opcion1;
    private javax.swing.JScrollPane pestaña1;
    private javax.swing.JScrollPane pestaña2;
    private javax.swing.JTabbedPane pestañas;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
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
