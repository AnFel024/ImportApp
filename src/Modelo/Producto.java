package Modelo;

import java.util.ArrayList;

/**
 * Clase que permite describir lo necesario del producto a importar 
 * para realizar su prespectivo proceso de transporte
 * @author Andrés Morales
 */
public class Producto {
    
    private String Nombre;
    private String Tipo;
    private double Valor;
    
    /**
     * Funcion que retorna el Nombre del producto
     * 
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Permite establecer el Nombre del producto
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Funcion que retorna el Tipo de producto que se va a manejar
     * 
     * @return
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * Permite establecer el Tipo de producto a manejar
     * 
     * @param Tipo
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * Funcion que retorna el Valor en moneda utilizada por el importador
     * @return
     */
    public double getValor() {
        return Valor;
    }

    /**
     * Permite establecer el Valor en moneda utilizada por el importador
     * @param Valor
     */
    public void setValor(double Valor) {
        this.Valor = Valor;
    }
}
