package Modelo;

/**
 * Clase que establece los atributos de una ubicacion como lo son el nombre de
 * esta y su respectivo codigo
 * @author Andrés Morales
 */
public class Lugar {
    
    private String NombreLugar;
    private int CodigoLugar;

    /**
     * Constructor parametrico que permite establecer el nombre y el codigo del
     * lugar correspondiente
     * @param NombreLugar
     * @param CodigoLugar
     */
    public Lugar(String NombreLugar, int CodigoLugar) {
        this.NombreLugar = NombreLugar;
        this.CodigoLugar = CodigoLugar;
    }

    /**
     * Constructor que permite inicializar el nombre y el codigo del
     * lugar correspondiente
     */
    public Lugar() {
        this.NombreLugar = "";
        this.CodigoLugar = 0;
    }

    /**
     * Funcion que permite retornar el nombre del lugar correspondiente
     * @return
     */
    public String getNombreLugar() {
        return NombreLugar;
    }

    /**
     * Funcion que permite establecer el nombre del lugar correspondiente
     * @param NombreLugar
     */
    public void setNombreLugar(String NombreLugar) {
        this.NombreLugar = NombreLugar;
    }

    /**
     * Funcion que permite retornar el codigo del lugar correspondiente
     * @return
     */
    public int getCodigoLugar() {
        return CodigoLugar;
    }

    /**
     * Funcion que permite establecer el codigo del lugar correspondiente
     * @param CodigoLugar
     */
    public void setCodigoLugar(int CodigoLugar) {
        this.CodigoLugar = CodigoLugar;
    }
    
}
