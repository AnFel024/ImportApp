package Controlador;

import Modelo.Empresa;
import Modelo.Importador;
import Modelo.Listado;
import Modelo.Producto;
import Modelo.RegistroImportacion;
import Vista.CrearUsuario;
import Vista.CrearEmpresa;
import Vista.Importade;
import Vista.MenuPrincipal;
import Vista.Auxiliar;
import Vista.CrearProducto;
import Vista.FormProducto;
import Vista.TblEmpresa;
import Vista.TblProductos;
import Vista.UsuariosEx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

/**
 * Permite gestionar el uso de la vista para obtener los datos 
 * y generar los resultados
 * 
 * @author Andrés Morales
 */

public class Controlador implements ActionListener, Runnable{
    
    private MenuPrincipal ForMP;
    private CrearEmpresa ForE;
    private Importade ForU;
    private Auxiliar ForA;
    private FormProducto ForP;
    private CrearUsuario ForCU;
    private CrearProducto ForCP;
    private UsuariosEx ForUE;
    private TblProductos ForUP;
    private TblEmpresa ForTE;
    private Listado ArlI;
    private Conexion ObjC;
    private int Count, PosicionUsuario, Stop, ModProd, PosicionProducto;
    private Thread Hilo;
    
    
    /**
     *  Constructor que inicializa los objetos, las variables y los JFrames
     *  correspondientes al programa 
     * @throws java.io.IOException
     */
    public Controlador() throws IOException {
        
        this.Count = 0;
        this.PosicionUsuario = 0;
        this.PosicionProducto = 0;
        this.Stop = 0;
        this.ModProd = 0;
        this.Hilo = new Thread(this);
        
        this.ForMP = new MenuPrincipal();
        this.ForE = new CrearEmpresa();
        this.ForU = new Importade();
        this.ForA = new Auxiliar();
        this.ForP = new FormProducto();
        this.ForCU = new CrearUsuario();
        this.ArlI = new Listado();
        this.ForCP = new CrearProducto();/////////////////
        this.ForUE = new UsuariosEx();
        this.ForUP = new TblProductos();
        this.ForTE = new TblEmpresa();
        this.ObjC = new Conexion();
        
        this.ForA.getBotAceptar().addActionListener(this);
        this.ForU.getBotMenu().addActionListener(this);
        this.ForU.getBotCrear().addActionListener(this);
        this.ForU.getBotSalir().addActionListener(this);
        this.ForE.getBotCrear().addActionListener(this);
        this.ForE.getBotVolver().addActionListener(this);
        this.ForP.getBotAgregar().addActionListener(this);
        this.ForP.getBotEliminar().addActionListener(this);
        this.ForP.getBotImporte().addActionListener(this);
        this.ForP.getBotModificar().addActionListener(this);
        this.ForP.getBotVolver().addActionListener(this);
        this.ForP.getBotSalir().addActionListener(this);
        this.ForU.getBotExiste().addActionListener(this);
        this.ForU.getBotIngresar().addActionListener(this);
        this.ForU.getBotEliminar().addActionListener(this);
        this.ForUE.getBotVolver().addActionListener(this);
        this.ForUP.getBotVolver().addActionListener(this);
        this.ForCU.getBotCrear().addActionListener(this);
        this.ForCU.getBotVolver().addActionListener(this);
        this.ForCP.getBotCrear().addActionListener(this);
        this.ForCP.getBotVolver().addActionListener(this);
        this.ForCP.getMenCrear().addActionListener(this);
        this.ForCP.getCobPais().addActionListener(this);
        this.ForCP.getMenVinculado().addActionListener(this);
        this.ForCP.getMenEliminar().addActionListener(this);
        this.ForCP.getRbAereo().addActionListener(this);
        this.ForCP.getRbTerrestre().addActionListener(this);
        this.ForCP.getRbMaritimo().addActionListener(this);
        this.ForCP.getRbFerreo().addActionListener(this);
        this.ForMP.getBotUsuario().addActionListener(this);
        this.ForMP.getMenSalir().addActionListener(this);///////////////////
        this.ForTE.getBotVolver().addActionListener(this);
    }
    
    /**
     * Funcion que permite visibilizar el JFrame principal
     * 
     * @param Bool
     */
    public void Iniciar (boolean Bool)
    {
        ForMP.setVisible(Bool);
        Hilo.start();
        int hora=0, minuto=0, segundo=0;
        
        Calendar calendario = new GregorianCalendar();

        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND);

        ForMP.getLblHora().setText(String.valueOf(hora));
        ForMP.getLblMinuto().setText(String.valueOf(minuto));
        ForMP.getLblSegundo().setText(String.valueOf(segundo));
    }
    
    /**
     * Permite asignar los datos de las casillas corespondientes 
     * de la tabla que contiene la informacion de los usuarios que 
     * van a importar distintas variedades de productos
     * 
     * @param Tabla
     */
    public void asignarDatosUsuario(JTable Tabla)
    {
        DefaultTableModel ObjM = (DefaultTableModel) Tabla.getModel();
        
        for (int i=0; i<ArlI.getAriI().size();i++)
        {   
            Object [] DatosF = { ArlI.getAriI().get(i).getNombre(), ArlI.getAriI().get(i).getApellido(), 
                ArlI.getAriI().get(i).getDireccion(), ArlI.getAriI().get(i).getTelefono(), ArlI.getAriI().get(i).getRUT(), 
                ArlI.getAriI().get(i).getMoneda(), ArlI.getAriI().get(i).getEdad().getFecha(),ArlI.getAriI().get(i).getArlR().size()};
            
            ObjM.addRow(DatosF);
        }
    }
    
    /**
     * Permite asignar los datos de las casillas corespondientes 
     * de la tabla que contiene la informacion de los productos 
     * de cada uno de los usuarios que se van a importar
     * 
     * @param Tabla
     */
    public void asignarDatosProducto(JTable Tabla)
    {
        DefaultTableModel ObjM = (DefaultTableModel) Tabla.getModel();
        
        for (int i=0; i<ArlI.getAriI().get(PosicionUsuario).getArlR().size();i++)
        {   
            Object [] DatosF = {ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getObjP().getNombre(), 
                ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getObjP().getTipo(),
                ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getOrigen(),
                ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getDireccion(),
                ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getCantidadP(),
                ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getObjP().getValor(),
                ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getMetodoEnvio(),
                ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getObjE().getNombre(),
                ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getValorTotal(),
                ArlI.getAriI().get(PosicionUsuario).getMoneda()};
            
            ObjM.addRow(DatosF);
        }
    }
    
    /**
     * Funcion que recibe la tabla correspondiente a las empresas ingresadas
     * y le asigna sus correspondientes datos con las mismas (empresas) ingresadas
     * dentro del arreglo de empresas.
     * @param Tabla
     */
    public void asignarDatosEmpresa(JTable Tabla)
    {
        DefaultTableModel ObjM = (DefaultTableModel) Tabla.getModel();
        
        for (int i=0; i<ArlI.getAriE().size();i++)
        {   
            Object [] DatosF = {ArlI.getAriE().get(i).getNombre(),ArlI.getAriE().get(i).getTelefono(),
                ArlI.getAriE().get(i).getURLEmpresa(),ArlI.getAriE().get(i).getArlM().toString()};
            ObjM.addRow(DatosF);
        }
    }
    /**
     * Funcion que obtiene el nombre del usuario y devuelve su posicion dentro
     * del arreglo de usuarios ingresados en el porgrama
     * @param Nombre
     * @return int
     */
    public int obtenerNombre(String Nombre)
    {
        int Ind = 0;
        
        for (int i=0; i<ArlI.getAriI().size(); i++)
        {
            if(ArlI.getAriI().get(i).getNombre() == Nombre)
            {
                Ind = i;
                break;
            }
        }
        return Ind;
    }    
      
    /**
     * Permite inicializar las tablas, limpiandolas y pre disponerlas para
     * la adicion de sus correspondientes datos
     * 
     * @param Tabla
     */
    public void limpiarTabla(JTable Tabla)
    {
        DefaultTableModel ObjM = (DefaultTableModel) Tabla.getModel();
        for (int i=(Tabla.getRowCount()-1);i>=0;i--)
        {
            ObjM.removeRow(i);
        }
    }
    
    /**
     * Funcion que recibe el nombre del tipo de metodo de envio 
     * por el que se va a importar el producto y muestra unicamente
     * las empresas que ofrecen ese metodo de envio.
     * 
     * @param Tipo 
     */
    
    public void listBotones (String Tipo) 
    {
                if (ArlI.getAriE().isEmpty() == false)
            {   
                ForCP.getCobEmpresa().removeAllItems();
                for(int i=0; i<ArlI.getAriE().size(); i++)
                {
                    for(int c=0; c<ArlI.getAriE().get(i).getArlM().size(); c++)
                    {
                        if (ArlI.getAriE().get(i).getArlM().get(c).equals(Tipo))
                            ForCP.getCobEmpresa().addItem(ArlI.getAriE().get(i).getNombre());
                    }
                }
                ForCP.getCobEmpresa().removeItem("No hay Empresas Ingresadas");
                ForCP.getCobEmpresa().removeItem(" ");
                ForCP.getCobEmpresa().enable();
            }

            else
            {
                ForCP.getCobEmpresa().removeAllItems();
                ForCP.getCobEmpresa().addItem("No hay Empresas Ingresadas");
                ForCP.getCobEmpresa().disable();
            }
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(ForMP.getBotUsuario() == e.getSource())
        {
            ForMP.setVisible(false);
            ForMP.dispose();
            ForU.setVisible(true);
        }
        
        else if(ForU.getBotMenu() == e.getSource())
        {
            ForU.setVisible(false);
            ForMP.dispose();
            ForMP.setVisible(true);
        }
        
        else if(ForCU.getBotVolver()== e.getSource())
        {
            ForCU.setVisible(false);
            ForCU.dispose();
            ForU.setVisible(true);
        }
        
        else if (ForMP.getMenSalir() == e.getSource() || ForP.getBotSalir() == e.getSource() || ForU.getBotSalir() == e.getSource())
        {
            System.exit(0);
        }
        
        else if (ForU.getBotCrear() == e.getSource())
        {
            ForU.setVisible(false);
            ForU.dispose();
            ForCU.setVisible(true);
            limpiarCampos(ForCU.getPnlTexto());
        }
        
        else if (ForCU.getBotCrear() == e.getSource())
        {   Stop = 0;
        
            if (ForCU.getTxtNombre().getText().equals("") || ForCU.getTxtDireccion().getText().equals("") || ForCU.getTxtApellido().getText().equals("") || ForCU.getTxtRUT().getText().equals("") || ForCU.getTxtTelefono().getText().equals(""))
            {
                JOptionPane.showMessageDialog(ForE, "Ingrese todos los campos requeridos");
                Stop = 1;
            }
            
            if(ForCU.getCmbPeso().getSelectedItem().equals("Seleccionar"))
            {
                JOptionPane.showMessageDialog(ForE, "Ingrese una moneda a utilizar");
                Stop = 1;
            }
        
        else if (Stop == 0)
        {
                try
            {
                Importador temp = new Importador();
            
                temp.setNombre(ForCU.getTxtNombre().getText());
                temp.setApellido(ForCU.getTxtApellido().getText());
                temp.setDireccion(ForCU.getTxtDireccion().getText());
                temp.setTelefono(Integer.parseInt(ForCU.getTxtTelefono().getText()));
                temp.setRUT(Integer.parseInt(ForCU.getTxtRUT().getText()));
                temp.setMoneda(ForCU.getCmbPeso().getSelectedItem().toString());
                temp.getEdad().setDia(Integer.parseInt(ForCU.getSpnDia().getValue().toString()));
                temp.getEdad().setMes(Integer.parseInt(ForCU.getSpnMes().getValue().toString()));
                temp.getEdad().setAnio(Integer.parseInt(ForCU.getSpnAnio().getValue().toString()));
                temp.getEdad().CalcularFecha();

                ArlI.getAriI().add(temp);

                ForCU.setVisible(false);
                ForU.dispose();
                ForU.setVisible(true);
                JOptionPane.showMessageDialog(ForMP, "Usuario Ingresado");
            }
            
            catch (NumberFormatException err)
            {
                JOptionPane.showMessageDialog(ForCU, "Se genero un error al ingresar " + err.getMessage().substring(18) + " en vez de un numero. Proceda de nuevo", "Error", 0);
            }
          }
        }
        
        
        else if (ForU.getBotExiste() == e.getSource())
        {
            
            ForU.setVisible(false);
            ForU.dispose();
            limpiarTabla(ForUE.getjTabla());
            asignarDatosUsuario(ForUE.getjTabla());
            ForUE.setVisible(true);
            
        }
        
        else if (ForUE.getBotVolver() == e.getSource())
        {
            ForUE.setVisible(false);
            ForUE.dispose();
            ForU.setVisible(true);
        }
        
        else if (ForU.getBotIngresar() == e.getSource())
        {
            if(ArlI.getAriI().size() == 0)
            {
                JOptionPane.showMessageDialog(ForU, "No hay usuarios ingresados", "Error", 0);
            }
            
            else
            {
                ForU.setVisible(false);
                ForU.dispose();
                ForA.setVisible(true);

                for(int i=0; i<ArlI.getAriI().size(); i++)
                {
                    ForA.getLblTexto().setText("Usuario");
                    ForA.getCobProd().addItem(ArlI.getAriI().get(i).getNombre());
                    Count = 1;
                }
            }
        }
        
        else if (ForU.getBotEliminar() == e.getSource())
        {
            if(ArlI.getAriI().size() == 0)
            {
                JOptionPane.showMessageDialog(ForMP, "No hay usuarios ingresados", "Error", 0);
            }
            
            else
            {
                ForA.setVisible(true);
                
                for(int i=0; i<ArlI.getAriI().size(); i++)
                {
                    ForA.getLblTexto().setText("Usuario");
                    ForA.getCobProd().addItem(ArlI.getAriI().get(i).getNombre());
                    Count = 2;
                }
            }
        }
        
        else if (ForA.getBotAceptar() == e.getSource())
        {
            if(Count == 6)
            {
                for(int i=0; i<ArlI.getAriE().size(); i++)
                {
                    if(ArlI.getAriE().get(i).getNombre() == ForA.getCobProd().getSelectedItem().toString())
                    {
                        try {
                            ObjC.borrarDatos(ForA.getCobProd().getSelectedItem().toString());
                        } 
                        
                        catch (IOException ex) {
                            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        ArlI.getAriE().remove(i);
                        JOptionPane.showMessageDialog(ForA, "Empresa Eliminada");
                        ForCP.getCobEmpresa().removeItem(ForA.getCobProd().getSelectedItem().toString());
                        ForA.getCobProd().removeAllItems();
                        ForA.setVisible(false);
                        ForA.dispose();
                        break;
                    }
                }
            }
            
            if(Count == 5)
            {
                for(int i=0; i<ArlI.getAriI().get(PosicionUsuario).getArlR().size(); i++)///////////////
                {       
                    if(ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getObjP().getNombre() == ForA.getCobProd().getSelectedItem().toString())
                        
                    {
                        ArlI.getAriI().get(PosicionUsuario).getArlR().remove(i);
                        JOptionPane.showMessageDialog(ForMP, "Producto Seleccionado");
                        ForA.getCobProd().removeAllItems();
                        ForA.setVisible(false);
                        ForA.dispose();
                        break;
                    }
                }
            }
            
            if(Count == 4)
            {
                for(int i=0; i<ArlI.getAriI().get(PosicionUsuario).getArlR().size(); i++)
                {           
                    if(ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getObjP().getNombre() == ForA.getCobProd().getSelectedItem().toString())
                    {
                        ArlI.getAriI().get(PosicionUsuario).getArlR().remove(i);
                        JOptionPane.showMessageDialog(ForMP, "Producto Eliminado");
                        ForA.getCobProd().removeAllItems();
                        ForA.setVisible(false);
                        ForA.dispose();
                        break;
                    }
                }
            }
            
            if (Count == 3)
            {
                for (int i =0; i<ArlI.getAriI().get(PosicionUsuario).getArlR().size(); i++)
                {
                    if(ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getObjP().getNombre() == ForA.getCobProd().getSelectedItem().toString())
                    {
                        ForCP.getCobEmpresa().removeAllItems();
                        ForCP.getCobEmpresa().addItem("No hay Empresas Ingresadas");
                        this.PosicionProducto = i;
                        RegistroImportacion tem = ArlI.getAriI().get(PosicionUsuario).getArlR().get(PosicionProducto);

                        ForCP.getTxtNombre().setText(tem.getObjP().getNombre());
                        ForCP.getTxtDireccion().setText(tem.getDireccion());
                        ForCP.getCobPais().setSelectedItem(tem.getOrigen());
                        ForCP.getCobTipo().setSelectedItem(tem.getObjP().getTipo());
                        ForCP.getSpnCantidad().setValue(tem.getCantidadP());
                        ForCP.getSpnValAdu().setValue(tem.getAduana());
                        ForCP.getSpnValTrans().setValue(tem.getCosto());
                        ForCP.getSpnValTMR().setValue(tem.getTMR());
                        ForCP.getSpnValor().setValue(tem.getObjP().getValor());

                        ModProd = 1;

                        ForA.getCobProd().removeAllItems();
                        ForA.setVisible(false);
                        ForCP.setVisible(true);
                        break;
                    }
                }
                
            }
            
            if(Count == 2)
            {
                    int Cont = obtenerNombre(ForA.getCobProd().getSelectedItem().toString());
                    ArlI.getAriI().remove(Cont);
                    JOptionPane.showMessageDialog(ForMP, "Usuario Eliminado");
                    ForA.getCobProd().removeAllItems();
                    ForA.setVisible(false);
                    ForA.dispose();
                    
            }
            
            if(Count == 1)
            {
                for(int i=0; i<ArlI.getAriI().size(); i++)
                {           
                    if(ArlI.getAriI().get(i).getNombre() == ForA.getCobProd().getSelectedItem().toString())
                    {   
                        int Cont = obtenerNombre(ForA.getCobProd().getSelectedItem().toString());
                        ForP.getLblNombre().setText(ArlI.getAriI().get(i).getNombre());
                        PosicionUsuario = i;
                        JOptionPane.showMessageDialog(ForMP, "Usuario Seleccionado");
                        ForA.getCobProd().removeAllItems();
                        ForP.setVisible(true);
                        ForA.setVisible(false);
                        ForA.dispose();
                        break;
                    }
                }
            }
        }
        
        else if (ForP.getBotVolver() == e.getSource())
        {
            ForP.setVisible(false);
            ForP.dispose();
            ForU.setVisible(true);
        }
        
        else if (ForP.getBotModificar() == e.getSource())
        {
            if(ArlI.getAriI().get(PosicionUsuario).getArlR().size() == 0)
            {
                JOptionPane.showMessageDialog(ForP, "No hay productos ingresados para "+ForP.getLblNombre().getText(), "Error", 0);
            }   
            
            else
            {
                for(int i=0; i<ArlI.getAriI().get(PosicionUsuario).getArlR().size(); i++)
                {
                    Count = 3;
                    ForA.getLblTexto().setText("Producto");
                    ForA.getCobProd().addItem(ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getObjP().getNombre());
                    ForA.setVisible(true);
                }
            }
        }
        
        else if(ForP.getBotAgregar() == e.getSource())
        {
            limpiarCampos(ForCP.getPnlDatos());
            ForP.setVisible(false);
            ForP.dispose();
            ForCP.setVisible(true);
            
            try {
                llenarLista();
            } 
            
            catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(ArlI.getAriI().get(PosicionUsuario).getMoneda().contains("Peso") == true)
                    {
                        ForCP.getSpnValTMR().setValue(1);
                        ForCP.getSpnValTMR().setEnabled(false);
                    }
            
            else
                ForCP.getSpnValTMR().setEnabled(true);
            
            if(ArlI.getAriE().size() == 0)
            {
                ForCP.getCobEmpresa().removeAllItems();
                ForCP.getCobEmpresa().addItem("No hay Empresas Ingresadas");
                ForCP.getCobEmpresa().enable(false);
            }
            
        }
        
        else if(ForCP.getBotCrear() == e.getSource())
        {
            if(this.ModProd == 0)
            {
                Stop = 0;
            if (ForCP.getRbAereo().isSelected() == false && ForCP.getRbMaritimo().isSelected() == false && ForCP.getRbTerrestre().isSelected() == false && ForCP.getRbFerreo().isSelected() == false)
            {
                JOptionPane.showMessageDialog(ForE, "Seleccione algun metodo de envio");
                Stop = 1;
            }
            
            if (ForCP.getTxtNombre().getText().equals("") || ForCP.getTxtDireccion().equals(""))
            {
                JOptionPane.showMessageDialog(ForE, "Ingrese todos los campos");
                Stop = 1;
            }
            
            if (ForCP.getCobPais().getSelectedItem().equals(" ") || ForCP.getCobPais().getSelectedItem().equals("-"))
            {
                JOptionPane.showMessageDialog(ForE, "Ingrese el pais de origen");
                Stop = 1;
            }
            
            if (ForCP.getCobEmpresa().getSelectedItem().equals("No hay Empresas Ingresadas"))
            {
                JOptionPane.showMessageDialog(ForE, "Seleccione la empresa operadora");
                Stop = 1;
            }
            
            else if (Stop == 0)
                {
                    RegistroImportacion temp = new RegistroImportacion();
                    Producto aux = new Producto();                    
                    
                    aux.setNombre(ForCP.getTxtNombre().getText());
                    aux.setTipo(ForCP.getCobTipo().getSelectedItem().toString());
                    aux.setValor(Double.parseDouble(ForCP.getSpnValor().getValue().toString()));
                                        
                    temp.setCantidadP(Integer.parseInt(ForCP.getSpnCantidad().getValue().toString()));
                    temp.setObjP(aux);
                    temp.setDireccion(ForCP.getTxtDireccion().getText());
                    temp.setAduana(Double.parseDouble(ForCP.getSpnValAdu().getValue().toString()));
                    temp.setTMR(Double.parseDouble(ForCP.getSpnValTMR().getValue().toString()));
                    temp.setCosto(Double.parseDouble(ForCP.getSpnValTrans().getValue().toString()));
                    
                    if(ForCP.getRbAereo().isSelected() == true)
                        temp.setMetodoEnvio("Aereo");
                    if(ForCP.getRbFerreo().isSelected() == true)
                        temp.setMetodoEnvio("Ferreo");
                    if(ForCP.getRbMaritimo().isSelected() == true)
                        temp.setMetodoEnvio("Maritimo");
                    if(ForCP.getRbTerrestre().isSelected() == true)
                        temp.setMetodoEnvio("Terrestre");
                    
                    temp.setOrigen(ForCP.getCobPais().getSelectedItem().toString());
                    
                    for (int i=0; i<ArlI.getAriE().size(); i++)
                    {
                        if(ArlI.getAriE().get(i).getNombre() == ForCP.getCobEmpresa().getItemAt(PosicionUsuario))
                        {
                            temp.setObjE(ArlI.getAriE().get(i));
                        }
                    }
                    
                    temp.setValorTotal(this.valorTotal(
                                    temp.getTMR(), 
                                    temp.getAduana(), 
                                    temp.getCosto(), 
                                    aux.getValor(),
                                    temp.getCantidadP(),
                                    aux.getTipo()
                                                 )
                                    );
                    
                    ArlI.getAriI().get(PosicionUsuario).getArlR().add(temp);
                    
                    JOptionPane.showMessageDialog(ForMP, "Producto Agregado");
                    
                    ForCP.setVisible(false);
                    ForCP.dispose();
                    ForP.setVisible(true);
                }
            }
            
            else
            {
                Stop = 0;
                if (ForCP.getRbAereo().isSelected() == false && ForCP.getRbMaritimo().isSelected() == false && ForCP.getRbTerrestre().isSelected() == false && ForCP.getRbFerreo().isSelected() == false)
                {
                    JOptionPane.showMessageDialog(ForE, "Seleccione algun metodo de envio");
                    Stop = 1;
                }

                if (ForCP.getTxtNombre().getText().equals("") || ForCP.getTxtDireccion().equals(""))
                {
                    JOptionPane.showMessageDialog(ForE, "Ingrese todos los campos");
                    Stop = 1;
                }

                if (ForCP.getCobPais().getSelectedItem().equals(" ") || ForCP.getCobPais().getSelectedItem().equals("-"))
                {
                    JOptionPane.showMessageDialog(ForE, "Ingrese el pais de origen");
                    Stop = 1;
                }

                if (ForCP.getCobEmpresa().getSelectedItem().equals("No hay Empresas Ingresadas"))
                {
                    JOptionPane.showMessageDialog(ForE, "Seleccione la empresa operadora");
                    Stop = 1;
                }

                else if (Stop == 0)
                {
                        RegistroImportacion temp = new RegistroImportacion();
                        Producto aux = new Producto();                    

                        aux.setNombre(ForCP.getTxtNombre().getText());
                        aux.setTipo(ForCP.getCobTipo().getSelectedItem().toString());
                        aux.setValor(Double.parseDouble(ForCP.getSpnValor().getValue().toString()));

                        temp.setCantidadP(Integer.parseInt(ForCP.getSpnCantidad().getValue().toString()));
                        temp.setObjP(aux);
                        temp.setDireccion(ForCP.getTxtDireccion().getText());
                        temp.setAduana(Double.parseDouble(ForCP.getSpnValAdu().getValue().toString()));
                        temp.setTMR(Double.parseDouble(ForCP.getSpnValTMR().getValue().toString()));
                        temp.setCosto(Double.parseDouble(ForCP.getSpnValTrans().getValue().toString()));

                        if(ForCP.getRbAereo().isSelected() == true)
                            temp.setMetodoEnvio("Aereo");
                        if(ForCP.getRbFerreo().isSelected() == true)
                            temp.setMetodoEnvio("Ferreo");
                        if(ForCP.getRbMaritimo().isSelected() == true)
                            temp.setMetodoEnvio("Maritimo");
                        if(ForCP.getRbTerrestre().isSelected() == true)
                            temp.setMetodoEnvio("Terrestre");

                        temp.setOrigen(ForCP.getCobPais().getSelectedItem().toString());
                    
                        for (int i=0; i<ArlI.getAriE().size(); i++)
                    {
                        if(ArlI.getAriE().get(i).getNombre() == ForCP.getCobEmpresa().getItemAt(PosicionUsuario))
                        {
                            temp.setObjE(ArlI.getAriE().get(i));
                        }
                    }
                        temp.setValorTotal(this.valorTotal(
                                        temp.getTMR(), 
                                        temp.getAduana(), 
                                        temp.getCosto(), 
                                        aux.getValor(),
                                        temp.getCantidadP(),
                                        aux.getTipo()
                                                     )
                                        );

                        ArlI.getAriI().get(PosicionUsuario).getArlR().set(PosicionProducto, temp);

                        JOptionPane.showMessageDialog(ForMP, "Producto Modificado");
                        
                        this.ModProd = 0;

                        ForCP.setVisible(false);
                        ForCP.dispose();
                        ForP.setVisible(true);
                }
            }
            
        }
        
        else if (ForP.getBotEliminar() == e.getSource())
        {
            if(ArlI.getAriI().get(PosicionUsuario).getArlR().size() == 0)
            {
                JOptionPane.showMessageDialog(ForMP, "No hay productos a importar");
            }
            
            else
            {
                for(int i=0; i<ArlI.getAriI().get(PosicionUsuario).getArlR().size(); i++)
                {
                    Count = 4;
                    ForA.getLblTexto().setText("Producto");
                    ForA.getCobProd().addItem(ArlI.getAriI().get(PosicionUsuario).getArlR().get(i).getObjP().getNombre());
                    ForA.setVisible(true);
                }
                
            }
        }
        
        else if (ForP.getBotImporte() == e.getSource())
        {
            ForP.setVisible(false);
            ForP.dispose();
            limpiarTabla(ForUP.getTblProducto());
            asignarDatosProducto(ForUP.getTblProducto());
            ForUP.setVisible(true);
        }
        
        else if (ForUP.getBotVolver() == e.getSource())
        {
            ForUP.setVisible(false);
            ForUP.dispose();
            ForP.setVisible(true);
        }
        
        
        
        else if (ForCP.getBotVolver() == e.getSource())
        {
            ForCP.setVisible(false);
            ForCP.dispose();
            ForP.setVisible(true);
            
        }
        
        else if (ForCP.getMenCrear() == e.getSource())
        {
            ForE.setVisible(true);
            ForE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        
        else if (ForE.getBotCrear()== e.getSource())
        {
            Stop = 0;
            if (ForE.getChkAereo().isSelected() == false && ForE.getChkTerrestre().isSelected() == false && ForE.getChkFerreo().isSelected() == false && ForE.getChkMaritimo().isSelected() == false)
            {
                JOptionPane.showMessageDialog(ForE, "Seleccione algun metodo de envio");
                Stop = 1;
            }
            
            if (ForE.getTxtNombre().getText().equals("") || ForE.getTxtURL().getText().equals("") || ForE.getTxtTelefono().getText().equals(""))
            {
                JOptionPane.showMessageDialog(ForE, "Ingrese todos los campos y seleccione algun metodo de envio");
                Stop = 1;
            }
            else if (Stop == 0)
            {   
                try
                {
                    Empresa ObjE = new Empresa();
                    
                    ObjE.setNombre(ForE.getTxtNombre().getText());
                    ObjE.setTelefono(Integer.parseInt(ForE.getTxtTelefono().getText()));
                    ObjE.setURLEmpresa(ForE.getTxtURL().getText());

                    if(ForE.getChkAereo().isSelected())
                        ObjE.getArlM().add(ForE.getChkAereo().getText());
                    if(ForE.getChkFerreo().isSelected())
                        ObjE.getArlM().add(ForE.getChkFerreo().getText());

                    if(ForE.getChkMaritimo().isSelected())
                        ObjE.getArlM().add(ForE.getChkMaritimo().getText());

                    if(ForE.getChkTerrestre().isSelected())
                        ObjE.getArlM().add(ForE.getChkTerrestre().getText());
                    
                    ArlI.getAriE().add(ObjE);
                    
                    try {
                        ObjC.EscribeDatos(ObjE.Datos());
                    } 
                    
                    catch (IOException ex) {
                        JOptionPane.showMessageDialog(ForE, "Error al acceder al archivo .-.");
                    }
                    
                    JOptionPane.showMessageDialog(ForCP, "Empresa Agregada");
                    ForE.setVisible(false);
                    ForE.dispose();
                }
                
                catch (NumberFormatException err)
                {
                    JOptionPane.showMessageDialog(ForE, "Se genero un error al ingresar " + err.getMessage().substring(18) + " en vez de un numero. Proceda de nuevo", "Error", 0);
                }
            }
        }
        
        else if (ForE.getBotVolver()== e.getSource())
        {
            ForE.setVisible(false);
            ForE.dispose();
        }
        
        else if(ForCP.getMenVinculado() == e.getSource())
        {
            ForTE.setVisible(true);
            limpiarTabla(ForTE.getTblProducto());
            asignarDatosEmpresa(ForTE.getTblProducto());
        }
        
        else if (ForTE.getBotVolver() == e.getSource())
        {
            ForTE.setVisible(false);
            ForTE.dispose();
            ForCP.setVisible(true);
        }
        
        else if (ForCP.getMenEliminar() == e.getSource())
        {
            if(ArlI.getAriE().size() == 0)
            {
                JOptionPane.showMessageDialog(ForP, "No hay Empresas ingresadas ", "Error", 0);
            }   
            
            else
            {
                for(int i=0; i<ArlI.getAriE().size(); i++)
                {
                    ForA.getLblTexto().setText("Empresa");
                    ForA.getCobProd().addItem(ArlI.getAriE().get(i).getNombre());
                    Count = 6;
                }
                
                ForA.setVisible(true);
            }
            
        }
        
        else if (ForCP.getRbAereo() == e.getSource())
        {
            listBotones("Aereo");
        }
        
        else if (ForCP.getRbTerrestre()== e.getSource())
        {
            listBotones("Terrestre");
        }
        
        else if (ForCP.getRbMaritimo()== e.getSource())
        {
            listBotones("Maritimo");
        }
        
        else if (ForCP.getRbFerreo()== e.getSource())
        {
            listBotones("Ferreo");
        }
        
    }
    /**
     * Funcion que recibe como parametro un Objeto, que lo analiza en busca de 
     * un panel, y que a los componentes existentes dentro de este les establezca 
     * un valor inicial o los reinicie para nuevas modificaciones en los datos del 
     * programa
     * @param Form 
     */
    public void limpiarCampos(Object Form)
    {
        if (Form instanceof JPanel)
        {
            JPanel For = (JPanel) Form;
            for (int i=0; i<For.getComponentCount();i++)
            {
                if(For.getComponent(i) instanceof JTextField)
                {
                    JTextField txtControl = (JTextField) For.getComponent(i);
                    txtControl.setText("");
                }
                
                if (For.getComponent(i) instanceof JSpinner)
                {
                     JSpinner spnControl = (JSpinner) For.getComponent(i);
                     if((Double.parseDouble(spnControl.getValue().toString()) >= 1900) && (Double.parseDouble(spnControl.getValue().toString()) <= 2017))
                        spnControl.setValue(1900);
                     
                     else
                         spnControl.setValue(1);
                                          
                }
                
                if (For.getComponent(i) instanceof JComboBox)
                {
                    JComboBox cmbControl = (JComboBox) For.getComponent(i);
                    cmbControl.setSelectedIndex(0);
                }
                
                if(For.getComponent(i) instanceof JRadioButton)
                {
                    JRadioButton rdbControl = (JRadioButton) For.getComponent(i);
                    rdbControl.setSelected(false);
                }
            }
        }
    }
    
    /**
     * Funcion que permite establecer el valor total de toda la operacion
     * Esto incluye el valor del impuesto y el valor de transporte del producto, 
     * mas su valor original
     * @param TMR
     * @param Impuesto
     * @param Costo
     * @param ValorProducto
     * @param Cantidad
     * @param IVA
     * @return 
     */
    public double valorTotal(double TMR, double Impuesto, double Costo, double ValorProducto, double Cantidad, String IVA) 
    {
        double ValTotal = 0, ImpuestoIVA = 0;
        
        if (IVA.equals("Automovil") == true )
            ImpuestoIVA = ValorProducto * 0.19;
        
        else if (IVA.equals("Textiles") == true )
            ImpuestoIVA = ValorProducto * 0.16;
        
        else if (IVA.equals("Calzado") == true )
            ImpuestoIVA = ValorProducto * 0.13;
        
        else if (IVA.contains("Aparatos") == true )
            ImpuestoIVA = ValorProducto * 0.9;
        
        
        ValTotal = ValorProducto + Impuesto + Costo;
        
        ValTotal = ValTotal + ImpuestoIVA;
        
        ValTotal = ValTotal / (TMR);
        
        ValTotal = ValTotal * Cantidad;
        
        return ValTotal;
    } 
    
    /**
     * Funcion que permite llenar la tabla de las empresas disponibles, en este
     * caso, que se almacenaron y se mantienen aun el programa cerrado por medio
     * de la persistencia
     * @throws IOException
     */
    public void llenarLista() throws IOException
    {
        String Arreglo [] = ObjC.leerDatos().split("\n");
        Iterator i = Arrays.asList(Arreglo).iterator();
        
        ArrayList <String> ArlS = new <String> ArrayList();
        
        while(i.hasNext())
        {
            String Datos[] = i.next().toString().split(";");
            
            if(Datos[3].contains("Aereo") == true)
            {
                ArlS.add("Aereo");
            }
            
            if(Datos[3].contains("Terrestre") == true)
            {
                 ArlS.add("Terrestre");   
            }
            
            if(Datos[3].contains("Maritimo") == true)
            {
                ArlS.add("Maritimo");            
            }
            
            if(Datos[3].contains("Ferreo") == true)
            {
                ArlS.add("Ferreo");
            }
            
            if (!Datos[0].isEmpty())
            {
                    
                   Empresa ObjE = new Empresa(
                           Datos[0],
                           Integer.parseInt(Datos[1]),
                           Datos[2], 
                           (ArrayList<String>) ArlS.clone()
                           );
                   this.ArlI.getAriE().add(ObjE);
                   ArlS.clear();
            }
        }
    }

    @Override
    public void run() {
        
        while(true)
        {
            try {
                this.Hilo.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            int hora=0, minuto=0, segundo=0;
        
            Calendar calendario = new GregorianCalendar();

            hora = calendario.get(Calendar.HOUR_OF_DAY);
            minuto = calendario.get(Calendar.MINUTE);
            segundo = calendario.get(Calendar.SECOND);

            ForMP.getLblHora().setText(String.valueOf(hora));
            ForMP.getLblMinuto().setText(String.valueOf(minuto));
            ForMP.getLblSegundo().setText(String.valueOf(segundo));
            
        }
        
    }
}

    