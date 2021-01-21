package Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Observable;

/**
 * Clase que permite crear empresas que operen de intermediarios en el transporte
 * del producto
 * @author Andrés Morales
 */
public class Empresa {
    
    private String Nombre;
    private ArrayList <String> ArlM; 
    private String URLEmpresa;
    private int Telefono;
 
    /**
     * Constructor parametrico que inicializa los valores de la empresa
     * @param Nombre
     * @param ArlM
     * @param PrecioOperacion
     * @param URLEmpresa
     * @param Telefono
     */
    public Empresa(String Nombre, int Telefono, String URLEmpresa, ArrayList<String> ArlM) {
        this.Nombre = Nombre;
        this.ArlM = ArlM;
        this.URLEmpresa = URLEmpresa;
        this.Telefono = Telefono;

    }
    
    /**
     * construcotr que inicializa los artibutos de la empresa a ingresar
     */
    public Empresa() {
        this.Nombre = "";
        this.ArlM = new <String> ArrayList();
        this.URLEmpresa = "";
        this.Telefono = 0;
    }

    /**
     * Funcion que devuleve el nombre de la empresa
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Funcion que permite establecer el nombre de la empresa
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Funcion que permite retornar el arreglo de metodos de envio empleados
     * por la empresa para operar
     * @return
     */
    public ArrayList<String> getArlM() {
        return ArlM;
    }

    /**
     * Funcion que permite establecer el arreglo de metodos de envio empleados
     * por la empresa para operar
     * @param ArlM
     */
    public void setArlM(ArrayList<String> ArlM) {
        this.ArlM = ArlM;
    }

    /**
     * Funcion que permite retornar la direccion Web de la empresa en arreglo 
     * de cadena de caracteres
     * @return
     */
    public String getURLEmpresa() {
        return URLEmpresa;
    }

    /**
     * Funcion que permite establecer la direccion Web de la empresa en arreglo
     * de cadena de caraceres
     * @param URLEmpresa
     */
    public void setURLEmpresa(String URLEmpresa) {
        this.URLEmpresa = URLEmpresa;
    }

    /**
     * Funcion que permite retornar el numero de telefono de la empresa
     * @return
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * Funcion que permite establecer el numero de telefono de la empresa
     * @param Telefono
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        
        return "Empresa{" + "Nombre=" + Nombre + ", ArlM=" + ArlM + ", URLEmpresa=" + URLEmpresa + ", Telefono=" + Telefono + '}';
    }
    
    /**
     * Funcion que permite retornar los datos exitstentes de la actual empresas
     * @return
     */
    public String Datos ()
    {
        return Nombre + ";" + Telefono + ";" + URLEmpresa + ";" + listaMetodos() + "\n";
    }
    
    /**
     * Funcion que permite retornar los metodos de envio que cada empresa ofrece 
     * a sus clientes
     * @return
     */
    public String listaMetodos()
    {
        String Dato = "";
        Iterator i = Arrays.asList(this.ArlM).iterator();
        while(i.hasNext())
        {
            Dato+= i.next().toString();
        }
        return Dato;
    }
}
