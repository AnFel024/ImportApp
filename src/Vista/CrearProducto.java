/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Empresa;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 * Formulario que permite establecer los valores para los atributos de un registro
 * de importacion que el usuario va a a ejectuar para realizar el respectivo
 * importe del producto
 * @author Andrés Morales
 */
public class CrearProducto extends javax.swing.JFrame{

    /**
     * Creates new form CrearUsuario
     */
    
    public CrearProducto() {
        initComponents();
        
        GrupoBotones.add(rbAereo);
        GrupoBotones.add(rbFerreo);
        GrupoBotones.add(rbTerrestre);
        GrupoBotones.add(rbMaritimo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        cobLocalidad = new javax.swing.JComboBox<>();
        cobBarrio = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botCrear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        spnValTMR = new javax.swing.JSpinner();
        cobTipo = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        spnValAdu = new javax.swing.JSpinner();
        spnCantidad = new javax.swing.JSpinner();
        spnValor = new javax.swing.JSpinner();
        cobEmpresa = new javax.swing.JComboBox<>();
        cobPais = new javax.swing.JComboBox<>();
        spnValTrans = new javax.swing.JSpinner();
        rbAereo = new javax.swing.JRadioButton();
        rbTerrestre = new javax.swing.JRadioButton();
        rbFerreo = new javax.swing.JRadioButton();
        rbMaritimo = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        menBarra = new javax.swing.JMenuBar();
        menEmpresa = new javax.swing.JMenu();
        menCrear = new javax.swing.JMenuItem();
        menVinculado = new javax.swing.JMenuItem();
        menEliminar = new javax.swing.JMenuItem();
        MenSalir = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        cobLocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cobBarrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 51, 0));
        jLabel13.setText("Localidad");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 51, 0));
        jLabel14.setText("Barrio");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        setBounds(new java.awt.Rectangle(650, 200, 0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1030, 575));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Coste de Transporte");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(650, 350, 160, 28);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("Tipo (Carro, Tela ...)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 60, 133, 28);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("Cantidad a Importar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 150, 133, 28);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setText("Valor Producto (en COP)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(83, 203, 190, 28);

        botVolver.setText("Volver");
        botVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVolverActionPerformed(evt);
            }
        });
        getContentPane().add(botVolver);
        botVolver.setBounds(10, 482, 129, 45);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 51, 0));
        jLabel7.setText("Direccion");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 100, 67, 28);

        botCrear.setText("Crear");
        botCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCrearActionPerformed(evt);
            }
        });
        getContentPane().add(botCrear);
        botCrear.setBounds(662, 482, 333, 45);

        jLabel11.setBackground(new java.awt.Color(255, 255, 102));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 51, 0));
        jLabel11.setText("Metodo de Envio");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(670, 210, 133, 28);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(185, 298, 0, 28);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("COSTOS DE IMPORTACION ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(630, 10, 188, 17);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 51, 0));
        jLabel16.setText("Pais de Origen");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(210, 350, 130, 17);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 51, 0));
        jLabel19.setText("Impuesto de Ingreso a la Aduana");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(590, 110, 270, 28);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("RELLENE TODOS LOS CAMPOS");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(320, 490, 270, 22);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 51, 0));
        jLabel20.setText("Nombre");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(90, 10, 133, 28);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 51, 0));
        jLabel12.setText("Tasa Representativa del Mercado");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(600, 40, 250, 28);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 51, 0));
        jLabel8.setText("Empresa Operadora");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(83, 261, 140, 17);

        pnlDatos.setOpaque(false);
        pnlDatos.setLayout(null);
        pnlDatos.add(txtNombre);
        txtNombre.setBounds(120, 10, 202, 20);

        spnValTMR.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        spnValTMR.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        pnlDatos.add(spnValTMR);
        spnValTMR.setBounds(450, 80, 220, 20);

        cobTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automovil", "Textiles", "Calzado", "Aparatos Electronicos Inteligentes" }));
        pnlDatos.add(cobTipo);
        cobTipo.setBounds(120, 60, 200, 20);

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        pnlDatos.add(txtDireccion);
        txtDireccion.setBounds(120, 110, 202, 20);

        spnValAdu.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        spnValAdu.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        pnlDatos.add(spnValAdu);
        spnValAdu.setBounds(450, 160, 220, 20);

        spnCantidad.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        pnlDatos.add(spnCantidad);
        spnCantidad.setBounds(180, 150, 58, 20);

        spnValor.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        spnValor.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        pnlDatos.add(spnValor);
        spnValor.setBounds(140, 210, 155, 20);

        cobEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        pnlDatos.add(cobEmpresa);
        cobEmpresa.setBounds(120, 260, 200, 20);

        cobPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alemania", "Australia", "Canadá", "China", "Colombia", "Corea del Sur", "Estados Unidos", "Egipto", "Francia", "Gran Bretaña", "India", "Japón", "Nueva Zelanda", "Rusia", "Sudáfrica" }));
        cobPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobPaisActionPerformed(evt);
            }
        });
        pnlDatos.add(cobPais);
        cobPais.setBounds(20, 380, 180, 20);

        spnValTrans.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        spnValTrans.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        pnlDatos.add(spnValTrans);
        spnValTrans.setBounds(450, 390, 220, 20);

        rbAereo.setText("Aereo");
        rbAereo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAereoActionPerformed(evt);
            }
        });
        pnlDatos.add(rbAereo);
        rbAereo.setBounds(450, 260, 121, 23);

        rbTerrestre.setText("Terrestre");
        pnlDatos.add(rbTerrestre);
        rbTerrestre.setBounds(570, 260, 121, 23);

        rbFerreo.setText("Ferreo");
        pnlDatos.add(rbFerreo);
        rbFerreo.setBounds(570, 300, 121, 23);

        rbMaritimo.setText("Maritimo");
        pnlDatos.add(rbMaritimo);
        rbMaritimo.setBounds(450, 300, 121, 23);

        getContentPane().add(pnlDatos);
        pnlDatos.setBounds(160, 0, 760, 430);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/qwrq.png"))); // NOI18N
        jLabel10.setText("jLabel9");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 0, 590, 540);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/qwrq.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-70, 0, 590, 540);

        menEmpresa.setText("Empresas Asociadas");

        menCrear.setText("Crear Empresa");
        menCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCrearActionPerformed(evt);
            }
        });
        menEmpresa.add(menCrear);

        menVinculado.setText("Empresas Vinculadas");
        menEmpresa.add(menVinculado);

        menEliminar.setText("Eliminar Empresa");
        menEmpresa.add(menEliminar);

        menBarra.add(menEmpresa);

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

    private void botVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botVolverActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void botCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botCrearActionPerformed

    private void rbAereoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAereoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAereoActionPerformed

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

    private void menCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menCrearActionPerformed

    private void cobPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cobPaisActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JMenu MenSalir;
    private javax.swing.JButton botCrear;
    private javax.swing.JButton botVolver;
    private javax.swing.JComboBox<String> cobBarrio;
    private javax.swing.JComboBox<String> cobEmpresa;
    private javax.swing.JComboBox<String> cobLocalidad;
    private javax.swing.JComboBox<String> cobPais;
    private javax.swing.JComboBox<String> cobTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menBarra;
    private javax.swing.JMenuItem menCrear;
    private javax.swing.JMenuItem menEliminar;
    private javax.swing.JMenu menEmpresa;
    private javax.swing.JMenuItem menVinculado;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JRadioButton rbAereo;
    private javax.swing.JRadioButton rbFerreo;
    private javax.swing.JRadioButton rbMaritimo;
    private javax.swing.JRadioButton rbTerrestre;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JSpinner spnValAdu;
    private javax.swing.JSpinner spnValTMR;
    private javax.swing.JSpinner spnValTrans;
    private javax.swing.JSpinner spnValor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public ButtonGroup getGrupoBotones() {
        return GrupoBotones;
    }

    public void setGrupoBotones(ButtonGroup GrupoBotones) {
        this.GrupoBotones = GrupoBotones;
    }

    public JButton getBotCrear() {
        return botCrear;
    }

    public void setBotCrear(JButton botCrear) {
        this.botCrear = botCrear;
    }

    public JButton getBotVolver() {
        return botVolver;
    }

    public void setBotVolver(JButton botVolver) {
        this.botVolver = botVolver;
    }

    public JComboBox<String> getCobPais() {
        return cobPais;
    }

    public void setCobPais(JComboBox<String> cobPais) {
        this.cobPais = cobPais;
    }

    public JRadioButton getRbAereo() {
        return rbAereo;
    }

    public void setRbAereo(JRadioButton rbAereo) {
        this.rbAereo = rbAereo;
    }

    public JRadioButton getRbFerreo() {
        return rbFerreo;
    }

    public void setRbFerreo(JRadioButton rbFerreo) {
        this.rbFerreo = rbFerreo;
    }

    public JRadioButton getRbMaritimo() {
        return rbMaritimo;
    }

    public void setRbMaritimo(JRadioButton rbMaritimo) {
        this.rbMaritimo = rbMaritimo;
    }

    public JRadioButton getRbTerrestre() {
        return rbTerrestre;
    }

    public void setRbTerrestre(JRadioButton rbTerrestre) {
        this.rbTerrestre = rbTerrestre;
    }

    public JSpinner getSpnCantidad() {
        return spnCantidad;
    }

    public void setSpnCantidad(JSpinner spnCantidad) {
        this.spnCantidad = spnCantidad;
    }

    public JSpinner getSpnValor() {
        return spnValor;
    }

    public void setSpnValor(JSpinner spnValor) {
        this.spnValAdu = spnValor;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JComboBox<String> getCobTipo() {
        return cobTipo;
    }

    public void setCobTipo(JComboBox<String> cobTipo) {
        this.cobTipo = cobTipo;
    }

    public JMenuItem getMenCrear() {
        return menCrear;
    }

    public void setMenCrear(JMenuItem menCrear) {
        this.menCrear = menCrear;
    }

    public JMenuItem getMenVinculado() {
        return menVinculado;
    }

    public void setMenVinculado(JMenuItem menVinculado) {
        this.menVinculado = menVinculado;
    }

    public JMenuItem getMenEliminar() {
        return menEliminar;
    }

    public void setMenEliminar(JMenuItem menEliminar) {
        this.menEliminar = menEliminar;
    }

    public JComboBox<String> getCobEmpresa() {
        return cobEmpresa;
    }

    public void setCobEmpresa(JComboBox<String> cobEmpresa) {
        this.cobEmpresa = cobEmpresa;
    }

    public JSpinner getSpnValAdu() {
        return spnValAdu;
    }

    public void setSpnValAdu(JSpinner spnValAdu) {
        this.spnValAdu = spnValAdu;
    }

    public JSpinner getSpnValTMR() {
        return spnValTMR;
    }

    public void setSpnValTMR(JSpinner spnValTMR) {
        this.spnValTMR = spnValTMR;
    }

    public JSpinner getSpnValTrans() {
        return spnValTrans;
    }

    public void setSpnValTrans(JSpinner spnValTrans) {
        this.spnValTrans = spnValTrans;
    }

    public JPanel getPnlDatos() {
        return pnlDatos;
    }

    public void setPnlDatos(JPanel pnlDatos) {
        this.pnlDatos = pnlDatos;
    }
    
}
