package Modelo;

import java.util.ArrayList;

/**
 * Clase que permite ingresar un arreglo de empresas operadoras y usuarios que
 * utlilizaran el programa para calcular sus impuestos
 * @author Andrés
 */
public class Listado {
    
    private ArrayList <Importador> AriI;
    private ArrayList <Empresa> AriE;

    /**
     * Constructor parametrico que permite darle valores a los atributos de los
     * listados de la clase
     * @param AriI
     * @param AriE
     */
    public Listado(ArrayList<Importador> AriI, ArrayList<Empresa> AriE) {
        this.AriE = AriE;
    }
    
    /**
     * Constructor que inicializa los atributos de los listados de la clase
     */
    public Listado() {
        this.AriI = new <Importador> ArrayList();
        this.AriE = new <Empresa> ArrayList();
    }

    /**
     * Funcion que permite retornar el arreglo de usuarios del programa
     * @return
     */
    public ArrayList<Importador> getAriI() {
        return AriI;
    }

    /**
     * Funcion que permite establecer el arreglo de usuarios del programa
     * @param AriI
     */
    public void setAriI(ArrayList<Importador> AriI) {
        this.AriI = AriI;
    }

    /**
     * Funcion que permite retornar el arreglo de empresas del programa
     * @return
     */
    public ArrayList<Empresa> getAriE() {
        return AriE;
    }

    /**
     * Funcion que permite establecer el arreglo de empresas del programa
     * @param AriE
     */
    public void setAriE(ArrayList<Empresa> AriE) {
        this.AriE = AriE;
    }
    
}
