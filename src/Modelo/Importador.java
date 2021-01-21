package Modelo;

import java.util.ArrayList;

/**
 * Esta clase permite definir la naturaleza de trabajo de una persona, en este caso, 
 * Importador y sus datos minimos para poder realizar un proceso de importacion
 * @author Andrés Morales
 */
public class Importador extends Persona{
    
    private int RUT;
    private String Moneda;
    private ArrayList <RegistroImportacion> ArlR;

    /**
     * Constructor que permite establecer los datos del importador mediante 
     * unos ya declarados previamente
     * 
     * @param RUT
     * @param Moneda
     * @param ArlR
     * @param Nombre
     * @param Apellido
     * @param Edad
     * @param Direccion
     * @param Telefono
     */
    public Importador(int RUT, String Moneda, ArrayList <RegistroImportacion> ArlR, String Nombre, String Apellido, Fecha Edad, String Direccion, int Telefono) {
        super(Nombre, Apellido, Edad, Direccion, Telefono);
        this.RUT = RUT;
        this.Moneda = Moneda;
        this.ArlR = ArlR;
    }

    /**
     * Constructor que inicializa los datos del importador
     */
    public Importador() {
        super();
        this.ArlR = new <RegistroImportacion> ArrayList();
        this.RUT = 0;
        this.Moneda = "";
    }

    /**
     * Funcion que retorna el codigo de Registro Unico Tributario del importador
     * @return
     */
    public int getRUT() {
        return RUT;
    }

    /**
     * Permite establecer el codigo de Registro Unico Tributario del importador
     * @param RUT
     */
    public void setRUT(int RUT) {
        this.RUT = RUT;
    }

    /**
     * Funcion que retorna el nombre de la moneda manejada por el importador para los 
     * productos que él va a nacionalizar
     * @return
     */
    public String getMoneda() {
        return Moneda;
    }

    /**
     * Permite establecer el el nombre de la moneda manejada por el importador para los 
     * productos que él va a nacionalizar
     * @param Moneda
     */
    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    /**
     * Funcion que retorna una lista de los registros de importacion que utilizara para describir los 
     * productos (Cantidad, Tipo...) que el importador va a nacionalizar.
     * @return
     */
    public ArrayList<RegistroImportacion> getArlR() {
        return ArlR;
    }

    /**
     * Permite establecer una lista de registros de importacion que utilizara para describir los 
     * productos (Cantidad, Tipo...) que el importador va a nacionalizar.
     * @param ArlR
     */
    public void setArlR(ArrayList<RegistroImportacion> ArlR) {
        this.ArlR = ArlR;
    }

    @Override
    public String toString() {
        return "Importador{" + "RUT=" + RUT + ", Moneda=" + Moneda + ", ArlR=" + ArlR + '}';
    }

}
