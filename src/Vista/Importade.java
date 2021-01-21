/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Funcion que permite interactuar, crear, eliminar, agregar productos a importar 
 * u observar los usuarios que interactuaran con el programa
 * @author Andrés
 */
public class Importade extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Importade() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        botMenu = new javax.swing.JButton();
        botSalir = new javax.swing.JButton();
        botCrear = new javax.swing.JButton();
        botIngresar = new javax.swing.JButton();
        botEliminar = new javax.swing.JButton();
        botExiste = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        menBarra = new javax.swing.JMenuBar();
        MenSalir = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(650, 200, 0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(530, 470));
        setPreferredSize(new java.awt.Dimension(555, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(24, 21, 3, 14);

        botMenu.setText("Volver al Menu Principal");
        botMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botMenu);
        botMenu.setBounds(331, 346, 209, 39);

        botSalir.setText("Salir");
        botSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botSalir);
        botSalir.setBounds(56, 346, 209, 39);

        botCrear.setText("Crear Usuario");
        botCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCrearActionPerformed(evt);
            }
        });
        getContentPane().add(botCrear);
        botCrear.setBounds(180, 30, 235, 31);

        botIngresar.setText("Gestionar Productos a Importar");
        botIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(botIngresar);
        botIngresar.setBounds(180, 90, 240, 31);

        botEliminar.setText("Eliminar Usuario");
        botEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botEliminar);
        botEliminar.setBounds(180, 160, 240, 31);

        botExiste.setText("Usuarios Existentes");
        botExiste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botExiste);
        botExiste.setBounds(180, 240, 240, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/qwrq.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 570, 440);

        MenSalir.setText("Ayuda");
        MenSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenSalirActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Programa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenSalir.add(jMenuItem2);

        jMenuItem1.setText("Quienes Somos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenSalir.add(jMenuItem1);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenSalir.add(jMenuItem3);

        menBarra.add(MenSalir);

        setJMenuBar(menBarra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botEliminarActionPerformed

    private void botIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botIngresarActionPerformed

    private void botCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botCrearActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void MenSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenSalirActionPerformed
        System.exit(0);
        JOptionPane.showMessageDialog(rootPane, "Hola");
    }//GEN-LAST:event_MenSalirActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenSalir;
    private javax.swing.JButton botCrear;
    private javax.swing.JButton botEliminar;
    private javax.swing.JButton botExiste;
    private javax.swing.JButton botIngresar;
    private javax.swing.JButton botMenu;
    private javax.swing.JButton botSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menBarra;
    // End of variables declaration//GEN-END:variables

    public JButton getBotCrear() {
        return botCrear;
    }

    public void setBotCrear(JButton botCrear) {
        this.botCrear = botCrear;
    }

    public JButton getBotExiste() {
        return botExiste;
    }

    public void setBotExiste(JButton botExiste) {
        this.botExiste = botExiste;
    }

    public JButton getBotIngresar() {
        return botIngresar;
    }

    public void setBotIngresar(JButton botIngresar) {
        this.botIngresar = botIngresar;
    }

    public JButton getBotMenu() {
        return botMenu;
    }

    public void setBotMenu(JButton botMenu) {
        this.botMenu = botMenu;
    }

    public JButton getBotSalir() {
        return botSalir;
    }

    public void setBotSalir(JButton botSalir) {
        this.botSalir = botSalir;
    }

    public JButton getBotEliminar() {
        return botEliminar;
    }

    public void setBotEliminar(JButton botEliminar) {
        this.botEliminar = botEliminar;
    }

}