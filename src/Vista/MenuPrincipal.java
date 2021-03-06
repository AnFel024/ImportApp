/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;


/**
 * Formulario que ejecutara principalmente el programa
 * @author Andrés Morales
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        botUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblMinuto = new javax.swing.JLabel();
        lblSegundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menBarra = new javax.swing.JMenuBar();
        MenSalir = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(650, 200, 0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(578, 499));
        setResizable(false);
        getContentPane().setLayout(null);

        botUsuario.setText("Menu Usuario");
        botUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botUsuario);
        botUsuario.setBounds(150, 260, 232, 55);

        jLabel3.setText("Hora");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 10, 40, 14);

        jLabel4.setText("Minuto");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 10, 32, 14);

        jLabel5.setText("Segundo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 10, 70, 14);

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHora.setText("0");
        getContentPane().add(lblHora);
        lblHora.setBounds(300, 20, 40, 50);

        lblMinuto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMinuto.setText("0");
        getContentPane().add(lblMinuto);
        lblMinuto.setBounds(350, 20, 40, 50);

        lblSegundo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSegundo.setText("0");
        getContentPane().add(lblSegundo);
        lblSegundo.setBounds(400, 20, 40, 50);

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Calculus Impuestus V. 1.0.2");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 140, 560, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/qwrq.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 590, 460);

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
    

    public JMenu getMenSalir() {
        return MenSalir;
    }

    public void setMenSalir(JMenu MenSalir) {
        this.MenSalir = MenSalir;
    }

    

    public JButton getBotUsuario() {
        return botUsuario;
    }

    public void setBotUsuario(JButton botUsuario) {
        this.botUsuario = botUsuario;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenSalir;
    private javax.swing.JButton botUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMinuto;
    private javax.swing.JLabel lblSegundo;
    private javax.swing.JMenuBar menBarra;
    // End of variables declaration//GEN-END:variables

    public JLabel getLblHora() {
        return lblHora;
    }

    public void setLblHora(JLabel lblHora) {
        this.lblHora = lblHora;
    }

    public JLabel getLblMinuto() {
        return lblMinuto;
    }

    public void setLblMinuto(JLabel lblMinuto) {
        this.lblMinuto = lblMinuto;
    }

    public JLabel getLblSegundo() {
        return lblSegundo;
    }

    public void setLblSegundo(JLabel lblSegundo) {
        this.lblSegundo = lblSegundo;
    }

    
}
