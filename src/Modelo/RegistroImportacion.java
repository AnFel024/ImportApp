package Modelo;

import java.util.ArrayList;

/**
 * Crea un registro mediante el cual se van a conocer los datos del producto a 
 * importar para calcular sus  respectivos impuestos
 * 
 * @author Andrés Morales
 */

public class RegistroImportacion {
    
    private Producto ObjP;
    private int CantidadP;
    private double TMR, Aduana, Costo;
    private String Origen, Direccion;
    private Empresa ObjE;
    private String MetodoEnvio;
    private double ValorTotal;

    /**
     * Constructor que permite crear un registro de importacion con valores 
     * previamente declarados.
     * 
     * @param ObjP
     * @param ValorTotal
     * @param Origen
     * @param Destino
     * @param ObjE
     * @param MetodoEnvio
     * @param 
     * @param CantidadP
     */
    public RegistroImportacion(Producto ObjP, double ValorTotal, String Origen, String Direccion, Empresa ObjE, int CantidadP, String MetodoEnvio) {
      
        this.ObjP = ObjP;
        this.Origen = Origen;
        this.Direccion = Direccion;
        this.ObjE = ObjE;
        this.MetodoEnvio = MetodoEnvio;
        this.CantidadP = CantidadP;
        this.ValorTotal = ValorTotal;
    }

    /**
     * Constructor que permite incializar los atributos del registro de 
     * importacion.
     */
    public RegistroImportacion() {
        this.ObjP = new Producto();
        this.Origen = "";
        this.Direccion = "";
        this.ObjE = new Empresa();
        this.MetodoEnvio = "";
        this.CantidadP = 0;
        this.TMR = 0;
        this.Aduana = 0;
        this.Costo = 0;
        this.ValorTotal = 0.0;
    }

    /**
     * Funcion que retorna el Producto a importar (Nombre, Tipo y Valor) del registro de importacion
     * @return
     */
    public Producto getObjP() {
        return ObjP;
    }

    /**
     * Permite establecer valores para el Producto a importar (Nombre, Tipo y Valor) del registro de importacion
     * @param ObjP
     */
    public void setObjP(Producto ObjP) {
        this.ObjP = ObjP;
    }

    /**
     * Funcion que retorna el Origen del producto a importar del registro de importacion
     * @return
     */
    public String getOrigen() {
        return Origen;
    }

    public double getTMR() {
        return TMR;
    }

    public void setTMR(double TMR) {
        this.TMR = TMR;
    }

    public double getAduana() {
        return Aduana;
    }

    public void setAduana(double Aduana) {
        this.Aduana = Aduana;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }


    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * Permite establecer valores para Origen del producto a importar del registro de importacion
     * @param Origen
     */
    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    /**
     * Funcion que retorna el Metodo de Envio empleado para dicho registro de importacion
     * @return
     */
    public Empresa getObjE() {
        return ObjE;
    }

    /**
     * Permite establecer valor para el Metodo de Envio empleado para el registro de importacion
     * @param ObjE
     */
    public void setObjE(Empresa ObjE) {
        this.ObjE = ObjE;
    }

    /**
     * Funcion que retorna la cantidad de productos a importar dentro del registro de importacion
     * @return
     */
    public int getCantidadP() {
        return CantidadP;
    }

    /**
     * Permite establecer el valor de la cantidad de productos a importar dentro del registro de importacion
     * @param CantidadP
     */
    public void setCantidadP(int CantidadP) {
        this.CantidadP = CantidadP;
    }

    /**
     * Funcion que retorna el Valor Total de toda la operacion
     * @return
     */
    public double getValorTotal() {
        return ValorTotal;
    }

    /**
     * Permite establecer el Valor Total de toda la operacion
     * @param ValorTotal
     */
    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    /**
     * Funcion que permite retornar el metodo del envio del producto desde su 
     * origen a su destino
     * @return
     */
    public String getMetodoEnvio() {
        return MetodoEnvio;
    }

    /**
     * Funcion que permite establecer el metodo del envio del producto desde su 
     * origen a su destino
     * @param MetodoEnvio
     */
    public void setMetodoEnvio(String MetodoEnvio) {
        this.MetodoEnvio = MetodoEnvio;
    }
}